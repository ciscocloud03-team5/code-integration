# 베이스 이미지로 nginx 사용
FROM nginx:alpine

# 로컬 파일을 컨테이너로 복사
COPY . /usr/share/nginx/html

# Nginx 포트 노출
EXPOSE 80

# Nginx 실행
CMD ["nginx", "-g", "daemon off;"]
