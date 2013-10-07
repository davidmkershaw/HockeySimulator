package com.hockeysimulator.simulators.score;

import com.hockeysimulator.simulators.random.IRandomNumberGenerator;
import com.hockeysimulator.simulators.random.RandomNumberGenerator;

public class RandomSimpleScoreSimulator implements IScoreSimulator {

	private IRandomNumberGenerator randomGenerator;
	private int maxScore;
	private static int DEFAULT_MAX = 10;

	public RandomSimpleScoreSimulator() {
		randomGenerator = new RandomNumberGenerator();
		maxScore = DEFAULT_MAX;
	}

	@Override
	public int simulate() {
		final int score = randomGenerator.getRandomInteger(maxScore);
		return score;
	}

}
