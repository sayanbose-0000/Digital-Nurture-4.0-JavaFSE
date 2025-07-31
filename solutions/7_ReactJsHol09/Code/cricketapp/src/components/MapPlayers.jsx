const MapPlayers = ({ players }) => {
  return (
    <div>
      <h1>Map Players</h1>
      {
        players.map(player => (
          <li>
            <span>Mr. {player.name} </span>
            <span>{player.score}</span>
          </li>
        ))
      }
    </div>
  );
};

export default MapPlayers;
