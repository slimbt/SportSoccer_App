package com.example.venus.shoot.services;

import com.example.venus.shoot.models.PlayerModel;

import java.util.List;

public interface PlayerService {
    public List<PlayerModel> getAllPlayers();
    public PlayerModel getPlayerById(long id);
    public PlayerModel addPlayer(PlayerModel m);
    public PlayerModel editPlayer(PlayerModel m);
    public void deletePlayerById(long id);

}
