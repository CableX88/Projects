##Test Problem 2

## David Brown
from random import *

luckyNum = randint(1,10) ##generates random numbers from 1 to 10
print('Lucky number debug:',luckyNum)
count = 0
guess = 0
flag = False
guess = int(input('Guess the lucky number:'))
while guess != luckyNum and count<3 and flag == False:
    if guess != luckyNum:
        print('bzzt Wrong answer')
        print('you have 3 attempts to get it right')
        count = count +1
        guess = int(input('Guess the lucky number:'))
    elif guess == luckyNum and count<3:
        print('great job you did it')
        print('the lucky number was:',luckyNum)
        flag = True
    else:
        print('tough luck kiddo')
        print('the lucky number was:',luckyNum)
        flag = True

print('Thanks for playing!!')       
print('Please come again!!')


'''
8
Guess the lucky number:2
bzzt Wrong answer
you have 3 attempts to get it right
Guess the lucky number:3
bzzt Wrong answer
you have 3 attempts to get it right
Guess the lucky number:4
bzzt Wrong answer
you have 3 attempts to get it right
Guess the lucky number:5
Please come again!!

Lucky number debug: 1
Guess the lucky number:1
great job you did it
the lucky number was: 1
Please come again!!
>>> 
'''
