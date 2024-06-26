# base image
FROM nginx:latest

# directory set
WORKDIR /app

# nginx package add
RUN apk add nginx

# file copy
COPY . .

# port 80
EXPOSE 80

# excute 
CMD ["nginx", "-g", "daemon off;"]
