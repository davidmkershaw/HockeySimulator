package com.hockeysimulator.simulators.random;

import org.junit.Test;

public class RandomGaussianNumberGeneratorTest {

	@Test
	public void testGenerateRandomNumber() {
		final double average = 2.75;
		final int standardDeviation = 2;
		final Gaussian gaussian = new Gaussian(standardDeviation, average);
		IRandomGaussianNumberGenerator generator = new RandomGaussianNumberGenerator(gaussian);
	    int max = 0;
		for (int i = 0; i < 82; i ++){
			int generated = generator.getRandomInteger();
			if (generated > max) {
				System.out.println(generated);
				max = generated;
			}
		}
	}
	
}
