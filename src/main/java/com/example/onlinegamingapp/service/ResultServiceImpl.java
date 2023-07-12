package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Results;
import com.example.onlinegamingapp.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {


    @Autowired
    ResultRepository resultRepository;

    @Override
    public Results getGameResult(Long gameId) {

        Results results=resultRepository.getById(gameId);

        return results;
    }
    @Override
    public List<Results> getAllGameResults() {
        return resultRepository.findAll();
    }
}
