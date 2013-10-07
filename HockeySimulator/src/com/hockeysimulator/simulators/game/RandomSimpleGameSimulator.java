package com.hockeysimulator.simulators.game;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.PeriodResult;
import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomSimpleScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;
import com.hockeysimulator.simulators.shots.RandomSimpleShotsOnNetSimulator;

public class RandomSimpleGameSimulator implements IGameSimulator {

	private IScoreSimulator scoreSimulator;
	private IShotsOnNetSimulator shotsSimulator;
	private PeriodResult[] periods;
	private static final int DEFAULT_NUMBER_OF_PERIODS = 3;

	public RandomSimpleGameSimulator() {
		scoreSimulator = new RandomSimpleScoreSimulator();
		shotsSimulator = new RandomSimpleShotsOnNetSimulator();
		periods = new PeriodResult[DEFAULT_NUMBER_OF_PERIODS];
	}
	
	public RandomSimpleGameSimulator(final IScoreSimulator scoreSimulator, final IShotsOnNetSimulator shotsSimulator) {
		this.scoreSimulator = scoreSimulator;
		this.shotsSimulator = shotsSimulator;
		periods = new PeriodResult[DEFAULT_NUMBER_OF_PERIODS];
	}

	@Override
	public GameResult simulate() {
		final PeriodResult periodOne = buildPeriodResult();
		final PeriodResult periodTwo = buildPeriodResult();
		final PeriodResult periodThree = buildPeriodResult();
		
		periods[0] = periodOne;
		periods[1] = periodTwo;
		periods[2] = periodThree;
		
		final GameResult game = new GameResult(periods);
		return game;
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
