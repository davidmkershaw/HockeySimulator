package com.hockeysimulator.game_summary;

import com.hockeysimulator.GameResult;

public interface IGameSummaryBuilder {

	GameSummary build(GameResult gameResult);
	
}
