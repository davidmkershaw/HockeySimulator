package com.hockeysimulator.simulators.shots;

import junit.framework.Assert;

import org.junit.Test;
import static org.mockito.Mockito.*;

import com.hockeysimulator.simulators.random.IRandomGaussianNumberGenerator;

public class RandomGaussianShotsSimulatorTest {

	@Test
	public void testMinNumberOfShotsWithNoGoalsScore() {
		final double average = 10;
		final int standardDeviation = 2;
		final int numberOfGoalsScored = 0;
		final int expectedShots = 0;
		final int numberOfShotsGenerated = 0;
		IRandomGaussianNumberGenerator mockedNumberGenerator = mock(IRandomGaussianNumberGenerator.class);
		when(mockedNumberGenerator.getRandomInteger()).thenReturn(numberOfShotsGenerated);
		final IShotsOnNetSimulator shotsSimulator = new RandomGaussianShotsSimulator(average, standardDeviation, mockedNumberGenerator);
		final int actualShots = shotsSimulator.simulate(numberOfGoalsScored);
		Assert.assertEquals(expectedShots, actualShots);
	}
	
	@Test
	public void testMinNumberOfShotsWithGoalsScore() {
		final double average = 10;
		final int standardDeviation = 2;
		final int numberOfGoalsScored = 5;
		final int expectedShots = 5;
		final int numberOfShotsGenerated = 0;
		IRandomGaussianNumberGenerator mockedNumberGenerator = mock(IRandomGaussianNumberGenerator.class);
		when(mockedNumberGenerator.getRandomInteger()).thenReturn(numberOfShotsGenerated);
		final IShotsOnNetSimulator shotsSimulator = new RandomGaussianShotsSimulator(average, standardDeviation, mockedNumberGenerator);
		final int actualShots = shotsSimulator.simulate(numberOfGoalsScored);
		Assert.assertEquals(expectedShots, actualShots);
	}
	
}
