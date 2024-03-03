package com.example.venus.shoot.repositories;

import com.example.venus.shoot.models.PlayerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PlayerRepository extends JpaRepository<PlayerModel, Long> {

}
