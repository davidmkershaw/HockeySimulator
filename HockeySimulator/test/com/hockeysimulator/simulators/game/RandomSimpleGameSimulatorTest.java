package com.hockeysimulator.simulators.game;

import org.junit.Assert;
import org.junit.Test;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.game_summary.GameSummary;
import com.hockeysimulator.game_summary.GameSummaryBuilder;
import com.hockeysimulator.game_summary.IGameSummaryBuilder;
import com.hockeysimulator.simulators.random.Gaussian;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomGaussianScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;
import com.hockeysimulator.simulators.shots.RandomGaussianShotsSimulator;

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
		final double scoreStandardDeviation = 1.5;
		final double scoreAverage = 0.9;
		final double shotsStandardDeviation = 4.2;
		final double shotsAverage = 10;
		
		final Gaussian scoreGaussian = new Gaussian(scoreStandardDeviation, scoreAverage);
		final Gaussian shotsGaussian = new Gaussian(shotsStandardDeviation, shotsAverage);
		
		final IShotsOnNetSimulator shotsSimulator = new RandomGaussianShotsSimulator(shotsGaussian);
		final IScoreSimulator scoreSimulator = new RandomGaussianScoreSimulator(scoreGaussian);
		final IGameSimulator gameSimulator = new RandomSimpleGameSimulator(scoreSimulator, shotsSimulator);
		final GameResult game = gameSimulator.simulate();
		Assert.assertNotNull(game);
		System.out.println(game);
		final IGameSummaryBuilder builder = new GameSummaryBuilder();
		final GameSummary summaryOfGame = builder.build(game);
		System.out.println(summaryOfGame);
	}
	
}
