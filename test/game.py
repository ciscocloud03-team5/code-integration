import random

def guess_number():
    number_to_guess = random.randint(1, 100)
    attempts = 0
    while True:
        guess = input("Guess a number between 1 and 100: ")
        attempts += 1
        if not guess.isdigit():
            print("Please enter a valid number.")
            continue
        
        guess = int(guess)
        if guess < number_to_guess:
            print("Higher!")
        elif guess > number_to_guess:
            print("Lower!")
        else:
            print(f"Congratulations! You've guessed the number in {attempts} attempts.")
            break

if __name__ == "__main__":
    guess_number()
