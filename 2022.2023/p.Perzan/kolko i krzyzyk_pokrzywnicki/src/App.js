import React, { useState } from "react";
import "./index.css";

function App() {
  const [board, setBoard] = useState(Array(9).fill(null));
  const [player, setPlayer] = useState("X");
  const [winner, setWinner] = useState(null);

  const handleSquareClick = (index) => {
    if (board[index] || winner) {
      return;
    }

    const newBoard = [...board];
    newBoard[index] = player;
    setBoard(newBoard);

    const newPlayer = player === "X" ? "O" : "X";
    setPlayer(newPlayer);

    const newWinner = calculateWinner(newBoard);
    setWinner(newWinner);
  };

  const calculateWinner = (squares) => {
    const lines = [
      [0, 1, 2],
      [3, 4, 5],
      [6, 7, 8],
      [0, 3, 6],
      [1, 4, 7],
      [2, 5, 8],
      [0, 4, 8],
      [2, 4, 6],
    ];

    for (let i = 0; i < lines.length; i++) {
      const [a, b, c] = lines[i];
      if (
        squares[a] &&
        squares[a] === squares[b] &&
        squares[a] === squares[c]
      ) {
        return squares[a];
      }
    }

    return null;
  };

  const renderSquare = (index) => {
    return (
      <button className="square" onClick={() => handleSquareClick(index)}>
        {board[index]}
      </button>
    );
  };

  const renderStatus = () => {
    if (winner) {
      return `Zwycięzcą jest: ${winner}`;
    } else if (board.every((square) => square)) {
      return "Remis";
    } else {
      return `Następny gracz: ${player}`;
    }
  };

  const resetBoard = () => {
    setBoard(Array(9).fill(null));
    setPlayer("X");
    setWinner(null);
  };

  return (
    <body>
      <div className="titletext">Kółko i krzyżyk</div>
      <div className="app">
        <div className="board">
          <div className="row">
            {renderSquare(0)}
            {renderSquare(1)}
            {renderSquare(2)}
          </div>
          <div className="row">
            {renderSquare(3)}
            {renderSquare(4)}
            {renderSquare(5)}
          </div>
          <div className="row">
            {renderSquare(6)}
            {renderSquare(7)}
            {renderSquare(8)}
          </div>
        </div>
        <div className="status">{renderStatus()}</div>
        {winner || board.every((square) => square) ? (
          <button className="reset-button" onClick={resetBoard}>
            Play again
          </button>
        ) : null}
      </div>
    </body>
  );
}

export default App;
