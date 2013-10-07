package com.hockeysimulator.simulators.game;

import com.hockeysimulator.results.GameResult;
import com.hockeysimulator.results.IResult;
import com.hockeysimulator.results.PeriodResult;
import com.hockeysimulator.simulators.IResultBuilder;

public class RandomSimpleGameSimulator implements IGameSimulator {

	private IResultBuilder resultBuilder;
	private IResult[] periods;
	private static final int DEFAULT_NUMBER_OF_PERIODS = 3;
	
	public RandomSimpleGameSimulator(final IResultBuilder resultBuilder) {
		this.resultBuilder = resultBuilder;
		periods = new PeriodResult[DEFAULT_NUMBER_OF_PERIODS];
	}

	@Override
	public GameResult simulate() {
		final IResult periodOne = resultBuilder.build();
		final IResult periodTwo = resultBuilder.build();
		final IResult periodThree = resultBuilder.build();
		
		periods[0] = periodOne;
		periods[1] = periodTwo;
		periods[2] = periodThree;
		
		final GameResult game = new GameResult(periods);
		return game;
	}

}
