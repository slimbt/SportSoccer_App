package com.example.venus.shoot.servicesImpl;

import com.example.venus.shoot.models.PlayerModel;
import com.example.venus.shoot.repositories.PlayerRepository;
import com.example.venus.shoot.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerRepository playerRepo;

    @Override
    public List<PlayerModel> getAllPlayers() {
        // TODO Auto-generated method stub
        return playerRepo.findAll();
    }

    @Override
    public PlayerModel getPlayerById(long id) {
        // TODO Auto-generated method stub
        Optional<PlayerModel> m=playerRepo.findById(id);
        return m.isPresent() ? m.get() : null ;
    }

    @Override
    public PlayerModel addPlayer(PlayerModel m) {
        // TODO Auto-generated method stub
        return playerRepo.save(m);
    }

    @Override
    public PlayerModel editPlayer(PlayerModel m) {
        // TODO Auto-generated method stub
        return playerRepo.save(m);
    }

    @Override
    public void deletePlayerById(long id) {
        // TODO Auto-generated method stub
        playerRepo.deleteById(id);
    }

}
