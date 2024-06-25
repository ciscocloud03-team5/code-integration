const express = require('express');
const app = express();
const port = 3000;

// HTML 페이지 제공
app.get('/', (req, res) => {
    res.send(`
        <html>
            <head>
                <title>Number Guessing Game</title>
            </head>
            <body>
                <h1>Guess the Number Game</h1>
                <p>Enter a number between 1 and 10:</p>
                <input type="number" id="guess" />
                <button onclick="makeGuess()">Guess</button>
                <p id="result"></p>
                <script>
                    function makeGuess() {
                        const guess = document.getElementById('guess').value;
                        fetch('/guess?number=' + guess)
                            .then(response => response.json())
                            .then(data => {
                                document.getElementById('result').innerText = data.message;
                            });
                    }
                </script>
            </body>
        </html>
    `);
});

// 숫자 맞추기 로직
app.get('/guess', (req, res) => {
    const targetNumber = 7;  // 정답 숫자
    const userGuess = parseInt(req.query.number, 10);

    let message;
    if (userGuess === targetNumber) {
        message = "Congratulations! You guessed the correct number.";
    } else {
        message = "Sorry, that's not the correct number. Try again!";
    }

    res.json({ message });
});

app.listen(port, () => {
    console.log(`App listening at http://localhost:${port}`);
});
