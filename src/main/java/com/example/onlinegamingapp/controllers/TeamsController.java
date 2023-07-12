package com.example.onlinegamingapp.controllers;

import com.example.onlinegamingapp.model.Teams;
import com.example.onlinegamingapp.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class TeamsController {

    @Autowired
    TeamsService teamsService;


    @PostMapping("/api/v1/registerTeam")
    public int registerTeam(@RequestBody Teams teams){
        int teamSaved =  teamsService.save(teams);

        return teamSaved;
    }

    @GetMapping("/api/v1/teams")
    public List<Teams> getTeams(){
        List<Teams> list =  teamsService.findAllTeams();

        return list;
    }

}
