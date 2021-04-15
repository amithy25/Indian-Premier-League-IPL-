import { React, useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { MatchDetailCard } from '../components/MatchDetailCard';
import { MatchSmallCard } from '../components/MatchSmallCard';

export const MatchPage = () => {
  const [team, setTeam] = useState({ matches: [] });

  const { teamName } = useParams();

  return (
    <div className="MatchPage">
      <h1>MatchPage: </h1>
      <h2>
        {} vs {}
      </h2>
    </div>
  );
};
