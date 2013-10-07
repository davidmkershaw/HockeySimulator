package com.hockeysimulator.simulators.random;

import com.hockeysimulator.simulators.IRandom;
import com.hockeysimulator.simulators.SimulatorRandom;

public class RandomNumberGenerator implements IRandomNumberGenerator {

	private IRandom random;

	public RandomNumberGenerator() {
		random = new SimulatorRandom();
	}

	public RandomNumberGenerator(final IRandom aRandom) {
		random = aRandom;
	}

	@Override
	public int getRandomInteger(final int max) {
		final int i = random.nextInt(max);
		return i;
	}

	@Override
	public int getRandomInteger(final int min, final int max) {
		final int i = random.nextInt(max - min) + min;
		return i;

	}
	
	

}
