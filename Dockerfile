# 베이스 이미지로 Node.js 사용
FROM node:14

# 작업 디렉토리 설정
WORKDIR /app

# package.json과 package-lock.json 파일을 복사
COPY package*.json ./

# 의존성 설치
RUN npm install

# 소스 코드를 복사
COPY . .

# 앱 실행 포트
EXPOSE 3000

# 애플리케이션 시작 명령어
CMD ["npm", "start"]
