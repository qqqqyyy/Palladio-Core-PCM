package org.somox.metrics;

import java.util.List;

import org.eclipse.emf.query.conditions.booleans.BooleanCondition;
import org.eclipse.emf.query.conditions.eobjects.structuralfeatures.EObjectAttributeValueCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;

import de.fzi.gast.core.ModelElement;
import de.fzi.gast.core.Root;
import de.fzi.gast.types.typesPackage;

public class Abstractness {
	public static double compute (Root root, List<ModelElement> elements1, List<ModelElement> elements2) {
		double abstractness = 0.0;
		double abstractClasses = 0.0;
		double totalClasses = 0.0;

		EObjectAttributeValueCondition abstractCondition = new EObjectAttributeValueCondition(typesPackage.eINSTANCE.getMember_Abstract(), new BooleanCondition(true));
		EObjectAttributeValueCondition interfaceCondition = new EObjectAttributeValueCondition(typesPackage.eINSTANCE.getGASTClass_Interface(), new BooleanCondition(true));
		SELECT abstractnessQuery = new SELECT(new FROM(elements1), new WHERE(abstractCondition.OR(interfaceCondition)));

		IQueryResult result = abstractnessQuery.execute();
		
		abstractClasses = result.size();
		totalClasses = elements1.size();

		abstractnessQuery = new SELECT(new FROM(elements2), new WHERE(abstractCondition.OR(interfaceCondition)));

		result = abstractnessQuery.execute();
		abstractClasses += result.size();
		totalClasses += elements2.size();
		
		abstractness = abstractClasses/totalClasses;

		return abstractness;
	}
}