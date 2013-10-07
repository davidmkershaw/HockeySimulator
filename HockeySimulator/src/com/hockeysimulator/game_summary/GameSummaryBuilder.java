package com.hockeysimulator.game_summary;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.PeriodResult;
import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;

public class GameSummaryBuilder implements IGameSummaryBuilder {

	@Override
	public GameSummary build(final GameResult gameResult) {
		final PeriodResult[] periodResults = gameResult.getPeriodResults();
		final Score score = buildScore(periodResults);
		final ShotsOnNet shotsOnNet = buildShots(periodResults);
		final GameSummary gameSummary = new GameSummary(shotsOnNet, score);
		return gameSummary;

	}

	private Score buildScore(final PeriodResult[] periodResults) {
		final int numberOfPeriods = periodResults.length;
		int homeGoals = 0;
		int awayGoals = 0;
		for (int i = 0; i < numberOfPeriods; i++) {
			final Score score = periodResults[i].getScore();
			homeGoals += score.getHomeNumberOfGoals();
			awayGoals += score.getVisitorNumberOfGoals();
		}
		final Score score = new Score(awayGoals, homeGoals);
		return score;
	}

	private ShotsOnNet buildShots(final PeriodResult[] periodResults) {
		final int numberOfPeriods = periodResults.length;
		int homeShots = 0;
		int awayShots = 0;
		for (int i = 0; i < numberOfPeriods; i++) {
			final ShotsOnNet shots = periodResults[i].getShotsOnNet();
			homeShots += shots.getHomeShotsOnNet();
			awayShots += shots.getVistorShotsOnNet();
		}
		final ShotsOnNet shots = new ShotsOnNet(awayShots, homeShots);
		return shots;
	}
}
