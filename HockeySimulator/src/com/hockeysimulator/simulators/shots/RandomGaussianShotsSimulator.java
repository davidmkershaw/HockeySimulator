package com.hockeysimulator.simulators.shots;

import com.hockeysimulator.simulators.random.IRandomGaussianNumberGenerator;
import com.hockeysimulator.simulators.random.RandomGaussianNumberGenerator;

public class RandomGaussianShotsSimulator implements IShotsOnNetSimulator {

	private IRandomGaussianNumberGenerator numberGenerator;
	private static final int LOWEST_NUMBER_OF_SHOTS_ALLOWED = 0;

	public RandomGaussianShotsSimulator(final double average,
			final int standardDeviation) {
		numberGenerator = new RandomGaussianNumberGenerator(average,
				standardDeviation);
	}

	public RandomGaussianShotsSimulator(final double average,
			final int standardDeviation,
			final IRandomGaussianNumberGenerator numberGenerator) {
		this.numberGenerator = numberGenerator;
	}

	@Override
	public int simulate(final int minShots) {
		int shots = numberGenerator.getRandomInteger();
		if (shots < LOWEST_NUMBER_OF_SHOTS_ALLOWED) {
			shots = LOWEST_NUMBER_OF_SHOTS_ALLOWED;
		}
		if (shots < minShots) {
			shots = minShots;
		}
		return shots;
	}

}
