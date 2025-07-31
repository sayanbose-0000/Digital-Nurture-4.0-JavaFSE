const FlightTickets = () => {
  const flights = [
    { flightName: "Air India", price: 12000 },
    { flightName: "Indian Airlines", price: 23000 },
    { flightName: "IndiGo", price: 20000 },
    { flightName: "Star Air", price: 10000 },
    { flightName: "AirAsia India", price: 25000 },
  ];

  return (
    <div style={{ display: "flex", flexDirection: "column", gap: "10px" }}>
      {
        flights.map(flight => {
          return (
            <div style={{ display: "flex", gap: "5px" }}>
              <p>Flight Name: {flight.flightName}</p>
              <p>|</p>
              <p>Price: {flight.price}</p>
            </div>
          );
        })
      }
    </div>
  );
};

export default FlightTickets;