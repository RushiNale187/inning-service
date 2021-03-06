package com.abc.inning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inning_tbl")
public class InningEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="inning_id")
	private int inningId;
	
	@Column(name="extras")
	private int extras;
	
	@Column(name="total_score")
	private int totalScore;
	
	@Column(name="total_wicket")
	private int totalWicket;
	
	@Column(name="total_over")
	private double totalOver;
	
	@Column(name="team_name")
	private String teamName;
	
	@Column(name="inning_status")
	private String inningStatus;
	
	@Column(name="team_id")
	private int teamId;

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

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	
}
