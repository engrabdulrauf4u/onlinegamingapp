package com.example.onlinegamingapp.controllers;

import com.example.onlinegamingapp.model.Players;
import com.example.onlinegamingapp.service.PlayerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class PlayersController {


    @Autowired
    PlayerService playerService;



    @PostMapping("/api/v1/register")              //Any one is able to access this
    public Long savePlayers(@RequestBody Players players){

        Long id = playerService.savePlayers(players);
        return id;
    }


    @GetMapping("/api/v1/login")    //End Point to Login admin/player.....Here id should be automatically picked up
    public String findById(@RequestParam(required=false,name="username") String username ) throws Exception {
        // Optional<Players> player=playerService.getById(id);
        // return player;

        return "login1";
    }


    @GetMapping(value = "/api/v1/profile",params = {"username"})    //End point for player to view their own profile.  here is id will be automatically picked up
    public Optional<Players> findProfileById(@RequestParam(value = "username") String username) throws Exception {
        Optional<Players> player=playerService.getByUserName(username);
        return player;
    }


    @PutMapping("/api/v1/profile")// End point to player to update own profile .secured .
    public Long updatePlayers(@RequestBody Players players){

        Long id = playerService.updatePlayers(players);
        return id;
    }
    @GetMapping("/api/v1/admin/profiles")  // only admin can access this .....
    public List<Players> findAllPlayers() throws Exception {
        List<Players> players=playerService.findAllplayers();
        return players;
    }

    @PutMapping("/api/v1/admin/profiles/{id}")   // only admin can access and update their profile.
    public Long updatePlayersByAdmin(@RequestBody Players players,@PathVariable Long id) throws Exception {
        Long id2=playerService.updatePlayers(players,id);
        return id2;
    }
}
