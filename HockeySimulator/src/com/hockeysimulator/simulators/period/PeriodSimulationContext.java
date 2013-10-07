package com.hockeysimulator.simulators.period;

import java.util.Map;

import com.hockeysimulator.simulators.ISimulator;
import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;

public class PeriodSimulationContext implements IPeriodSimulationContext {

	private Map<PeriodSimulatorType, ISimulator> simulationContext;

	public PeriodSimulationContext(Map<PeriodSimulatorType, ISimulator> simulationContext) {
		this.simulationContext = simulationContext;
	}

	@Override
	public IScoreSimulator getScoreSimulator() {
		ISimulator scoreSimulator = simulationContext.get(PeriodSimulatorType.SCORE);
		return (IScoreSimulator) scoreSimulator;
	}

	@Override
	public IShotsOnNetSimulator getShotsOnNetSimulator() {
		ISimulator shotsSimulator = simulationContext.get(PeriodSimulatorType.SHOTS_ON_NET);
		return (IShotsOnNetSimulator) shotsSimulator;
	}

}
