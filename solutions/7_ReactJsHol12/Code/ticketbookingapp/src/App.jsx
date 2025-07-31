import { useState } from "react";
import GuestPage from "./pages/GuestPage";
import UserPage from "./pages/UserPage";

const App = () => {
  const [loggedIn, setLoggedIn] = useState(false);

  if (loggedIn) return <UserPage setLoggedIn={setLoggedIn} />;
  else return < GuestPage setLoggedIn={setLoggedIn} />;
};

export default App;