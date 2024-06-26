# 공식 경량 Python 3.9 이미지를 사용합니다
FROM python:3.9-slim

# 시스템 종속성을 설치합니다
RUN apt-get update && apt-get install -y --no-install-recommends \
    build-essential \
    libpq-dev \
    && rm -rf /var/lib/apt/lists/*

# 컨테이너 내 작업 디렉토리를 설정합니다
WORKDIR /app

# requirements 파일을 컨테이너로 복사합니다
COPY requirements.txt .

# 필요한 종속성을 설치합니다
RUN pip install --upgrade pip
RUN pip install --no-cache-dir -r requirements.txt

# 애플리케이션 코드의 나머지 부분을 컨테이너로 복사합니다
COPY . .

# 애플리케이션을 실행할 명령을 설정합니다
CMD ["python", "your_script.py"]