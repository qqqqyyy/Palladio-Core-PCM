package de.uka.ipd.sdq.workflow.launchconfig.logging;

import java.util.ArrayList;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;


/**
 * An implementation of a Log4J appender which generates events and forwards them to registered
 * listeners instead of taking the storing of the log messages themselves.
 * @author Steffen
 *
 */
public class StreamsProxyAppender extends AppenderSkeleton {

	/**
	 * Set of listeners interested in new log lines arriving at this log appender 
	 */
	private ArrayList<IAppenderListener> appenderListener = new ArrayList<IAppenderListener>();
	private ClassLoader myClassloader;
	
	/**
	 * Constructor
	 */
	public StreamsProxyAppender() {
		super();
		this.myClassloader = Thread.currentThread().getContextClassLoader();
		this.addFilter(new Filter(){

			public int decide(LoggingEvent logEvent) {
				if (StreamsProxyAppender.this.myClassloader == Thread.currentThread().getContextClassLoader())
					return Filter.ACCEPT;
				return Filter.DENY;
			}
			
		});
	}
	
	/* (non-Javadoc)
	 * @see org.apache.log4j.AppenderSkeleton#append(org.apache.log4j.spi.LoggingEvent)
	 */
	protected void append(LoggingEvent event) {
		String logLine = this.getLayout().format(event);
		for (IAppenderListener l : appenderListener) {
			l.textAddedEvent(logLine,event.getLevel());
			ThrowableInformation throwableInfo = event.getThrowableInformation();
			if (throwableInfo != null) {
				for (String m : throwableInfo.getThrowableStrRep()) {
					l.textAddedEvent(m + "\n", event.getLevel());
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.apache.log4j.AppenderSkeleton#close()
	 */
	public void close() {
		// Not required...
	}

	/* (non-Javadoc)
	 * @see org.apache.log4j.AppenderSkeleton#requiresLayout()
	 */
	public boolean requiresLayout() {
		return true;
	}

	/**
	 * Add a new listener to this appender which is interested in events generated by newly arriving 
	 * messages
	 * @param listener
	 */
	public void addAppenderListener(IAppenderListener listener) {
		this.appenderListener.add(listener);
	}

	/**
	 * Remove the given listener
	 * @param listener
	 */
	public void removeAppenderListener(IAppenderListener listener) {
		this.appenderListener.remove(listener);
	}
	
}
