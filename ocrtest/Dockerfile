# 베이스 이미지 선택
FROM openjdk:11-jre-slim

# 작업 디렉토리 설정
WORKDIR /app

# 필요한 파일 복사
COPY . /app

# 포트 설정 (Minecraft 서버의 기본 포트는 25565)
EXPOSE 25565

# 컨테이너 시작 시 실행할 명령
CMD ["java", "-Xmx1024M", "-Xms1024M", "-jar", "minecraft_server.1.16.5.jar", "nogui"]
