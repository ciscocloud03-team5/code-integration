# 베이스 이미지 : node
FROM nginx:alpine

# 작업 디렉토리 설정
WORKDIR /app

# 파일 COPY
COPY . .

# 포트 8080
EXPOSE 8080

# 서버 실행
CMD ["nginx", "-g", "daemon off;"]
