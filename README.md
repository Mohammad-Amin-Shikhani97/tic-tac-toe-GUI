<h1>Tic Tac Toe – Java Swing GUI</h1>

<p>
A graphical Tic Tac Toe game built with Java Swing. Players compete on a 3×3 grid with 
randomly assigned symbols (X or O) and the option to replay or exit after each round. 
Features dynamic UI updates, color-coded winnings, and score tracking.
</p>

<h2>Table of Contents</h2>
<ol>
  <li><a href="#features">Features</a></li>
  <li><a href="#installation">Installation &amp; Setup</a></li>
  <li><a href="#usage">Usage</a></li>
  <li><a href="#game-flow">Game Flow</a></li>
  <li><a href="#references">References</a></li>
  <li><a href="#license">License</a></li>
</ol>

<h2 id="features">Features</h2>
<ul>
  <li><strong>Java Swing GUI:</strong> Provides a user-friendly, clickable interface.</li>
  <li><strong>Random Symbols:</strong> Each game assigns <em>Player 1</em> or <em>Player 2</em> with X or O.</li>
  <li><strong>Score Tracking:</strong> Displays each player’s total wins across multiple rounds.</li>
  <li><strong>Dynamic Color Updates:</strong> Buttons change color on victory, highlighting the winning row.</li>
  <li><strong>Replay &amp; Exit Options:</strong> Restart a new match or quit from the same screen.</li>
</ul>

<h2 id="installation">Installation &amp; Setup</h2>
<ol>
  <li><strong>Clone or Download the Repository:</strong>
    <pre><code>git clone https://github.com/Mohammad-Amin-Shikhani97/tic-tac-toe-GUI.git</code></pre>
    Place the files in a folder named <code>tic_tac_toe_game</code> for proper package structure.
  </li>
  <li><strong>Compile the Project:</strong>
    <pre><code>cd &lt;PROJECT_DIRECTORY&gt;
javac tic_tac_toe_game/*.java
</code></pre>
  </li>
  <li><strong>Run the Main Class:</strong>
    <pre><code>java tic_tac_toe_game.Main
</code></pre>
  </li>
</ol>

<h2 id="usage">Usage</h2>
<ol>
  <li>Upon launch, you’ll see a <em>Welcome Screen</em> with a “Start” button.</li>
  <li>After clicking “Start”, the 3×3 Tic Tac Toe board appears.</li>
  <li>The game randomly picks which player (1 or 2) goes first. Place your symbol by clicking an empty cell.</li>
  <li>When a player wins or the board is full (draw), a result screen offers “Play Again” or “Exit”.</li>
  <li>Continue to track scores over multiple rounds for a fun, competitive experience.</li>
</ol>

<h2 id="game-flow">Game Flow</h2>
<ul>
  <li><strong>Main Class:</strong> Instantiates the <code>TicTacToe</code> GUI.</li>
  <li><strong>TicTacToe Constructor:</strong> Builds the initial frame and directs to either <em>Start Screen</em> or <em>Game Panel</em>.</li>
  <li><strong>Start Screen:</strong> “Start” button leads into the game, initializes scores, and sets up players.</li>
  <li><strong>Header Panel &amp; Buttons:</strong> Displays player wins, current turn, and each button for board spaces.</li>
  <li><strong>Win Checking:</strong> Validates rows, columns, and diagonals for three matching symbols, then updates UI accordingly.</li>
  <li><strong>Play Again Panel:</strong> Provides an option to reset the board or quit the game entirely.</li>
</ul>

<h2 id="references">References</h2>
<ul>
  <li><a href="https://docs.oracle.com/javase/tutorial/uiswing/" target="_blank">Java Swing Tutorial</a></li>
  <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Random.html" target="_blank">java.util.Random</a></li>
  <li><a href="https://docs.oracle.com/javase/8/docs/api/javax/swing/Frame.html" target="_blank">Java Frames</a></li>
  <li><a href="https://docs.github.com/en" target="_blank">Using Git and GitHub</a></li>
</ul>

<h2 id="license">License</h2>
<p>
Unless otherwise specified, this project is distributed without a specific license. 
Please note that any dependencies or libraries you incorporate may require 
separate licensing considerations.
</p>

<p><strong>Enjoy the game!</strong> If you encounter bugs or have suggestions, feel free to open an issue or submit a pull request.</p>
