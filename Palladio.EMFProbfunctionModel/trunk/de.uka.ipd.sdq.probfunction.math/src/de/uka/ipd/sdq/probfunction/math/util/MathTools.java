package de.uka.ipd.sdq.probfunction.math.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.uka.ipd.sdq.probfunction.math.IContinuousSample;
import flanagan.complex.Complex;

/**
 * MathTools contains a set of commonly used mathematical functions, that are
 * not provided by the Java libraries.
 * 
 * @author ihssane, jens
 * 
 */
public class MathTools {

	/**
	 * Difference up to which two values are considered as equal.
	 */
	public static final double EPSILON_ERROR = 1e-10;

	/**
	 * Computes the greatest common divisor (GDC) of a set of numbers.
	 * 
	 * @param numbers
	 *            List of numbers for which the GDC shall be computed.
	 * @return Returns the greatest common divisor of all numbers
	 */
	public static double gcd(List<Double> numbers) {
		if (numbers.size() < 2)
			throw new IllegalArgumentException(
					"number of digit must be greater than 2");

		double gcd = gcd(numbers.get(0), numbers.get(1));
		for (int i = 2; i < numbers.size(); i++)
			gcd = gcd(gcd, numbers.get(i));
		return gcd;
	}

	/**
	 * Computes thre greatest common divisor (GDC) of two numbers
	 * 
	 * @param x
	 *            first number
	 * @param y
	 *            second number
	 * @return Returns the GDC of y and x.
	 */
	public static double gcd(double x, double y) {
		while (Math.abs(x - y) > 1e-10) {
			if (x > y) {
				x -= y;

			} else {
				y -= x;

			}
		}
		return x;
	}

	/**
	 * Transforms a list of complex values to a list of double values by
	 * throwing away the imaginary part.
	 * 
	 * @param values
	 *            List of complex values to transform.
	 * @return The real part of the value list as doubles.
	 */
	public static List<Double> transformComplexToDouble(List<Complex> values) {
		List<Double> resultList = new ArrayList<Double>();
		for (Complex complex : values) {
			resultList.add(complex.getReal());
		}
		return resultList;
	}

	/**
	 * Transforms a list of double values to a list of complex values. The real
	 * parts are set to the values in the list, the imaginary part is set to
	 * zero.
	 * 
	 * @param values
	 *            List of double values to transform.
	 * @return A list of complex values equivalent to the doubles.
	 */
	public static List<Complex> transformDoubleToComplex(List<Double> values) {
		List<Complex> resultList = new ArrayList<Complex>();
		for (Double d : values) {
			resultList.add(new Complex(d));
		}
		return resultList;
	}

	/**
	 * Compares two doubles.
	 * 
	 * @param d1
	 * @param d2
	 * @return True, if the difference between both values is lower than
	 *         EPSILON_ERROR; false otherwise.
	 */
	public static boolean equalsDouble(double d1, double d2) {
		return (Math.abs(d1 - d2) < EPSILON_ERROR);
	}

	/**
	 * Compute the sum of probabilities of an IContinuousSample list.
	 * 
	 * @param list
	 * @return the computed value.
	 */
	public static double sumOfCountinuousSamples(List<IContinuousSample> list) {
		double sum = 0.0;
		for (IContinuousSample s : list)
			sum += s.getProbability();
		return sum;
	}
	
	/**
	 * Compute the sum of a Double list.
	 * @param list
	 * @return the computed value.
	 */
	public static double sumOfDoubles(List<Double> list) {
		double sum = 0.0;
		for (Double d : list)
			sum += d;
		return sum;
	}

	/**
	 * @param prob
	 * @return
	 */
	public static List<Double> computeIntervalOfProb(List<Double> prob) {
		List<Double> probabilities = new ArrayList<Double>();
		probabilities.add(prob.get(0));

		for (int i = 1; i < probabilities.size(); i++)
			probabilities.add(probabilities.get(i - 1) + prob.get(i));
		return probabilities;
	}

	/**
	 * @param samples
	 * @param prob
	 * @return
	 */
	public static HashMap<Double, Line> computeLines(
			List<IContinuousSample> samples, List<Double> intervals) {
		HashMap<Double, Line> lines = new HashMap<Double, Line>();
		lines.put(intervals.get(0), new Line(0, 0, samples.get(0).getValue(),
				samples.get(0).getProbability()));

		for (int i = 1; i < intervals.size(); i++) {
			double x1 = samples.get(i - 1).getValue();
			double y1 = intervals.get(i - 1);
			double x2 = samples.get(i).getValue();
			double y2 = intervals.get(i);
			lines.put(intervals.get(i), new Line(x1, y1, x2, y2));
		}

		return lines;
	}
}
