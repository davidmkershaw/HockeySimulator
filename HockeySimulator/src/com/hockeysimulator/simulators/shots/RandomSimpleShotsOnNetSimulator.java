package com.hockeysimulator.simulators.shots;

import com.hockeysimulator.simulators.random.IRandomNumberGenerator;
import com.hockeysimulator.simulators.random.RandomNumberGenerator;

public class RandomSimpleShotsOnNetSimulator implements IShotsOnNetSimulator {

	private IRandomNumberGenerator numberGenerator;
	private int maxShots;
	private int minShots;
	private static int DEFAULT_MAX_SHOTS = 50;
	private static int DEFAULT_MIN_SHOTS = 8;

	public RandomSimpleShotsOnNetSimulator() {
		numberGenerator = new RandomNumberGenerator();
		maxShots = DEFAULT_MAX_SHOTS;
		minShots = DEFAULT_MIN_SHOTS;
	}

	public int simulate(final int minShots) {
		final int shots = numberGenerator.getRandomInteger(minShots, maxShots);
		return shots;
	}

}
