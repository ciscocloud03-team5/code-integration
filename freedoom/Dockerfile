# 베이스 이미지로 Ubuntu 사용
FROM ubuntu:20.04

# 작업 디렉토리 설정
WORKDIR /app

# 환경 변수 설정
ENV TZ=Asia/Seoul

# 필요 패키지 설치
RUN apt-get update && \
    apt-get install -y tzdata wget unzip zandronum && \
    ln -fs /usr/share/zoneinfo/Asia/Seoul /etc/localtime && \
    dpkg-reconfigure --frontend noninteractive tzdata
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
    
# 포트 노출
EXPOSE 10666/udp

# 엔트리포인트 설정
CMD ["zandronum-server", "-iwad", "/usr/share/games/doom/freedoom2.wad", "+host", "1"]
