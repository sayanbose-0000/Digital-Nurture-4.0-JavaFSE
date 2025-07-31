const EvenPlayers = ({ players }) => {
  return (
    <div>
      <h1>Even Players</h1>
      {
        players.map(player => {
          if (player.score % 2 === 0) {
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

export default EvenPlayers;