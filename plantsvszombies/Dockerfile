# 베이스 이미지 설정
FROM ubuntu:20.04

# 필요한 패키지 설치
RUN apt-get update && apt-get install -y \
    cmake \
    g++ \
    libsfml-dev \
    make \
    git

# 작업 디렉토리 설정
WORKDIR /app

# 프로젝트 파일 복사
COPY . .

# 빌드
RUN cmake . && make

# 컨테이너가 노출할 포트 번호 설정 (예: 8080)
EXPOSE 8080

# 실행
CMD ["./plantsVSzombies"]
