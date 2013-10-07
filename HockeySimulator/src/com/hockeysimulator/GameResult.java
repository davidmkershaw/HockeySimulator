package com.hockeysimulator;

import java.util.Arrays;

public class GameResult {
	
	private PeriodResult[] periodResults;

	public GameResult(PeriodResult[] periodResult) {
		this.periodResults = periodResult;
	}
	
	public PeriodResult[] getPeriodResults() {
		return periodResults;
	}

	public void setPeriodResults(PeriodResult[] periodResults) {
		this.periodResults = periodResults;
	}
	
	@Override
	public String toString() {
		return "GameResult [periodResult=" + Arrays.toString(periodResults)
				+ "]";
	}	
	

	
}
