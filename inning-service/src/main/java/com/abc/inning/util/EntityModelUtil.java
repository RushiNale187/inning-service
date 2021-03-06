package com.abc.inning.util;

import java.util.ArrayList;
import java.util.List;

import com.abc.inning.entity.InningEntity;
import com.abc.inning.model.Inning;

public class EntityModelUtil 
{
	public static InningEntity inningModelToEntity(Inning inning)
	{
		InningEntity inningEntity = new InningEntity();
		
		inningEntity.setInningId(inning.getInningId());
		inningEntity.setExtras(inning.getExtras());
		inningEntity.setTotalScore(inning.getTotalScore());
		inningEntity.setTotalWicket(inning.getTotalWicket());
		inningEntity.setTotalOver(inning.getTotalOver());
		inningEntity.setTeamName(inning.getTeamName());
		inningEntity.setInningStatus(inning.getInningStatus());
		inningEntity.setTeamId(inning.getTeam_id());
		
		return inningEntity;
	}
	
	public static Inning inningEntityToModel(InningEntity inningEntity)
	{
		Inning inning = new Inning();
		
		inning.setInningId(inningEntity.getInningId());
		inning.setExtras(inningEntity.getExtras());
		inning.setTotalScore(inningEntity.getTotalScore());
		inning.setTotalWicket(inningEntity.getTotalWicket());
		inning.setTotalOver(inningEntity.getTotalOver());
		inning.setTeamName(inningEntity.getTeamName());
		inning.setInningStatus(inningEntity.getInningStatus());
		inning.setTeam_id(inningEntity.getTeamId());
		
		return inning;
	}
	
	public static List<Inning> InningEntityToModelList(List<InningEntity> entityList)
	{
		List<Inning> inningList = new ArrayList<>();
		
		entityList.forEach(entity -> {
		
				Inning inning = new Inning();
				inning.setInningId(entity.getInningId());
				inning.setExtras(entity.getExtras());
				inning.setTotalScore(entity.getTotalScore());
				inning.setTotalWicket(entity.getTotalWicket());
				inning.setTotalOver(entity.getTotalOver());
				inning.setTeamName(entity.getTeamName());
				inning.setInningStatus(entity.getInningStatus());
				inning.setTeam_id(entity.getTeamId());
				
				inningList.add(inning);
		});
		return inningList;
	}

}
