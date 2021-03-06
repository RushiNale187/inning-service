package com.abc.inning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.inning.model.Inning;
import com.abc.inning.service.InningService;

@RestController
@RequestMapping("/inning")
public class InningController 
{
	@Autowired
	private InningService inningService;
	
	@PostMapping("/save")
	public ResponseEntity<Inning> addInning(@RequestBody Inning inning)
	{
		Inning newInning = inningService.saveInning(inning);
		return new ResponseEntity<Inning>(newInning, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/all")
	public List<Inning> getAllInningDetails()
	{
		return inningService.getAllInning();
	}
	
	@GetMapping("/get/{inning_id}")
	public ResponseEntity<?> getInningDetailsById(@PathVariable("inning_id") int inningId)
	{
		Inning inningDetails = inningService.getInningById(inningId);
		return new ResponseEntity<>(inningDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{inning_id}")
	public void deleteInning(@PathVariable("inning_id") int inningId)
	{
		inningService.deleteInning(inningId);
	}
	
	@PutMapping("/update}")
	public Inning updateInning(Inning inning)
	{
		return inningService.updateInning(inning);
	}
}
