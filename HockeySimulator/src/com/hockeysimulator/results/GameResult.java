package com.hockeysimulator.results;

import java.util.Arrays;


public class GameResult implements IResult {
	
	private IResult[] periodResults;

	public GameResult(IResult[] periodResult) {
		this.periodResults = periodResult;
	}
	
	public IResult[] getPeriodResults() {
		return periodResults;
	}

	public void setPeriodResults(IResult[] periodResults) {
		this.periodResults = periodResults;
	}
	
	@Override
	public String toString() {
		return "GameResult [periodResult=" + Arrays.toString(periodResults)
				+ "]";
	}	
	
}
