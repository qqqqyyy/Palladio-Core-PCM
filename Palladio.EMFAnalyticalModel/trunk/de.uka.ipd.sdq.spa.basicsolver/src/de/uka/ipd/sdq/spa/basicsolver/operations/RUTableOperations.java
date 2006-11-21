package de.uka.ipd.sdq.spa.basicsolver.operations;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import de.uka.ipd.sdq.probfunction.math.IProbabilityDensityFunction;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.IProbabilityMassFunction;
import de.uka.ipd.sdq.probfunction.math.ISamplePDF;
import de.uka.ipd.sdq.probfunction.math.IUnit;
import de.uka.ipd.sdq.probfunction.math.ManagedPDF;
import de.uka.ipd.sdq.probfunction.math.exception.ProbabilityFunctionException;
import de.uka.ipd.sdq.spa.basicsolver.exceptions.BothNullExpeception;
import de.uka.ipd.sdq.spa.resourcemodel.ActiveResource;
import de.uka.ipd.sdq.spa.resourcemodel.ProcessingResource;
import de.uka.ipd.sdq.spa.resourcemodel.ResourceUsage;


public class RUTableOperations {

	private RUOperations ruOps;

	private IProbabilityFunctionFactory pfFactory = IProbabilityFunctionFactory.eINSTANCE;

	public RUTableOperations(RUOperations ruOps) {
		super();
		this.ruOps = ruOps;
	}

	public RUTableOperations(PDFOperations pdfOps) {
		ruOps = new RUOperations(pdfOps);
	}

	public RUTableOperations(int numSamplingPoints) {
		ruOps = new RUOperations(numSamplingPoints);
	}

	public Hashtable<ProcessingResource, ManagedPDF> computeIteration(
			Hashtable<ProcessingResource, ManagedPDF> innerRUs,
			IProbabilityMassFunction iterations) {
		Hashtable<ProcessingResource, ManagedPDF> resultTable = new Hashtable<ProcessingResource, ManagedPDF>();

		try {
			for (ProcessingResource resource : innerRUs.keySet()) {
				ManagedPDF ru = ruOps.computeIteration(innerRUs
						.get(resource), iterations);
				resultTable.put(resource, ru);
			}
		} catch (ProbabilityFunctionException e) {
			e.printStackTrace();
			System.exit(1);
		}

		return resultTable;

	}

	public Hashtable<ActiveResource, ManagedPDF> getResourceUsageTimes(
			List<ResourceUsage> resourceUsageList) {

		Hashtable<ActiveResource, ManagedPDF> resultTable = new Hashtable<ActiveResource, ManagedPDF>();

		try {
			for (ResourceUsage resourceUsage : resourceUsageList) {
				ActiveResource resource = resourceUsage.getResource();
				ISamplePDF pdf = pfFactory
						.transformToSamplePDF(resourceUsage.getUsageTime());
				pdf.expand(this.ruOps.getNumSamplingPoints());
				ManagedPDF managedPDF = new ManagedPDF(pdf);
				resultTable.put(resource, managedPDF);
			}
		} catch (ProbabilityFunctionException e) {
			e.printStackTrace();
			System.exit(1);
		}

		return resultTable;
	}

	public Hashtable<ProcessingResource, ManagedPDF> computeAlternative(
			Hashtable<ProcessingResource, ManagedPDF> leftRUs,
			double leftProb,
			Hashtable<ProcessingResource, ManagedPDF> rightRUs,
			double rightProb) {

		return performOperation(BinaryOperation.ALTERNATIVE, leftRUs, leftProb,
				rightRUs, rightProb);
	}

	public Hashtable<ProcessingResource, ManagedPDF> computeParallel(
			Hashtable<ProcessingResource, ManagedPDF> leftRUs,
			Hashtable<ProcessingResource, ManagedPDF> rightRUs) {

		return performOperation(BinaryOperation.PARALLEL, leftRUs, 0, rightRUs,
				0);
	}

	public Hashtable<ProcessingResource, ManagedPDF> computeSequence(
			Hashtable<ProcessingResource, ManagedPDF> leftRUs,
			Hashtable<ProcessingResource, ManagedPDF> rightRUs) {

		return performOperation(BinaryOperation.SEQUENCE, leftRUs, 0, rightRUs,
				0);
	}

	private Hashtable<ProcessingResource, ManagedPDF> performOperation(
			BinaryOperation op,
			Hashtable<ProcessingResource, ManagedPDF> leftRUs,
			double leftProbability,
			Hashtable<ProcessingResource, ManagedPDF> rightRUs,
			double rightProbability) {

		Hashtable<ProcessingResource, ManagedPDF> resultTable = new Hashtable<ProcessingResource, ManagedPDF>();

		try {
			List<ProcessingResource> keyList = getDisjointUnion(leftRUs
					.keySet(), rightRUs.keySet());
			for (ProcessingResource resource : keyList) {
				ManagedPDF leftRU = leftRUs.get(resource);
				ManagedPDF rightRU = rightRUs.get(resource);
				ManagedPDF resultRU = performOperation(op, leftRU,
						leftProbability, rightRU, rightProbability);
				resultTable.put(resource, resultRU);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		return resultTable;
	}

	private ManagedPDF performOperation(BinaryOperation op,
			ManagedPDF leftRU, double leftProbability,
			ManagedPDF rightRU, double rightProbability) throws ProbabilityFunctionException, BothNullExpeception {
		leftRU = ensureNotNull(leftRU, rightRU);
		rightRU = ensureNotNull(rightRU, leftRU);
		return ruOps.performOperation(op, leftRU, leftProbability, rightRU,
				rightProbability);
	}

	private ManagedPDF ensureNotNull(ManagedPDF rightRU, ManagedPDF leftRU) throws BothNullExpeception {
		if (rightRU == null) {
			if (leftRU == null){
				throw new BothNullExpeception();
			} else {
				int numSamplingPoints = ruOps.getNumSamplingPoints();
				double distance = ((ISamplePDF) leftRU.getPdfFrequencyDomain()).getDistance();
				IUnit unit = leftRU.getPdfFrequencyDomain().getUnit();
				IProbabilityDensityFunction pdf = pfFactory.createDiracImpulse(numSamplingPoints, distance, unit);
				rightRU = new ManagedPDF(pdf);
			}
		}
		return rightRU;
	}

	private List<ProcessingResource> getDisjointUnion(
			Set<ProcessingResource> setOne, Set<ProcessingResource> setTwo) {
		List<ProcessingResource> resultList = new ArrayList<ProcessingResource>(
				setOne);
		for (ProcessingResource resource : setTwo) {
			if (!resultList.contains(resource)) {
				resultList.add(resource);
			}
		}
		return resultList;
	}
}
