package com.example.onlinegamingapp.service;


import com.example.onlinegamingapp.model.Teams;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  TeamsService{

   int save(Teams teamsDTO);

   List<Teams> findAllTeams();
}
