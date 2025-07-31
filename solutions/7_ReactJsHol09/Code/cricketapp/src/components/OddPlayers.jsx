const OddPlayers = ({ players }) => {
  return (
    <div>
      <h1>Odd Players</h1>
      {
        players.map(player => {
          if (player.score % 2 !== 0) {
            return (
              <li>
                <span>Mr. {player.name} </span>
                <span>{player.score}</span>
              </li>
            );
          }
          return null;
        })
      }
    </div>
  );
};

export default OddPlayers;