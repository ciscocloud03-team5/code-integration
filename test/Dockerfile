# 베이스 이미지 설정
FROM node:14

# 작업 디렉토리 설정
WORKDIR /usr/src/app

# package.json 및 package-lock.json 파일 복사
COPY package*.json ./

# 종속성 설치
RUN npm install --verbose

# 애플리케이션 소스 코드 복사
COPY . .

# 애플리케이션 포트 설정
EXPOSE 8080

# 애플리케이션 실행 명령어
CMD [ "node", "index.js" ]
