package com.hockeysimulator.simulators.period;

import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;
import com.hockeysimulator.results.IResult;
import com.hockeysimulator.results.PeriodResult;
import com.hockeysimulator.simulators.IResultBuilder;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;

public class PeriodResultBuilder implements IResultBuilder {

	private IScoreSimulator scoreSimulator;
	private IShotsOnNetSimulator shotsSimulator;
	
	public PeriodResultBuilder(final IPeriodSimulationContext simulationContext) {
		scoreSimulator = simulationContext.getScoreSimulator();
		shotsSimulator = simulationContext.getShotsOnNetSimulator();
	}
	
	@Override
	public IResult build() {
		final PeriodResult result = buildPeriodResult();
		return result;
	}
	
	private PeriodResult buildPeriodResult() {
		final Score score = buildScore();
		final ShotsOnNet shots = buildShots(score);
		final PeriodResult periodResult = new PeriodResult (score, shots);
		return periodResult;
	}
	
	private Score buildScore() {
		final int homeScore = scoreSimulator.simulate();
		final int awayScore = scoreSimulator.simulate();
		final Score score = new Score(awayScore, homeScore);
		return score;
	}

	private ShotsOnNet buildShots(final Score score) {
		final int homeScore = score.getHomeNumberOfGoals();
		final int awayScore = score.getVisitorNumberOfGoals();
		final int homeShots = shotsSimulator.simulate(homeScore);
		final int awayShots = shotsSimulator.simulate(awayScore);
		final ShotsOnNet shots = new ShotsOnNet(awayShots, homeShots);
		return shots;
	}

}
