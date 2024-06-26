# 베이스 이미지로 Ubuntu 사용
FROM ubuntu:20.04

# 작업 디렉토리 설정
WORKDIR /app

# 필요 패키지 설치
RUN apt-get update && apt-get install -y \
    build-essential \
    git \
    libsdl2-dev \
    cmake \
    && apt-get clean

# Freedoom 소스 코드 복제
COPY . /app/freedoom

# Freedoom 빌드
RUN cd /app/freedoom && \
    make

# 엔트리포인트 설정
ENTRYPOINT ["/app/freedoom/src/freedoom2.wad"]

