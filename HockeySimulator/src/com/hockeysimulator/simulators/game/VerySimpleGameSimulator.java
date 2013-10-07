package com.hockeysimulator.simulators.game;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.Score;

public class VerySimpleGameSimulator implements IGameSimulator {

	@Override
	public GameResult simulate() {
		final int vistorGoals = 2;
		final int homeGoals = 5;
		final Score score = new Score(vistorGoals, homeGoals);
		final GameResult game = new GameResult(score, null);
		return game;
	}

}
