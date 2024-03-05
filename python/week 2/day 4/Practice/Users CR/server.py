from flask import Flask,render_template, request,redirect

from user import user
app = Flask(__name__)

@app.route("/user/new")
def new():
    return render_template("new.html")

@app.route("/user")
def dashbord():
    all_users=user.find_all_users()
    return render_template("user.html",all_users=all_users)

@app.route("/user/add", methods=['POST'])
def add_user():
    data=request.form
    user.add(data)
    return redirect('/user')


if __name__=="__main__":
    app.run(debug=True)