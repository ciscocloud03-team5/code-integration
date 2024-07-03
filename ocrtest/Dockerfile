# 베이스 이미지 설정
FROM nginx:alpine

# 작업 디렉토리 설정
WORKDIR /usr/share/nginx/html

# 필요한 파일 복사
COPY index.html .
COPY css ./css
COPY js ./js
COPY img ./img

# 포트 설정
EXPOSE 80
