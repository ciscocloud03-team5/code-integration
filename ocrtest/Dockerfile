# Node.js의 최신 LTS 버전 이미지를 사용합니다.
FROM node:18

# 작업 디렉토리를 설정합니다.
WORKDIR /app

# package.json과 package-lock.json 파일을 복사합니다.
COPY package*.json ./

# 의존성을 설치합니다.
RUN npm install

# 애플리케이션의 소스 코드를 복사합니다.
COPY . .

# 애플리케이션이 수신할 포트를 노출합니다.
EXPOSE 3000

# 애플리케이션을 시작합니다.
CMD ["node", "app.js"]
