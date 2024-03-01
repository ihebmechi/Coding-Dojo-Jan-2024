from flask import Flask, render_template, request, session
import random

app = Flask(__name__)
app.secret_key = 'your_secret_key'

@app.route('/', methods=['GET', 'POST'])
def index():
    if 'number' not in session:
        session['number'] = random.randint(1, 100)
        session['guesses'] = 0

    if request.method == 'POST':
        guess = int(request.form['guess'])
        session['guesses'] += 1
        if guess == session['number']:
            message = f"Congratulations! You guessed the number {session['number']} in {session['guesses']} guesses. Play again?"
            session.pop('number')
            session.pop('guesses')
        elif guess < session['number']:
            message = "Too low! Try again."
        else:
            message = "Too high! Try again."
        return render_template('index.html', message=message)
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)
