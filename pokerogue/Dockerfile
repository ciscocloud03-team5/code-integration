# Node.js 베이스 이미지 사용
FROM node:20.13.1

# 작업 디렉토리 설정
WORKDIR /app

# package.json과 package-lock.json 복사
COPY package*.json ./

# 의존성 설치
RUN npm install

# 애플리케이션 코드 복사
COPY . .

# 포트 8000 노출
EXPOSE 8000

# 애플리케이션 시작
CMD ["npm", "run", "start:dev"]
