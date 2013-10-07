package com.hockeysimulator.game_summary;

import com.hockeysimulator.results.GameResult;

public interface IGameSummaryBuilder {

	GameSummary build(GameResult gameResult);
	
}
