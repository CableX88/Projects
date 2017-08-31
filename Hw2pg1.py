import random
lott = random.randint(10,99)
print(lott) 
choice = int(input("Enter your two digit number: "))

lottOnes = lott % 10
lottTens = (lott- lottOnes) // 10
C_Ones = choice % 10
C_Tens = (choice - C_Ones) // 10

print(" the lottery numbers are: ", lott)
if lott == choice:
    print("Congratulations, Both your numbers matched in the same order!, You won $10,000!")
elif C_Ones == lottTens and lottOnes == C_Tens :
    print("Awesome, your numbers matched in different order, you win $3,000")
elif lottOnes == C_Tens or C_Ones == lottTens or C_Tens == lottOnes:
    print("Not Bad , One of your numbers matched!, you won $1,000!")
else:
    print("Bummber dude, Your numbers did not match the lottery numbers.")
    
##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw2pg1.py =====
##88
##Enter your two digit number: 88
## the lottery numbers are:  88
##Congratulations, Both your numbers matched in the same order!, You won $10,000!
##>>> 
##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw2pg1.py =====
##21
##Enter your two digit number: 12
## the lottery numbers are:  21
##Awesome, your numbers matched in different order, you win $3,000
##>>> 
##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw2pg1.py =====
##14
##Enter your two digit number: 41
## the lottery numbers are:  14
##Awesome, your numbers matched in different order, you win $3,000
##>>> 
##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw2pg1.py =====
##70
##Enter your two digit number: 55
## the lottery numbers are:  70
##Bummber dude, Your numbers did not match the lottery numbers.
##>>> 
