package com.hockeysimulator.simulators.game;

import org.junit.Assert;
import org.junit.Test;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.simulators.game.IGameSimulator;
import com.hockeysimulator.simulators.game.RandomSimpleGameSimulator;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomGaussianScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;
import com.hockeysimulator.simulators.shots.RandomSimpleShotsOnNetSimulator;

public class RandomSimpleGameSimulatorTest {

	@Test
	public void simulateSimpleRandomGame() {
		final IGameSimulator gameSimulator = new RandomSimpleGameSimulator();
		final GameResult game = gameSimulator.simulate();
		Assert.assertNotNull(game);
		System.out.println(game);
	}
	
	@Test
	public void simulateSimpleRandomGaussianGame() {
		final int standardDeviation = 2;
		final double average = 2.75;
		final IShotsOnNetSimulator shotsSimulator = new RandomSimpleShotsOnNetSimulator();
		final IScoreSimulator scoreSimulator = new RandomGaussianScoreSimulator(average, standardDeviation);
		final IGameSimulator gameSimulator = new RandomSimpleGameSimulator(scoreSimulator, shotsSimulator);
		final GameResult game = gameSimulator.simulate();
		Assert.assertNotNull(game);
		System.out.println(game);
	}
	
}
