package com.example.onlinegamingapp.controllers;

import com.example.onlinegamingapp.model.Games;
import com.example.onlinegamingapp.service.GamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    GamingService gamingService;


    @GetMapping("/api/v1/games")     // End point for users to all available games .secured.
    public List<Games> getAllGames(){
        List<Games> games = gamingService.getAllGames();
        return games;
    }

    @PostMapping("/api/v1/games/{id}")      //secured.??????
    public Long joinForGame(@PathVariable Long id){
        Long gameId = gamingService.joinForGame(id);
        return gameId;
    }

    @PostMapping("/api/v1/admin/games")  // Only Admin Should be access this.
    public Long createGame(@RequestBody Games game){
        Long gameId = gamingService.createGame(game);
        return gameId;
    }

    @PutMapping("/api/v1/admin/games/{gameId}")  //Only Admin can Update
    public Long createGame(@RequestBody Games game,@PathVariable Long gameId){
        Long gameIdReturned = gamingService.updateGame(game,gameId);
        return gameIdReturned;
    }

    @DeleteMapping("/api/v1/admin/games/{gameId}")  //Only Admin can Update
    public Long deleteGame(@PathVariable Long gameId){
        Long gameIdReturned = gamingService.deleteGame(gameId);
        return gameIdReturned;
    }



}
