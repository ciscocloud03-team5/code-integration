# 베이스 이미지를 설정합니다. Node.js 버전과 운영체제(OS)를 선택합니다.
ARG GIT_TAG=${GIT_TAG:-main}
ARG NODE_VERSION=${NODE_VERSION:-20.13.1}
ARG OS=${OS:-alpine}
ARG VITE_BYPASS_LOGIN=${VITE_BYPASS_LOGIN:-1}
### 이 부분은 아직 제대로 작동하지 않는 것 같습니다. 따라서 아래에 프록시와 삽입을 추가합니다.
ARG VITE_SERVER_URL=${VITE_SERVER_URL:-http://0.0.0.0:8001}
ARG VITE_API_BASE_URL=${VITE_API_BASE_URL:-http://0.0.0.0:8001}

# 베이스 이미지로 설정합니다.
FROM node:${NODE_VERSION}-${OS} as base

# 환경 변수를 설정합니다.
ENV VITE_BYPASS_TUTORIAL=0 \
    NEXT_TELEMETRY_DISABLED=1

# 빌드 단계입니다.
FROM base as build

# 이전에 정의한 ARG 변수를 설정합니다.
ARG GIT_TAG \
    VITE_BYPASS_LOGIN \
    VITE_SERVER_URL \
    VITE_API_BASE_URL

WORKDIR /app

# GitHub 리포지토리에서 소스를 추가합니다.
ADD --keep-git-dir=false https://github.com/pagefaultgames/pokerogue.git#${GIT_TAG} /app

# npm 패키지를 캐시하여 설치합니다.
RUN --mount=type=cache,target=/root/.npm \
    npm ci

# src/utils.ts 파일의 특정 부분을 수정합니다.
RUN sed -i 's|const serverUrl = .*|const serverUrl = `${window.location.origin}/api`;\n|' src/utils.ts
RUN sed -i 's|export const apiUrl = .*|export const apiUrl = isLocal ? serverUrl : serverUrl;|' src/utils.ts

# 빌드 과정에서 메모리 사용량을 늘려서 빌드합니다.
RUN NODE_OPTIONS=--max-old-space-size=8192 node /usr/local/bin/npm run build

# 최종 앱 단계입니다.
FROM base as app

# 환경 변수를 설정합니다.
ENV NODE_ENV=production \
    PORT=${PORT:-8000}

# Vite를 글로벌로 설치합니다.
RUN npm install --location=global vite

# 사용자 권한을 node로 변경합니다.
USER node

# 작업 디렉토리를 설정합니다.
WORKDIR /app

# 빌드 단계에서 생성된 파일을 복사합니다.
COPY --from=build /app/dist/ .
COPY --from=build /app/package.json ./package.json

# 포트를 노출합니다.
EXPOSE $PORT

# Vite 서버를 실행합니다.
CMD vite --host --port $PORT
