package com.hockeysimulator.simulators.game;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.score.RandomSimpleScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;
import com.hockeysimulator.simulators.shots.RandomSimpleShotsOnNetSimulator;

public class RandomSimpleGameSimulator implements IGameSimulator {

	private IScoreSimulator scoreSimulator;
	private IShotsOnNetSimulator shotsSimulator;

	public RandomSimpleGameSimulator() {
		scoreSimulator = new RandomSimpleScoreSimulator();
		shotsSimulator = new RandomSimpleShotsOnNetSimulator();
	}
	
	public RandomSimpleGameSimulator(final IScoreSimulator scoreSimulator, final IShotsOnNetSimulator shotsSimulator) {
		this.scoreSimulator = scoreSimulator;
		this.shotsSimulator = shotsSimulator;
	}

	@Override
	public GameResult simulate() {
		final Score score = buildScore();
		final ShotsOnNet shots = buildShots(score);
		final GameResult game = new GameResult(score, shots);
		return game;

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
