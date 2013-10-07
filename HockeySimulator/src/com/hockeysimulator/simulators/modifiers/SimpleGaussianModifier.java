package com.hockeysimulator.simulators.modifiers;

public class SimpleGaussianModifier implements IGaussianModifier {

	private double standardDeviationModifier;
	private double averageModifier;

	public SimpleGaussianModifier(double standardDeviationModifier,
			double averageModifier) {
		this.standardDeviationModifier = standardDeviationModifier;
		this.averageModifier = averageModifier;
	}

	@Override
	public double getStandardDeviationModifier() {
		return standardDeviationModifier;
	}

	public void setStandardDeviationModifier(double standardDeviationModifier) {
		this.standardDeviationModifier = standardDeviationModifier;
	}

	@Override
	public double getAverageModifier() {
		return averageModifier;
	}

	public void setAverageModifier(double averageModifier) {
		this.averageModifier = averageModifier;
	}

}
