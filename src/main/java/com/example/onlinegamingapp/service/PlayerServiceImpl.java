package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Players;
import com.example.onlinegamingapp.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService{

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public List<Players> findAllplayers() {
        return playerRepository.findAll();
    }

    @Override
    public Long savePlayers(Players players) {
        Players player = new Players(
                players.getFirstName(),
        players.getLastName(),
        players.getAge(),
        players.getRole(),
        players.getEmail(),
        players.getCellNumber(),
        players.getDateOfBirth(),
        players.getPosition(),
        players.getUsername(),
        players.getPassword(),
        players.getTeams()
        );
        Players players1 = playerRepository.save(player);
        return players1.getId();
    }

    @Override
    public Optional<Players> getById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public Long updatePlayers(Players players) {

        Players players1 = playerRepository.getById(players.getId());

        players1.setAge(players.getAge());
        players1.setCellNumber(players.getCellNumber());
        players1.setDateOfBirth(players.getDateOfBirth());
        players1.setEmail(players.getEmail());
        players1.setFirstName(players.getFirstName());
        players1.setLastName(players.getLastName());
        players1.setPosition(players.getPosition());
        players1.setTeams(players.getTeams());


        playerRepository.save(players1);
        return players1.getId();
    }

    @Override
    public Long updatePlayers(Players players, Long id) {
        Players players1 = playerRepository.getById(id);

        players1.setAge(players.getAge());
        players1.setCellNumber(players.getCellNumber());
        players1.setDateOfBirth(players.getDateOfBirth());
        players1.setEmail(players.getEmail());
        players1.setFirstName(players.getFirstName());
        players1.setLastName(players.getLastName());
        players1.setPosition(players.getPosition());
        players1.setTeams(players.getTeams());


        playerRepository.save(players1);
        return players1.getId();
    }

    @Override
    public Optional<Players> getByUserName(String username) {

        Iterable<Players> players = playerRepository.findAll();

        Optional<Players> playerReturned = null;
        for (Players player:players){
            if(player.getUsername().equals(username))
            {
                playerReturned =  Optional.of(player);
            }
        }
        return playerReturned;
    }
}
