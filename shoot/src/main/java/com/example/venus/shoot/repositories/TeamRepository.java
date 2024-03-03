package com.example.venus.shoot.repositories;

import com.example.venus.shoot.models.TeamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeamRepository extends JpaRepository<TeamModel, Long> {

}

