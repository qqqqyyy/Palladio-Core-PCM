/**
 * Opt4J is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Opt4J is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Opt4J. If not, see http://www.gnu.org/licenses/. 
 */
package org.opt4j.config.visualization;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;

import org.opt4j.config.ExecutionEnvironment;
import org.opt4j.config.Task;
import org.opt4j.config.TaskListener;
import org.opt4j.viewer.DelayTask;

import com.google.inject.Inject;

/**
 * The {@code DefaultTasksPanel} extends the {@code TasksPanel} and shows all
 * {@code Task}s in a table.
 * 
 * @author lukasiewycz
 * 
 */
@SuppressWarnings("serial")
public class DefaultTasksPanel extends TasksPanel implements TaskListener {

	protected final ExecutionEnvironment executionEnvironment;

	protected final Format format;

	protected JTable table;

	protected JScrollPane scroll;

	protected DelayTask delay = new DelayTask(40);

	/**
	 * The {@code Table}.
	 */
	protected class Table extends JTable {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * javax.swing.JTable#prepareRenderer(javax.swing.table.TableCellRenderer
		 * , int, int)
		 */
		@Override
		public Component prepareRenderer(TableCellRenderer renderer, int row,
				int column) {
			Component c = super.prepareRenderer(renderer, row, column);
			Task task = executionEnvironment.getTasks().get(row);
			if (task.getException() == null) {
				c.setForeground(Color.BLACK);
			} else {
				c.setForeground(Color.RED);
			}

			if (c instanceof JComponent) {
				JComponent jc = (JComponent) c;
				jc.setBorder(BorderFactory.createEmptyBorder(0, 3, 0, 0));

				char[] chars = this.getValueAt(row, column).toString()
						.toCharArray();
				int length = jc.getFontMetrics(jc.getFont()).charsWidth(chars,
						0, chars.length);
				if (this.getColumnModel().getColumn(column).getWidth() < length) {
					jc.setToolTipText(format.formatTooltip(this.getValueAt(row,
							column).toString()));
				} else {
					jc.setToolTipText(null);
				}
			}

			return c;
		}

	}

	/**
	 * The {@code Model}.
	 */
	protected class Model extends AbstractTableModel {

		public int getColumnCount() {
			return 2;
		}

		public int getRowCount() {
			return executionEnvironment.getTasks().size();
		}

		public Object getValueAt(int row, int column) {
			Task task = executionEnvironment.getTasks().get(row);
			if (column == 0) {
				return row + " " + task.toString();
			} else if (column == 1) {
				if (task.getException() != null) {
					return "EXCEPTION: \n" + task.getException();
				}
				return task.getState();
			}
			return null;
		}

		protected String[] columnNames = { "Task", "State" };

		@Override
		public String getColumnName(int i) {
			return columnNames[i];
		}
	}

	/**
	 * Constructs a {@code DefaultTasksPanel}.
	 * 
	 * @param executionEnvironment
	 *            the execution environment
	 * @param format
	 *            the format informations
	 */
	@Inject
	public DefaultTasksPanel(ExecutionEnvironment executionEnvironment,
			Format format) {
		super();
		this.executionEnvironment = executionEnvironment;
		this.format = format;
	}

	/**
	 * Registers a listener at the execution environment.
	 */
	@Inject
	public void init() {
		executionEnvironment.addListener(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opt4j.conf.gui.Startupable#startup()
	 */
	public void startup() {
		this.setLayout(new BorderLayout());

		AbstractTableModel model = getModel();
		table = getTable();
		table.setModel(model);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(500);

		scroll = new JScrollPane(table,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		this.add(scroll, BorderLayout.CENTER);
	}

	/**
	 * Returns the instance of the table.
	 * 
	 * @return the table
	 */
	protected JTable getTable() {
		return new Table();
	}

	/**
	 * Returns the instance of the model.
	 * 
	 * @return the model
	 */
	protected AbstractTableModel getModel() {
		return new Model();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opt4j.config.TaskListener#added(org.opt4j.config.Task)
	 */
	public void added(Task task) {
		table.revalidate();
		table.repaint();
		SwingUtilities.invokeLater(new Runnable() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Runnable#run()
			 */
			public void run() {
				scroll.getVerticalScrollBar().setValue(
						table.getRowCount() * 120);
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.opt4j.config.TaskStateListener#stateChanged(org.opt4j.config.Task)
	 */
	public void stateChanged(Task task) {
		delay.execute(new Runnable() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Runnable#run()
			 */
			@Override
			public void run() {
				table.revalidate();
				table.repaint();
			}
		});
	}
}
