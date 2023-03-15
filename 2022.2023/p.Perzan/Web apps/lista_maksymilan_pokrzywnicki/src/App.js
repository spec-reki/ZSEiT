import React, { useState } from 'react';

function App() {
  const [list, setList] = useState([]);

  const addListItem = () => {
    const newListItem = prompt('Enter new item:');
    if (newListItem) {
      setList([...list, newListItem]);
    }
  }

  return (
    <div>
      <h1>Lista</h1>
      <ul>
        {list.map((item, index) => <li key={index}>{item}</li>)}
      </ul>
      <button onClick={addListItem}>Dodaj nowy punkt listy</button>
    </div>
  );
}

export default App;
