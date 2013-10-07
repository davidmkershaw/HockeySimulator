package com.hockeysimulator.simulators;

public class SimulatorMath implements IMath {

	@Override
	public long round(final double num) {
		return Math.round(num);
	}

}
