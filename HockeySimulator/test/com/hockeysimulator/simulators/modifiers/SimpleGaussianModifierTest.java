package com.hockeysimulator.simulators.modifiers;

import junit.framework.Assert;

import org.junit.Test;

import com.hockeysimulator.simulators.random.Gaussian;

public class SimpleGaussianModifierTest {

	@Test
	public void testGaussianModification() {
		final double standardDeviation = 10;
		final double average = 100;
		final Gaussian gaussian = new Gaussian(standardDeviation, average);
		final double standardDeviationModifier = 0.95;
		final double averageModifier = 0.99;
		final IGaussianModifier modifier = new SimpleGaussianModifier(
				standardDeviationModifier, averageModifier);
		final Gaussian modifiedGaussian = modifier.apply(gaussian);
		final double expectedAverage = 99;
		final double expectedStandardDeviation = 9.5;
		final double actualAverage = modifiedGaussian.getAverage();
		final double actualStandardDeviation = modifiedGaussian.getStandardDeviation();
		Assert.assertEquals(expectedAverage, actualAverage);
		Assert.assertEquals(expectedStandardDeviation, actualStandardDeviation);
	}

}
