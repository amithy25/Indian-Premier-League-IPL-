package io.amith.ipldashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import io.amith.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
  
  Team findByTeamName(String teamName);
  
}
