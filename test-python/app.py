from flask import Flask
from prometheus_client import start_http_server, Counter
import random
import time

app = Flask(__name__)

# Prometheus metrics
REQUEST_COUNT = Counter('app_requests_total', 'Total number of requests to this application')
ERROR_COUNT = Counter('app_errors_total', 'Total number of errors in this application')

@app.route('/')
def hello_world():
    REQUEST_COUNT.inc()
    if random.random() < 0.1:  # 10% chance of error
        ERROR_COUNT.inc()
        return 'Internal Server Error', 500
    return 'Hello, World!'

if __name__ == '__main__':
    start_http_server(8000)  # Start Prometheus metrics server
    app.run(host='0.0.0.0', port=5000)
