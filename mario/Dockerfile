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

# 포트 8080
EXPOSE 8080

# 애플리케이션 실행
CMD ["npm", "start"]
