const App = () => {
  const element = "Office Space Rental";
  const attr = <img src="image.png" alt="Office Space Rental" />;
  const officeDetails = {
    name: "ANG",
    rent: 10000,
    address: "6 Park Street, London"
  };

  return (
    <main>
      <h1>{element}</h1>
      {attr}
      <p>Name: {officeDetails.name}</p>
      <p style={{color: officeDetails.rent > 1000 ? "red" : "blue"}}>Rent: {officeDetails.rent}</p>
      <p>Address: {officeDetails.address}</p>
    </main>
  );
};

export default App;
