package com.hockeysimulator.simulators.period;

import com.hockeysimulator.simulators.score.IScoreSimulator;
import com.hockeysimulator.simulators.shots.IShotsOnNetSimulator;

public interface IPeriodSimulationContext {

	IScoreSimulator getScoreSimulator();
	IShotsOnNetSimulator getShotsOnNetSimulator();
	
}
