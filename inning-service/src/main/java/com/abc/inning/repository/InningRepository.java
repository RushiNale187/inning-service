package com.abc.inning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.inning.entity.InningEntity;

@Repository
public interface InningRepository extends JpaRepository<InningEntity,Integer>
{
	
}
