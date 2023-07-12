package com.example.onlinegamingapp.repository;

import com.example.onlinegamingapp.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PlayerRepository extends JpaRepository<Players, Long> {

    Iterable<Players> findByusername(String username);
}
