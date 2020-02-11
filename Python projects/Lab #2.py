import math
#Authors: David Brown
#Assignment: Lab #2
#Completed (or last revision):  09/3/2018

#user input
Weight_in_pounds =  float(input('Please enter your weight in pounds: '))
Height_in_inches = float(input('Enter your height in inches (not feet): '))

#BMI calculation
BMI = Weight_in_pounds /math.pow(Height_in_inches,2)*703

#output
print('Here is your weight:',Weight_in_pounds,'lbs, height:',Height_in_inches,'inches')
print('and your Body Mass Index(BMI): ',BMI)
print('Have a nice day')

'''
= RESTART: C:/Users/DAVIDX2X/Desktop/Cal Poly Pomona CS Hw Prompts/Lab #2.py =
Please enter your weight in pounds: 250
Enter your height in inches (not feet): 78
Here is your weight: 250 lbs, height: 78 inches
and your Body Mass Index(BMI):  28.887245233399078
Have a nice day

Please enter your weight in pounds: 102
Enter your height in inches (not feet): 56
Here is your weight: 102 lbs, height: 56 inches
and your Body Mass Index(BMI):  22.86543367346939
Have a nice day

Please enter your weight in pounds: 160.5
Enter your height in inches (not feet): 71
Here is your weight: 160.5 lbs, height: 71 inches
and your Body Mass Index(BMI):  22.382761356873637
Have a nice day

Please enter your weight in pounds: 250
Enter your height in inches (not feet): 67.5
Here is your weight: 250.0 lbs, height: 67.5 inches
and your Body Mass Index(BMI):  38.57338820301783
Have a nice day

optional test cases:

Please enter your weight in pounds: 0
Enter your height in inches (not feet): 67
Here is your weight: 0.0 lbs, height: 67.0 inches
and your Body Mass Index(BMI):  0.0
Have a nice day


'''
