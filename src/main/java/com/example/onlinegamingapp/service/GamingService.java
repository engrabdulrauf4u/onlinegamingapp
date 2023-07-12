package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Games;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GamingService {

    List<Games> getAllGames();

    Long createGame(Games game);

    Long joinForGame(Long id);

    Long updateGame(Games game, Long gameId);

    Long deleteGame(Long gameId);
}
