const MergePlayers = () => {
  const T20players = ["First Player", "Second Player", "Third Player", "Fourth Player", "Fifth Player"];
  const RanjiTrophyPlayers = ["Sixth Player", "Seventh Player", "Eighth Player", "Nineth Player", "Tenth Player"];

  const indianPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h1>Merge Players</h1>
      {
        indianPlayers.map(player => (
          <li>
            <span>Mr. {player} </span>
          </li>
        ))
      }
    </div>
  );
};

export default MergePlayers;