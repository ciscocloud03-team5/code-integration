# 기본 컨테이너 환경을 웹인 nginx로 구성
FROM nginx:alpine 

# 작업할 디렉토리를 설정
WORKDIR /app

# 로컬 파일을 작업디렉토리로 copy 해주기
COPY ./tower_game-master .

# 포트 설정
EXPOSE 6027

# 서버 실행
CMD ["nginx", "-g", "daemon off;"] 