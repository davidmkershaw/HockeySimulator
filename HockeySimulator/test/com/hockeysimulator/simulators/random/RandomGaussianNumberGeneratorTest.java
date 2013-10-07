package com.hockeysimulator.simulators.random;

import org.junit.Test;

public class RandomGaussianNumberGeneratorTest {

	@Test
	public void testGenerateRandomNumber() {
		final double average = 2.75;
		final int standardDeviation = 2;
		IRandomGaussianNumberGenerator generator = new RandomGaussianNumberGenerator(average, standardDeviation);
		for (int i = 0; i < 100; i ++){
			int generated = generator.getRandomInteger();
			System.out.println(generated);
		}
	}
	
}
