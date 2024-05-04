FROM node:16-alpine

WORKDIR /app

COPY package.json package-lock.json ./

RUN npm ci
# 프로젝트에서 쓴 버전 그대로 설치를 위함
COPY index.js .

ENTRYPOINT [ "node", "index.js" ]

# docker build -f Dockerfile -t fun-docker .
#               어느 파일      이미지이름
# 도커 명령어 https://docs.docker.com/reference/dockerfile/
# 도커 실행 명령어 docker run -d -p 8080:8080 fundock
#                                  호스트: 컨테이너 포트 연결
# 동작 확인 docker ps  docker파일 만들고 이미지 만든후 컨테이너 실행까지 된것
# 이미지이름 변경  tag 활용 repository의 이름과 이미지 이름이 일치해야 함 따라서 변경이 필요할 수 있음
# ex) docker tag fundock:latest 계정이름/레파지토리 이름:latest
# 변경 이후 docker login 로그인 후 docker push 를 이용하여 레파지토리에 업로드 함