package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Games;
import com.example.onlinegamingapp.repository.GamingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamingServiceImpl implements GamingService{

    @Autowired
    GamingRepository gamingRepository;

    @Override
    public List<Games> getAllGames() {

        return gamingRepository.findAll();
    }

    @Override
    public Long createGame(Games game) {
        Games gameR = gamingRepository.save(game);
        return gameR.getId();
    }

    @Override
    public Long joinForGame(Long id) { // how a player can joi game itseltf
        return null;
    }

    @Override
    public Long updateGame(Games game, Long gameId) {
        Games originalGame = gamingRepository.getById(gameId);

        originalGame.setGameDate(game.getGameDate());
        originalGame.setGameName(game.getGameName());
        originalGame.setGameVenue(game.getGameVenue());
        originalGame.setTeamOneId(game.getTeamOneId());
        originalGame.setTeamTwoId(game.getTeamTwoId());
        originalGame.setTeamOneScore(game.getTeamOneScore());
        originalGame.setTeamTwoScore(game.getTeamTwoScore());


        return originalGame.getId();
    }

    @Override
    public Long deleteGame(Long gameId) {

        gamingRepository.deleteById(gameId);
        return gameId;
    }
}
