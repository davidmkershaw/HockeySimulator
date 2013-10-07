package com.hockeysimulator.simulators.random;

import com.hockeysimulator.simulators.IMath;
import com.hockeysimulator.simulators.IRandom;
import com.hockeysimulator.simulators.SimulatorMath;
import com.hockeysimulator.simulators.SimulatorRandom;

public class RandomGaussianNumberGenerator implements IRandomGaussianNumberGenerator {

	private IRandom random;
	private IMath math;
	private double average;
	private int standardDeviation;
	
	public RandomGaussianNumberGenerator(final double average, final int standardDeviation) {
		random = new SimulatorRandom();
		math = new SimulatorMath();
		this.average = average;
		this.standardDeviation = standardDeviation;
	}
	
	@Override
	public int getRandomInteger() {
		final Double doubleGaussian = random.nextGaussian();
		final Double massagedGaussian = doubleGaussian * standardDeviation + average;
		final long roundedGaussian = math.round(massagedGaussian);
		final int castGaussian = (int) roundedGaussian;
		return castGaussian;
	}

}
