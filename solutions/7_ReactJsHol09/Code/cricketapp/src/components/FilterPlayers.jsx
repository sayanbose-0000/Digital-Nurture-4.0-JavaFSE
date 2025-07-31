const FilterPlayers = ({ players }) => {
  return (
    <div>
      <h1>Filter Players (&le; 70)</h1>
      {
        players.map(player => {
          if (player.score <= 70) {
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

export default FilterPlayers;
