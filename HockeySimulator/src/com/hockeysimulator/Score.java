package com.hockeysimulator;

public class Score {

	private int visitorNumberOfGoals;
	private int homeNumberOfGoals;

	public Score(int visitorNumberOfGoals, int homeNumberOfGoals) {
		this.visitorNumberOfGoals = visitorNumberOfGoals;
		this.homeNumberOfGoals = homeNumberOfGoals;
	}

	public int getVisitorNumberOfGoals() {
		return visitorNumberOfGoals;
	}

	public void setVisitorNumberOfGoals(int visitorNumberOfGoals) {
		this.visitorNumberOfGoals = visitorNumberOfGoals;
	}

	public int getHomeNumberOfGoals() {
		return homeNumberOfGoals;
	}

	public void setHomeNumberOfGoals(int homeNumberOfGoals) {
		this.homeNumberOfGoals = homeNumberOfGoals;
	}

	@Override
	public String toString() {
		return "Score [visitorNumberOfGoals=" + visitorNumberOfGoals
				+ ", homeNumberOfGoals=" + homeNumberOfGoals + "]";
	}

}
