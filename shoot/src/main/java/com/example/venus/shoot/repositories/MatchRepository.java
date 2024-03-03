package com.example.venus.shoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.venus.shoot.models.MatchModel;

@Repository
public interface MatchRepository extends JpaRepository<MatchModel, Long> {

}
