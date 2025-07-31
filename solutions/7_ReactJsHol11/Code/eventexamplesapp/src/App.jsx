import { useState } from "react";

const App = () => {
  const [count, setCount] = useState(0);
  const [rs, setRs] = useState(0);
  const [euro, setEuro] = useState(0);

  const handleIncrement = () => {
    setCount(prev => prev + 1);
    alert("Hello User! Count incremented!");
  };

  const handleDecrement = () => {
    setCount(prev => prev - 1);
  };

  const handleWelcome = (welcome) => {
    alert(welcome);
  };

  const handlePress = () => {
    alert("Button Pressed");
  };

  const handleConvert = (e) => {
    e.preventDefault();
    setEuro(0.0100 * rs);
  };

  return (
    <main style={{ display: "flex", flexDirection: "column", gap: "50px" }}>
      <div style={{ display: "flex", gap: "10px" }}>
        <button onClick={handleDecrement}>Decrement</button>
        <p>Count: {count}</p>
        <button onClick={handleIncrement}>Increment</button>
      </div>

      <div style={{ display: "flex", gap: "10px" }}>
        <button onClick={() => handleWelcome("Welcome")}>Say Hello</button>
        <button onClick={handlePress}>Press me</button>
      </div>

      <form style={{ display: "flex", flexDirection: "column", gap: "5px" }} onSubmit={(e) => handleConvert(e)}>
        <h1>Currency Convertor</h1>

        <div>
          <label htmlFor="rs">Rs.: </label>
          <input type="number" id="rs" value={rs} onChange={(e) => setRs(e.target.value)} />
        </div>

        <div>
          <label htmlFor="euro">Euro: </label>
          <input type="number" id="euro" disabled value={euro} />
        </div>

        <button style={{ width: "100px" }}>Convert</button>
      </form>
    </main>
  );
};

export default App;