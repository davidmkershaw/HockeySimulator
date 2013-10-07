package com.hockeysimulator.simulators.game;

import com.hockeysimulator.results.GameResult;
import com.hockeysimulator.simulators.ISimulator;

public interface IGameSimulator extends ISimulator {

	GameResult simulate();
	
}
