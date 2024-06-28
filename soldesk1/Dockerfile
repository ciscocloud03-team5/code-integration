# Use a specific version of the nginx image as the base image
FROM nginx:1.21.6-alpine

# Set the maintainer label (optional)
LABEL maintainer="your-email@example.com"

# Copy the contents of the current directory to /usr/share/nginx/html in the container
COPY . /usr/share/nginx/html

# Expose port 80 to the outside world
EXPOSE 80

# Start nginx when the container launches
CMD ["nginx", "-g", "daemon off;"]
