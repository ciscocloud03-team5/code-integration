# 베이스 이미지 선택
FROM openjdk:11-jre-slim

# 작업 디렉토리 설정
WORKDIR /app

# 필요한 파일 복사
COPY ServerScript.jar /app

# 포트 설정 (도구에 따라 필요한 포트를 설정해야 할 수 있습니다)
EXPOSE 25565

# 컨테이너 시작 시 실행할 명령
CMD ["java", "-jar", "ServerScript.jar"]
