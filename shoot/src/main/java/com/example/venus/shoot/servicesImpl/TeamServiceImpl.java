package com.example.venus.shoot.servicesImpl;

import com.example.venus.shoot.models.TeamModel;
import com.example.venus.shoot.repositories.TeamRepository;
import com.example.venus.shoot.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepo;

    @Override
    public List<TeamModel> getAllTeams() {
        // TODO Auto-generated method stub
        return teamRepo.findAll();
    }

    @Override
    public TeamModel getTeamById(long id) {
        // TODO Auto-generated method stub
        Optional<TeamModel> m=teamRepo.findById(id);
        return m.isPresent() ? m.get() : null ;
    }

    @Override
    public TeamModel addTeam(TeamModel m) {
        // TODO Auto-generated method stub
        return teamRepo.save(m);
    }

    @Override
    public TeamModel editTeam(TeamModel m) {
        // TODO Auto-generated method stub
        return teamRepo.save(m);
    }

    @Override
    public void deleteTeamById(long id) {
        // TODO Auto-generated method stub
        teamRepo.deleteById(id);
    }
}
