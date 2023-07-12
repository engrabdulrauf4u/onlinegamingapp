package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Players;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PlayerService {
    List<Players> findAllplayers();

    Long savePlayers(Players players);

    Optional<Players> getById(Long id);

    Long updatePlayers(Players players);
    Long updatePlayers(Players players,Long id);
    Optional<Players> getByUserName(String username);
}
