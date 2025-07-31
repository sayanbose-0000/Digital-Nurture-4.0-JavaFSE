import FlightTickets from "../components/FlightTickets";

const UserPage = ({ setLoggedIn }) => {
  return (
    <main>
      <div>
        <p>Welcome User</p>
        <button onClick={() => setLoggedIn(false)}>Log Out</button>
      </div>
      <FlightTickets />
    </main>
  );
};

export default UserPage;