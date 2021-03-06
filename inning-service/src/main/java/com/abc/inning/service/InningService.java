package com.abc.inning.service;

import java.util.List;

import com.abc.inning.model.Inning;

public interface InningService 
{
	public Inning saveInning(Inning inning);
	
	public List<Inning> getAllInning();
	
	public Inning getInningById(int iiningId);
	
	public void deleteInning(int inningId);
	
	public Inning updateInning(Inning inning);
}
