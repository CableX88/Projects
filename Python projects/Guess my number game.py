#Guess my number game

import random
print("Guess my number from 1 to 100")
my_num = random.randint(1,100)
#print(my_num) Debug
tries = 0
guess = int(input("Take a guess"))
while guess!= my_num:
    if guess> my_num:
        print("lower")
    else:
        print("higher")
    guess = int(input("take a guess"))
    tries = tries + 1
print("you guessed it: the number was", my_num)
print("you took", tries,"tries")
##========== RESTART: E:\python projects CS10\Guess my number game.py ==========
##Guess my number from 1 to 100
##33
##Take a guess22
##higher
##take a guess44
##lower
##take a guess33
##you guessed it: the number was 33
##you took 2 tries
##>>> 
