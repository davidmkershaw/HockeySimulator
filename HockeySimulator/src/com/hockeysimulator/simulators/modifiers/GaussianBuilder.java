package com.hockeysimulator.simulators.modifiers;

import java.util.List;

import com.hockeysimulator.simulators.random.Gaussian;

public class GaussianBuilder {

	public Gaussian build(final List<IGaussianModifier> modifiers,
			Gaussian baseGaussian) {
		for (IGaussianModifier modifier : modifiers) {
			baseGaussian = modifier.apply(baseGaussian);
		}
		return baseGaussian;
	}

}
