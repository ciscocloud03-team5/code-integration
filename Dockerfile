# Dockerfile
FROM openjdk:17-jdk-alpine
VOLUME /data
WORKDIR /data
EXPOSE 25565

# Install necessary packages
RUN apk add --no-cache bash

# Add server JAR file
COPY server.jar .

# Accept the EULA
RUN echo "eula=true" > eula.txt

# Start the Minecraft server
CMD ["java", "-Xmx1024M", "-Xms1024M", "-jar", "server.jar", "nogui"]
