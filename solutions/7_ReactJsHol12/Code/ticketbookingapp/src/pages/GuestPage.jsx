const GuestPage = ({ setLoggedIn }) => {
  return (
    <main>
      <div>
        <p>Please login</p>
        <button onClick={() => setLoggedIn(true)}>Log In</button>
      </div>
    </main>
  );
};

export default GuestPage;