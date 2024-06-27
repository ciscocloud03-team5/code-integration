# Base image
FROM python:3.9-slim

# Set the working directory
WORKDIR /app

# Copy the current directory contents into the container
COPY . /app

# Install any needed packages specified in requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Make port 25565 available to the world outside this container
EXPOSE 25565

# Define environment variable
ENV NAME World

# Run the application
CMD ["python", "main.py"]
