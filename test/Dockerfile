# 베이스 이미지 : node
FROM node:14-alpine

# 작업 디렉토리 설정
WORKDIR /app

# package.json과 package-lock.json을 복사
COPY package*.json ./

# 의존성 설치
RUN npm install

# 파일 COPY
COPY . .
COPY ./images .
COPY ./music .

# 포트 8080
EXPOSE 8080

# 실행 권한 부여 (start.sh)
RUN chmod +x start.sh

# docker-entrypoint.sh 파일 COPY
COPY docker-entrypoint.sh /usr/local/bin/

# docker-entrypoint.sh 파일 실행 권한 부여
RUN chmod +x /usr/local/bin/docker-entrypoint.sh

# 컨테이너 시작 시 실행할 명령어 설정
ENTRYPOINT ["/usr/local/bin/docker-entrypoint.sh"]

# start.sh를 실행하는 CMD 명령어 추가
CMD ["./start.sh"]

