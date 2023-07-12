package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Teams;
import com.example.onlinegamingapp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsServiceImpl implements  TeamsService{


    @Autowired
    TeamRepository teamsRepository;

    @Override
    public int save(Teams teamsDTO) {

        Teams teams = new Teams(
                teamsDTO.getTeamName(),
                teamsDTO.getTeamCity(),
                teamsDTO.getTeamCaptain(),
                teamsDTO.getCoach(),
                teamsDTO.getNumberOfPlayers()
        );
        Teams TeamsSaved = teamsRepository.save(teams);
        return TeamsSaved.getId();
    }

    @Override
    public List<Teams> findAllTeams() {
        return teamsRepository.findAll();
    }
}
