package com.example.venus.shoot.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.venus.shoot.models.MatchModel;
import com.example.venus.shoot.services.MatchService;

@RequestMapping("matches")
@CrossOrigin("*")
@RestController
public class MatchController  {
	
	@Autowired
	public MatchService mService;
	
	@GetMapping
	public List<MatchModel> getAll(){
		return mService.getAllMatches();
	} 
	
	@DeleteMapping ("/{x}")
	public void deleteMatch(@PathVariable long x) {
		mService.deleteMatchById(x);
	}
	
	@GetMapping ("/{y}")
	public MatchModel getMatch(@PathVariable long y) {
		return mService.getMatchById(y);
	}
	
	@PostMapping
	public MatchModel addMatch(@RequestBody MatchModel match ) {
		System.out.println(match.getScoreOne());
		return mService.addMatch(match);
	}
	   
	@PutMapping  
	public MatchModel editMatch(@RequestBody MatchModel match ) {
		return mService.addMatch(match);
	}
	
	

}
