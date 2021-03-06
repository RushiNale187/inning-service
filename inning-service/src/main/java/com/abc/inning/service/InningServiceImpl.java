package com.abc.inning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.inning.entity.InningEntity;
import com.abc.inning.exception.InningNotFoundException;
import com.abc.inning.model.Inning;
import com.abc.inning.repository.InningRepository;
import com.abc.inning.util.EntityModelUtil;

@Service
public class InningServiceImpl implements InningService
{
	@Autowired
	private InningRepository  inningRepository;
	
	@Override
	public Inning saveInning(Inning inning) 
	{
		InningEntity inningEntity = inningRepository.save(EntityModelUtil.inningModelToEntity(inning));
		return EntityModelUtil.inningEntityToModel(inningEntity);
	}

	@Override
	public List<Inning> getAllInning() 
	{
		List<InningEntity> inningEntityList = inningRepository.findAll();
		return EntityModelUtil.InningEntityToModelList(inningEntityList);
	}

	@Override
	public Inning getInningById(int inningId) 
	{
		Optional<InningEntity> optionalInning = inningRepository.findById(inningId);
		if(optionalInning.isEmpty())
		{
			throw new InningNotFoundException("Sorry! Inning is not existing with id :"+inningId);
		}
		return EntityModelUtil.inningEntityToModel(optionalInning.get());
	}

	@Override
	public void deleteInning(int inningId) 
	{
		Optional<InningEntity> optional = inningRepository.findById(inningId);
		if(optional.isEmpty())
		{
			throw new InningNotFoundException("Sorry! Inning is not existing with id :"+inningId);
		}
		inningRepository.deleteById(inningId);
	}

	@Override
	public Inning updateInning(Inning inning) 
	{
		Optional<InningEntity> optional = inningRepository.findById(inning.getInningId());
		if(optional.isEmpty())
		{
			throw new InningNotFoundException("Sorry! Inning is not existing with id :"+inning.getInningId());
		}
		InningEntity inningEntity = inningRepository.save(EntityModelUtil.inningModelToEntity(inning));
		return EntityModelUtil.inningEntityToModel(inningEntity);
	}

}
