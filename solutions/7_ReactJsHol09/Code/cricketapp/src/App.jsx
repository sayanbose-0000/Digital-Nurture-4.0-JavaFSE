import EvenPlayers from "./components/EvenPlayers";
import FilterPlayers from "./components/FilterPlayers";
import MapPlayers from "./components/MapPlayers";
import MergePlayers from "./components/MergePlayers";
import OddPlayers from "./components/OddPlayers";
import "./styles/globals.css";

const Component = () => {
  const players = [
    { name: "Rohit Sharma", score: 80 },
    { name: "Shubman Gill", score: 32 },
    { name: "Virat Kohli", score: 67 },
    { name: "Shreyas Iyer", score: 21 },
    { name: "KL Rahul", score: 76 },
    { name: "Hardik Pandya", score: 38 },
    { name: "Ravindra Jadeja", score: 18 },
    { name: "Kuldeep Yadav", score: 100 },
    { name: "Jasprit Bumrah", score: 5 },
    { name: "Mohammed Siraj", score: 85 },
    { name: "Mohammed Shami", score: 7 }
  ];

  return (
    <main className="container">
      <MapPlayers players={players} />
      <FilterPlayers players={players} />
      <OddPlayers players={players} />
      <EvenPlayers players={players} />
      <MergePlayers />
    </main>
  );
};

export default Component;
