package com.example.venus.shoot.controlers;

import com.example.venus.shoot.models.PlayerModel;
import com.example.venus.shoot.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("players")
@CrossOrigin("*")
@RestController
public class PlayerController {
    @Autowired
    public PlayerService mService;

    @GetMapping
    public List<PlayerModel> getAll(){
        return mService.getAllPlayers();
    }

    @DeleteMapping("/{x}")
    public void deletePlayer(@PathVariable long x) {
        mService.deletePlayerById(x);
    }

    @GetMapping ("/{y}")
    public PlayerModel getPlayer(@PathVariable long y) {
        return mService.getPlayerById(y);
    }

    @PostMapping
    public PlayerModel addPlayer(@RequestBody PlayerModel player ) {
        System.out.println(player.getName());
        return mService.addPlayer(player);
    }

    @PutMapping
    public PlayerModel editPlayer(@RequestBody PlayerModel player ) {
        return mService.addPlayer(player);
    }


}
