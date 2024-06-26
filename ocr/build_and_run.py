import os
import subprocess

# 도커 이미지 빌드
def build_docker_image():
    image_name = "my-minecraft-server"
    build_command = f"docker build -t {image_name} ."
    subprocess.run(build_command, shell=True, check=True)
    return image_name

# 도커 컨테이너 실행
def run_docker_container(image_name):
    run_command = f"docker run -d -p 25565:25565 {image_name}"
    subprocess.run(run_command, shell=True, check=True)

if __name__ == "__main__":
    image_name = build_docker_image()
    run_docker_container(image_name)
