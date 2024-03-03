package com.example.venus.shoot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.venus.shoot.models.MatchModel;
import com.example.venus.shoot.repositories.MatchRepository;
import com.example.venus.shoot.services.MatchService;
@Service
public class MatchServiceImpl implements MatchService {
	@Autowired

	private MatchRepository matchRepo;
	@Override
	public List<MatchModel> getAllMatches() {
		// TODO Auto-generated method stub
		return matchRepo.findAll();
	}

	@Override
	public MatchModel getMatchById(long id) {
		// TODO Auto-generated method stub
		Optional<MatchModel> m=matchRepo.findById(id);
		return m.isPresent() ? m.get() : null ;
	}
	
	@Override
	public MatchModel addMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

	@Override
	public MatchModel editMatch(MatchModel m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

	@Override
	public void deleteMatchById(long id) {
		// TODO Auto-generated method stub
		 matchRepo.deleteById(id);
	}

}
