# number_guessing_game.py

import random

def number_guessing_game():
    number_to_guess = random.randint(1, 100)
    attempts = 0
    guess = None

    print("숫자 맞추기 게임에 오신 것을 환영합니다! 1부터 100 사이의 숫자를 맞춰보세요.")

    while guess != number_to_guess:
        guess = int(input("숫자를 입력하세요: "))
        attempts += 1

        if guess < number_to_guess:
            print("더 큰 숫자입니다. 다시 시도하세요.")
        elif guess > number_to_guess:
            print("더 작은 숫자입니다. 다시 시도하세요.")
        else:
            print(f"축하합니다! {attempts}번 만에 맞추셨습니다.")

if __name__ == "__main__":
    number_guessing_game()
