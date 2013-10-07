package com.hockeysimulator.simulators.game;

import junit.framework.Assert;

import org.junit.Test;

import com.hockeysimulator.GameResult;
import com.hockeysimulator.simulators.game.IGameSimulator;
import com.hockeysimulator.simulators.game.VerySimpleGameSimulator;

public class VerySimpleGameSimulatorTest {

	@Test
	public void testVerySimpleGame() {
		IGameSimulator gameSimulator = new VerySimpleGameSimulator();
		final GameResult game = gameSimulator.simulate();
		System.out.println(game);
		Assert.assertNotNull(game);
	}

}
