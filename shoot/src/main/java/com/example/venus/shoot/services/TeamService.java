package com.example.venus.shoot.services;

import com.example.venus.shoot.models.TeamModel;

import java.util.List;

public interface TeamService {
    public List<TeamModel> getAllTeams();
    public TeamModel getTeamById(long id);
    public TeamModel addTeam(TeamModel m);
    public TeamModel editTeam(TeamModel m);
    public void deleteTeamById(long id);
}
