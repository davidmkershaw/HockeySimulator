package com.hockeysimulator.simulators;

import java.util.Random;

public class SimulatorRandom implements IRandom {

	private Random random;

	public SimulatorRandom() {
		random = new Random();
	}

	@Override
	public double nextGaussian() {
		final double gaussian = random.nextGaussian();
		return gaussian;
	}

	@Override
	public int nextInt(int max) {
		final int nextInt = random.nextInt(max);
		return nextInt;
	}

}
