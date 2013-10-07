package com.hockeysimulator.game_summary;

import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;

public class GameSummary {

	private ShotsOnNet shotsOnNet;
	private Score score;

	public GameSummary(ShotsOnNet shotsOnNet, Score score) {
		this.shotsOnNet = shotsOnNet;
		this.score = score;
	}

	public ShotsOnNet getShotsOnNet() {
		return shotsOnNet;
	}

	public void setShotsOnNet(ShotsOnNet shotsOnNet) {
		this.shotsOnNet = shotsOnNet;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "GameSummary [shotsOnNet=" + shotsOnNet + ", score=" + score
				+ "]";
	}

}
