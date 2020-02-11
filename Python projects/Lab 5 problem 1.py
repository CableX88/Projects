#Authors: David Brown
#Assignment: Lab #5 problem 1
#Completed (or last revision):  9/22/2018

import random

def my_random_Superlotto():
    luckyNum = range(1,47)# gives all integers between 1 and 47
    MEGA_Num = random.randint(1,27)
    #puts random numbers in a mutable list ,k being the size of the list
    SuperLotto = random.sample(luckyNum,k=5)
    SuperLotto.append(MEGA_Num)
    print(SuperLotto)

def main():
    
    print('Here are your lotto numbers:')
    for i in range(3):
        my_random_Superlotto()

main()

    

'''
Here are your lotto numbers:
[33, 15, 40, 21, 36, 15]
[27, 1, 13, 21, 25, 9]
[9, 4, 46, 8, 25, 14]
'''


