package com.example.onlinegamingapp.service;

import com.example.onlinegamingapp.model.Results;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResultService {
    Results getGameResult(Long gameId);

    List<Results> getAllGameResults();
}
