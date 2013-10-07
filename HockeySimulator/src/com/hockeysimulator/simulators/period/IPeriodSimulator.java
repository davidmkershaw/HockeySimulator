package com.hockeysimulator.simulators.period;

import com.hockeysimulator.results.PeriodResult;
import com.hockeysimulator.simulators.ISimulator;

public interface IPeriodSimulator extends ISimulator {

	PeriodResult simulate();
	
}
