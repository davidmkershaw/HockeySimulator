package com.hockeysimulator.results;

import com.hockeysimulator.Score;
import com.hockeysimulator.ShotsOnNet;


public class PeriodResult implements IResult {

	private Score score;
	private ShotsOnNet shotsOnNet;

	public PeriodResult(Score score, ShotsOnNet shotsOnNet) {
		this.score = score;
		this.shotsOnNet = shotsOnNet;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public ShotsOnNet getShotsOnNet() {
		return shotsOnNet;
	}

	public void setShotsOnNet(ShotsOnNet shotsOnNet) {
		this.shotsOnNet = shotsOnNet;
	}

	@Override
	public String toString() {
		return "PeriodResult [score=" + score + ", shotsOnNet=" + shotsOnNet
				+ "]";
	}

}
