# Node.js를 베이스 이미지로 사용합니다.
FROM node:14

# 작업 디렉토리 설정
WORKDIR /app

# package.json과 package-lock.json 파일을 복사합니다.
COPY package*.json ./

# npm 캐시를 정리하고 의존성을 설치합니다.
RUN npm install

# 애플리케이션의 소스 코드를 복사합니다.
COPY . .

# 포트 설정 (필요한 포트를 설정해야 할 수 있습니다)
EXPOSE 8080

# 컨테이너 시작 시 실행할 명령
CMD ["npm", "start"]
