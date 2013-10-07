package com.hockeysimulator;

public class ShotsOnNet {

	private int vistorShotsOnNet;
	private int homeShotsOnNet;

	public ShotsOnNet(int vistorShotsOnNet, int homeShotsOnNet) {
		super();
		this.vistorShotsOnNet = vistorShotsOnNet;
		this.homeShotsOnNet = homeShotsOnNet;
	}

	public int getVistorShotsOnNet() {
		return vistorShotsOnNet;
	}

	public void setVistorShotsOnNet(int vistorShotsOnNet) {
		this.vistorShotsOnNet = vistorShotsOnNet;
	}

	public int getHomeShotsOnNet() {
		return homeShotsOnNet;
	}

	public void setHomeShotsOnNet(int homeShotsOnNet) {
		this.homeShotsOnNet = homeShotsOnNet;
	}

	@Override
	public String toString() {
		return "ShotsOnNet [vistorShotsOnNet=" + vistorShotsOnNet
				+ ", homeShotsOnNet=" + homeShotsOnNet + "]";
	}

}
