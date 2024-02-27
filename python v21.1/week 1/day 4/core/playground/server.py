from flask import Flask, render_template
app = Flask(__name__)
@app.route('/')
def index():
    return "this is index"
@app.route('/play/<int:times>')
def play(times):
    return render_template("index.html",times=times)

@app.route('/play/<int:times>/<color>')
def play1(times,color):
    return render_template("index.html",times=times,color=color)

if __name__=="__main__":
    app.run(debug=True)