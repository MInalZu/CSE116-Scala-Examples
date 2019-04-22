from flask import Flask, send_from_directory, request, render_template
from flask_socketio import SocketIO, emit

app = Flask(__name__)
socket_server = SocketIO(app)

# Tip: the emit method has an optional parameter "broadcast" which when set to True will
#      emit to all connected websockets


@app.route('/')
def index():
    return send_from_directory('static', 'index.html')


@app.route('/<path:filename>')
def static_files(filename):
    return send_from_directory('static', filename)


print("listening on port 8080")
socket_server.run(app, port=8080)
