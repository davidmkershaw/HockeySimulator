package com.hockeysimulator.simulators.period;

import org.junit.Assert;
import org.junit.Test;

import com.hockeysimulator.PeriodResult;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomGaussianScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;
import com.hockeysimulator.simulators.shots.RandomSimpleShotsOnNetSimulator;

public class RandomSimplePeriodSimulatorTest {
	
	@Test
	public void simulateSimpleRandomGaussianPeriod() {
		final int standardDeviation = 1;
		final double average = 0.9;
		final IShotsOnNetSimulator shotsSimulator = new RandomSimpleShotsOnNetSimulator();
		final IScoreSimulator scoreSimulator = new RandomGaussianScoreSimulator(average, standardDeviation);
		final IPeriodSimulator periodSimulator = new RandomSimplePeriodSimulator(scoreSimulator, shotsSimulator);
		final PeriodResult period = periodSimulator.simulate();
		Assert.assertNotNull(period);
		System.out.println(period);
	}
	
}
