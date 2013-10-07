package com.hockeysimulator.simulators.random;

import com.hockeysimulator.simulators.IMath;
import com.hockeysimulator.simulators.IRandom;
import com.hockeysimulator.simulators.SimulatorMath;
import com.hockeysimulator.simulators.SimulatorRandom;

public class RandomGaussianNumberGenerator implements
		IRandomGaussianNumberGenerator {

	private IRandom random;
	private IMath math;
	private Gaussian gaussian;

	public RandomGaussianNumberGenerator(final Gaussian gaussian) {
		random = new SimulatorRandom();
		math = new SimulatorMath();
		this.gaussian = gaussian;
	}

	@Override
	public int getRandomInteger() {
		final double doubleGaussian = random.nextGaussian();
		final double standardDeviation = gaussian.getStandardDeviation();
		final double average = gaussian.getAverage();
		final double massagedGaussian = doubleGaussian * standardDeviation
				+ average;
		final long roundedGaussian = math.round(massagedGaussian);
		final int castGaussian = (int) roundedGaussian;
		return castGaussian;
	}

}
