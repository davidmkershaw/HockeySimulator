package com.hockeysimulator.simulators.modifiers;

import com.hockeysimulator.simulators.random.Gaussian;

public interface IGaussianModifier {

	Gaussian apply(Gaussian gaussian);
}
