# Python base image
FROM python:3.9-slim

# 앱 소스코드 복사
COPY . /app

# 작업 디렉토리 설정
WORKDIR /app

# 필요한 패키지 설치
RUN pip install --upgrade pip
RUN pip install -r requirements.txt  # 필요한 경우 requirements.txt 파일을 작성하여 추가 패키지를 설치할 수 있습니다.

# 애플리케이션 실행 (예: 숫자 맞추기 게임 실행)
CMD ["python", "number_guessing_game.py"]
