# Nginx의 최신 버전 이미지를 사용합니다.
FROM nginx:latest

# 작업 디렉토리를 설정합니다.
WORKDIR /usr/share/nginx/html

# 로컬의 모든 파일을 컨테이너의 작업 디렉토리로 복사합니다.
COPY . .

# Nginx가 기본적으로 80번 포트를 사용하므로 이를 노출합니다.
EXPOSE 80

# Nginx는 기본적으로 CMD가 설정되어 있어 따로 설정하지 않아도 됩니다.
