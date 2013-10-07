package com.hockeysimulator.simulators.random;

public class Gaussian {

	private double standardDeviation;
	private double average;

	public Gaussian(double standardDeviation, double average) {
		this.standardDeviation = standardDeviation;
		this.average = average;
	}

	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

}
