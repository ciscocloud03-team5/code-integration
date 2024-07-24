# 베이스 이미지 : Nginx image
FROM nginx:alpine

# 작업 디렉토리 설정
WORKDIR /usr/share/nginx/html

# 파일 COPY
COPY . .

# 포트 80
EXPOSE 80

# Nginx 서버 실행
CMD ["nginx", "-g", "daemon off;"]
