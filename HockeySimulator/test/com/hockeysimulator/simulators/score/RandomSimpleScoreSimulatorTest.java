package com.hockeysimulator.simulators.score;

import junit.framework.Assert;

import org.junit.Test;

import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomSimpleScoreSimulator;

public class RandomSimpleScoreSimulatorTest {

	@Test
	public void testReturnsAnInt(){
		IScoreSimulator simulator = new RandomSimpleScoreSimulator();
		final int goals = simulator.simulate();
		Assert.assertTrue(goals > 0);
	}
	
}
