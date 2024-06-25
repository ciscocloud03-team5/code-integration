# Nginx 베이스 이미지 가져오기
FROM nginx:latest

# 컨테이너 내의 Nginx 설정 파일 교체
COPY nginx.conf /etc/nginx/nginx.conf

# HTML 파일을 Nginx의 기본 문서 루트로 복사
COPY index.html /usr/share/nginx/html/index.html

# Nginx 실행
CMD ["nginx", "-g", "daemon off;"]
