# Start with a base image that has Java installed
FROM openjdk:17-jdk-alpine

# Set environment variables
ENV MINECRAFT_VERSION=1.17.1
ENV MINECRAFT_SERVER_URL=https://launcher.mojang.com/v1/objects/0d10ecbc93d403e71e44cc55bd26b43e05426c4a/server.jar

# Create a directory for the Minecraft server
RUN mkdir /minecraft

# Change to the Minecraft server directory
WORKDIR /minecraft

# Download the Minecraft server jar
RUN wget $MINECRAFT_SERVER_URL -O server.jar

# # Agree to the EULA
# RUN echo "eula=true" > eula.txt

# Expose the default Minecraft port
EXPOSE 25565

# Run the Minecraft server
CMD ["java", "-Xmx1024M", "-Xms1024M", "-jar", "server.jar", "nogui"]
