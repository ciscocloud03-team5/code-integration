# 애플리케이션 포트 설정
EXPOSE 8080
# 기반이 될 이미지 선택
FROM node:14-alpine

# 앱 디렉토리 생성
WORKDIR /usr/src/app

# 앱 종속성 설치
COPY package.json ./
RUN npm install

# 앱 소스 추가
COPY . .

# 앱 실행
CMD ["npm", "start"]

