# base image
FROM alpine:latest

# directory set
WORKDIR /app

# Python 설치
RUN apk add nginx
RUN apk add --no-cache python3 py3-pip

# file copy
COPY . .

# port 80
EXPOSE 80

# excute 
# CMD ["nginx", "-g", "daemon off;"]
CMD ["python3", "-m", "http.server", "80"]
