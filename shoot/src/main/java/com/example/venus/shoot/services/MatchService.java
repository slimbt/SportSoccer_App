package com.example.venus.shoot.services;

import java.util.List;

import com.example.venus.shoot.models.MatchModel;

public interface MatchService {
public List<MatchModel> getAllMatches();
public MatchModel getMatchById(long id);
public MatchModel addMatch(MatchModel m);
public MatchModel editMatch(MatchModel m);
public void deleteMatchById(long id);



}
