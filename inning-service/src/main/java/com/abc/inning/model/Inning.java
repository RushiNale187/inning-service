package com.abc.inning.model;

public class Inning 
{
	private int inningId;
	private int extras;
	private int totalScore;
	private int totalWicket;
	private double totalOver;
	private String teamName;
	private String inningStatus;
	private int team_id;
	public int getInningId() {
		return inningId;
	}
	public void setInningId(int inningId) {
		this.inningId = inningId;
	}
	public int getExtras() {
		return extras;
	}
	public void setExtras(int extras) {
		this.extras = extras;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int getTotalWicket() {
		return totalWicket;
	}
	public void setTotalWicket(int totalWicket) {
		this.totalWicket = totalWicket;
	}
	public double getTotalOver() {
		return totalOver;
	}
	public void setTotalOver(double totalOver) {
		this.totalOver = totalOver;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getInningStatus() {
		return inningStatus;
	}
	public void setInningStatus(String inningStatus) {
		this.inningStatus = inningStatus;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	
	
}
