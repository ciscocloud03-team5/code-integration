# Base image with Python 3.8
FROM python:3.8

# Set working directory
WORKDIR /app

# Copy requirements file and install dependencies
COPY requirements.txt .
RUN pip install -r requirements.txt

# Copy the Python script for the game
COPY guess_number_game.py .

# Command to run the game when container starts
CMD ["python", "guess_number_game.py"]
