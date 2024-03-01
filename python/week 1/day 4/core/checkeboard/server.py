from flask import Flask, render_template

app = Flask(__name__)

# Root route: render 8x8 checkerboard
@app.route('/')
def index():
    return render_template('checkerboard.html', rows=8, cols=8)

# Route with one parameter for rows: render checkerboard with x rows
@app.route('/<int:x>')
def custom_rows_checkerboard(x):
    return render_template('checkerboard.html', rows=x, cols=8)

# Route with two parameters for rows and columns: render checkerboard with x rows and y columns
@app.route('/<int:x>/<int:y>')
def custom_rows_cols_checkerboard(x, y):
    return render_template('checkerboard.html', rows=x, cols=y)

# Route with four parameters for rows, columns, color1, and color2
@app.route('/<int:x>/<int:y>/<color1>/<color2>')
def custom_rows_cols_colors_checkerboard(x, y, color1, color2):
    return render_template('checkerboard.html', rows=x, cols=y, color1=color1, color2=color2)

if __name__ == '__main__':
    app.run(debug=True)
