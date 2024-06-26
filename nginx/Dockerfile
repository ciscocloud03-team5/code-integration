# Use the official NGINX image from Docker Hub
FROM nginx:latest

# Copy the static files from the web_content directory to the NGINX html directory
COPY web_content/index.html /usr/share/nginx/html/
COPY web_content/script.js /usr/share/nginx/html/
COPY web_content/style.css /usr/share/nginx/html/

# Expose port 80 to the outside world
EXPOSE 80

# Command to run NGINX
CMD ["nginx", "-g", "daemon off;"]