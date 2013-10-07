package com.hockeysimulator.simulators.score;

import com.hockeysimulator.simulators.random.IRandomGaussianNumberGenerator;
import com.hockeysimulator.simulators.random.RandomGaussianNumberGenerator;

public class RandomGaussianScoreSimulator implements IScoreSimulator {

	private IRandomGaussianNumberGenerator randomNumberGenerator;
	private static final int LOWEST_NUMBER_OF_GOALS_ALLOWED = 0;
	
	
	public RandomGaussianScoreSimulator(final double average, final int standardDeviation) {
		randomNumberGenerator = new RandomGaussianNumberGenerator(average, standardDeviation);
	}
	
	@Override
	public int simulate() {
		int score = randomNumberGenerator.getRandomInteger();
		if (score < LOWEST_NUMBER_OF_GOALS_ALLOWED) {
			score = LOWEST_NUMBER_OF_GOALS_ALLOWED;
		}
		return score;
	}		
}
