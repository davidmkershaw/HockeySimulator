package com.hockeysimulator.simulators.score;

import com.hockeysimulator.simulators.random.Gaussian;
import com.hockeysimulator.simulators.random.IRandomGaussianNumberGenerator;
import com.hockeysimulator.simulators.random.RandomGaussianNumberGenerator;

public class RandomGaussianScoreSimulator implements IScoreSimulator {

	private IRandomGaussianNumberGenerator randomNumberGenerator;
	private static final int LOWEST_NUMBER_OF_GOALS_ALLOWED = 0;
	
	
	public RandomGaussianScoreSimulator(final Gaussian gaussian) {
		randomNumberGenerator = new RandomGaussianNumberGenerator(gaussian);
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
