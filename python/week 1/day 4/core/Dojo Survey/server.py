from flask import Flask, render_template, request, redirect, session, url_for

app = Flask(__name__)
app.secret_key = 'your_secret_key'  


@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        session['name'] = request.form['name']
        session['email'] = request.form['email']
        return redirect(url_for('result'))
    return render_template('index.html')


@app.route('/result')
def result():
    name = session.get('name')
    email = session.get('email')
    return render_template('result.html', name=name, email=email)


if __name__ == '__main__':
    app.run(debug=True,port=5001)
