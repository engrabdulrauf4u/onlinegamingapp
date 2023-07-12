package com.example.onlinegamingapp.repository;

import com.example.onlinegamingapp.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@EnableJpaRepositories
@Repository
public interface TeamRepository extends JpaRepository<Teams,Integer> {

}
