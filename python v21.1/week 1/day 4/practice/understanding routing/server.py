from flask import Flask
app = Flask(__name__)
@app.route("/")
def hello_world():
    return "hello world!"
@app.route("/dojo")
def dash():
    return"dojo"
@app.route("/say/flask")
def flask():
    return"Hi Flask"
@app.route("/say/michel")
def michel():
    return"Hi Michel"
@app.route("/say/johni")
def johni():
    return"Hi Johni"
@app.route('/repeat/<int:num>/<name>')
def hello(name, num):
    return f" {name * num}"
@app.route('/repeat/<int:num>/<name>')
def bye(name, num):
    return f" {name * num}"
@app.route('/repeat/<int:num>/<name>')
def dogs(name, num):
    return f" {name * num}"
if (__name__ == "__main__"):
    app.run(debug=True)