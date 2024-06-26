# 베이스 이미지로 Ubuntu 사용
FROM ubuntu:20.04

# 작업 디렉토리 설정
WORKDIR /app

# 환경 변수 설정
ENV TZ=Asia/Seoul

# 필요 패키지 설치
RUN apt-get update && \
    apt-get install -y \
    build-essential \
    git \
    libsdl2-dev \
    cmake \
    make && \
    apt-get clean && \

# Freedoom 소스 코드 복제
COPY . /app/freedoom

# Freedoom 빌드
RUN cd /app/freedoom && \
    make
    
# 포트 노출
EXPOSE 10666/udp

# 애플리케이션 시작
CMD ["./freedoom"]
