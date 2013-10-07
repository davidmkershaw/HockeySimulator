package com.hockeysimulator.simulators.game;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.hockeysimulator.game_summary.GameSummary;
import com.hockeysimulator.game_summary.GameSummaryBuilder;
import com.hockeysimulator.game_summary.IGameSummaryBuilder;
import com.hockeysimulator.results.GameResult;
import com.hockeysimulator.simulators.IResultBuilder;
import com.hockeysimulator.simulators.ISimulator;
import com.hockeysimulator.simulators.period.IPeriodSimulationContext;
import com.hockeysimulator.simulators.period.PeriodResultBuilder;
import com.hockeysimulator.simulators.period.PeriodSimulationContext;
import com.hockeysimulator.simulators.period.PeriodSimulatorType;
import com.hockeysimulator.simulators.random.Gaussian;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomGaussianScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;
import com.hockeysimulator.simulators.shots.RandomGaussianShotsSimulator;

public class RandomSimpleGameSimulatorTest {
	
	@Test
	public void simulateSimpleRandomGaussianGame() {
		final double scoreStandardDeviation = 1.5;
		final double scoreAverage = 0.9;
		final double shotsStandardDeviation = 4.2;
		final double shotsAverage = 10;
		
		Gaussian scoreGaussian = new Gaussian(scoreStandardDeviation, scoreAverage);
		final Gaussian shotsGaussian = new Gaussian(shotsStandardDeviation, shotsAverage);
		
		final IShotsOnNetSimulator shotsSimulator = new RandomGaussianShotsSimulator(shotsGaussian);
		final IScoreSimulator scoreSimulator = new RandomGaussianScoreSimulator(scoreGaussian);
		
		final Map<PeriodSimulatorType, ISimulator> periodContext = new HashMap<PeriodSimulatorType, ISimulator>();
		periodContext.put(PeriodSimulatorType.SCORE, scoreSimulator);
		periodContext.put(PeriodSimulatorType.SHOTS_ON_NET, shotsSimulator);
		final IPeriodSimulationContext periodSimulationContext = new PeriodSimulationContext(periodContext);

		final IResultBuilder periodResultBuilder = new PeriodResultBuilder(periodSimulationContext);
		
		final IGameSimulator gameSimulator = new RandomSimpleGameSimulator(periodResultBuilder);
		final GameResult game = gameSimulator.simulate();
		Assert.assertNotNull(game);
		System.out.println(game);
		final IGameSummaryBuilder builder = new GameSummaryBuilder();
		final GameSummary summaryOfGame = builder.build(game);
		System.out.println(summaryOfGame);
	}
	
}
