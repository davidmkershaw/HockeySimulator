package com.hockeysimulator.simulators.period;

import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;
import com.hockeysimulator.results.PeriodResult;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;

public class RandomSimplePeriodSimulator implements IPeriodSimulator {

	private IScoreSimulator scoreSimulator;
	private IShotsOnNetSimulator shotsSimulator;

	public RandomSimplePeriodSimulator(IScoreSimulator scoreSimulator,
			IShotsOnNetSimulator shotsSimulator) {
		this.scoreSimulator = scoreSimulator;
		this.shotsSimulator = shotsSimulator;
	}

	@Override
	public PeriodResult simulate() {
		final Score score = buildScore();
		final ShotsOnNet shots = buildShots(score);
		final PeriodResult periodResult = new PeriodResult(score, shots);
		return periodResult;
	}

	private Score buildScore() {
		final int homeScore = scoreSimulator.simulate();
		final int awayScore = scoreSimulator.simulate();
		final Score score = new Score(awayScore, homeScore);
		return score;
	}

	private ShotsOnNet buildShots(final Score score) {
		final int homeGoals = score.getHomeNumberOfGoals();
		final int awayGoals = score.getVisitorNumberOfGoals();
		final int homeShots = shotsSimulator.simulate(homeGoals);
		final int awayShots = shotsSimulator.simulate(awayGoals);
		final ShotsOnNet shots = new ShotsOnNet(awayShots, homeShots);
		return shots;
	}

}
