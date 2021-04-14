package io.amith.ipldashboard.controller;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.amith.ipldashboard.model.Match;
import io.amith.ipldashboard.model.Team;
import io.amith.ipldashboard.repository.MatchRepository;
import io.amith.ipldashboard.repository.TeamRepository;

@RestController
public class TeamController {

  private TeamRepository teamRepository;
  private MatchRepository matchRepository;

  public TeamController(TeamRepository teamRepository, MatchRepository matchRepository) {
    this.teamRepository = teamRepository;
    this.matchRepository = matchRepository;
  }
  
  @GetMapping("/team/{teamName}")
  public Team getTeam(@PathVariable String teamName){

    Team team =  teamRepository.findByTeamName(teamName);
    
    team.setMatches( matchRepository.findLatestMatches(teamName, 4));


    return team;

  }



  

}
