package com.hockeysimulator.simulators.modifiers;

import com.hockeysimulator.simulators.random.Gaussian;

public class SimpleGaussianModifier implements IGaussianModifier {

	private double standardDeviationModifier;
	private double averageModifier;

	public SimpleGaussianModifier(double standardDeviationModifier,
			double averageModifier) {
		this.standardDeviationModifier = standardDeviationModifier;
		this.averageModifier = averageModifier;
	}

	@Override
	public Gaussian apply(final Gaussian gaussian) {
		double standardDeviation = gaussian.getStandardDeviation();
		double average = gaussian.getAverage();
		standardDeviation *= standardDeviationModifier;
		average *= averageModifier;
		final Gaussian returnGaussian = new Gaussian (standardDeviation, average);
		return returnGaussian;
	}

}
