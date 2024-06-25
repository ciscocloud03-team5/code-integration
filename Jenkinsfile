# Dockerfile

# 베이스 이미지로 파이썬 3.9 사용
FROM python:3.9

# 작업 디렉토리 설정
WORKDIR /app

# 현재 디렉토리의 모든 파일을 컨테이너의 /app 디렉토리로 복사
COPY . /app

# 실행에 필요한 패키지 설치 (여기서는 별도의 패키지가 필요하지 않지만 일반적인 경우를 대비)
RUN pip install --no-cache-dir -r requirements.txt || echo "requirements.txt is empty"

# 스크립트 실행
CMD ["python", "number_guessing_game.py"]
