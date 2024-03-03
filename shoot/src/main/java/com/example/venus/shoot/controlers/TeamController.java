package com.example.venus.shoot.controlers;

import com.example.venus.shoot.models.TeamModel;
import com.example.venus.shoot.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("teams")
@CrossOrigin("*")
@RestController
public class TeamController {
    @Autowired
    public TeamService mService;

    @GetMapping
    public List<TeamModel> getAll(){
        return mService.getAllTeams();
    }

    @DeleteMapping("/{x}")
    public void deleteTeam(@PathVariable long x) {
        mService.deleteTeamById(x);
    }

    @GetMapping ("/{y}")
    public TeamModel getTeam(@PathVariable long y) {
        return mService.getTeamById(y);
    }

    @PostMapping
    public TeamModel addTeam(@RequestBody TeamModel team ) {
        System.out.println(team.getName());
        return mService.addTeam(team);
    }

    @PutMapping
    public TeamModel editTeam(@RequestBody TeamModel match ) {
        return mService.addTeam(match);
    }


}
