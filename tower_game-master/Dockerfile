# 기본 컨테이너 환경을 Node.js 14-alpine으로 설정
FROM node:14-alpine

# 작업할 디렉토리를 설정
WORKDIR /app


# # package.json과 package-lock.json을 작업 디렉토리로 복사
COPY ./tower_game-master/package*.json ./
# 의존성 설치
# package.json 파일에 명시된 모든 종속성(dependencies)을 설치
# 개발 환경에서 필요한 추가적인 패키지들을 설치
RUN npm install 


# 로컬의 소스 코드를 작업 디렉토리로 복사
COPY ./tower_game-master .
# 로컬 현재폴더는 도커파일 위치 기준
# 원격 현재폴더는 위에서 설정한 작업 디렉토리 기준


# 프로덕션용 빌드 실행
RUN npm run build

# 포트 설정 (Express 애플리케이션의 경우, 애플리케이션 코드에서 포트를 설정하므로 Dockerfile에서는 설정하지 않음)
EXPOSE 6027

# 동적 애플리케이션 실행
CMD ["node", "index.js"]


# 정적 서버 실행
#CMD ["nginx", "-g", "daemon off;"] 