package com.example.onlinegamingapp.controllers;

import com.example.onlinegamingapp.model.Games;
import com.example.onlinegamingapp.model.Results;
import com.example.onlinegamingapp.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ResultController {


    @Autowired
    ResultService resultService;

    @GetMapping("/api/v1/games/{gameId}/results")        //secured players can view their own games.
    public Results getGameResults(@PathVariable Long gameId){
        Results results = resultService.getGameResult(gameId);
        return results;
    }

    @GetMapping("/api/v1/admin/games/{gameId}/results")    //secured Only Admin can access this.
    public List<Results> getAllGameResults(){
        List<Results> results = resultService.getAllGameResults();
        return results;
    }


}
