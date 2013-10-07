package com.hockeysimulator;

public class GameResult {
	
	private Score score;
	private ShotsOnNet shotsOnNet;

	public GameResult(final Score score, final ShotsOnNet shotsOnNet) {
		this.score = score;
		this.shotsOnNet = shotsOnNet;
	}

	@Override
	public String toString() {
		return "GameResult [score=" + score + ", shotsOnNet=" + shotsOnNet
				+ "]";
	}


	
}
