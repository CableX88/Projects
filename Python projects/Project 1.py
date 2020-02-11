import math

#Authors: David Brown
#Assignment: project 1
#Completed (or last revision):  9/9/2018

## function for US or Imperial units of measurement for Body Mass Index
def US_BMI():
    Weight_in_pounds = float(input('Please enter your weight in pounds: '))
    while Weight_in_pounds <= 0:
        print("Error: Weight cannot be negative or zero")
        Weight_in_pounds = float(input('Please enter your weight in pounds: '))
    
    Height_in_inches = float(input('Enter your height in inches (not feet): '))
    while Height_in_inches <= 0:
        print("Error: Weight cannot be negative or zero")
        Height_in_inches = float(input('Enter your height in inches (not feet): '))
        
    BMI = Weight_in_pounds / math.pow(Height_in_inches,2)*703
    print('Here is your weight:',Weight_in_pounds,'lbs, height:',Height_in_inches,'inches')
    print('and your Body Mass Index(BMI): ',BMI)
    if BMI < 19:
        print('You are underweight')
    elif BMI >= 19 and BMI <25:
        print('You are normal weight')
    elif BMI >= 25 and BMI < 30:
        print('You are Overweight')
    elif BMI >= 30 and BMI <40:
        print('You are Obese')
    else:
        print('you are Extremely Obese' )
    
    print('Have a nice day')

#function for metric system measurements for Body Mass Index
def Metric_BMI():
    Weight_in_kilograms = float(input('Please enter your weight in kilograms: '))
    while Weight_in_kilograms <= 0:
        print("Error: Weight cannot be negative or zero")
        Weight_in_kilograms = float(input('Please enter your weight in kilograms: '))
    
    Height_in_centimeters = float(input('Enter your height in centimeters: '))
    while Height_in_centimeters <= 0:
        print("Error: Weight cannot be negative or zero")
        Height_in_neters = float(input('Enter your height in centimeters: '))
        
    MBMI = Weight_in_kilograms /math.pow(Height_in_centimeters,2)
    print('Here is your weight:',Weight_in_kilograms,'kg, height:',Height_in_centimeters,'centimeters')
    print('and your Body Mass Index(BMI): ',MBMI)
    if MBMI < 19:
        print('You are underweight')
    elif MBMI >= 19 and MBMI <25:
        print('You are normal weight')
    elif MBMI >= 25 and MBMI < 30:
        print('You are Overweight')
    elif MBMI >= 30 and MBMI <40:
        print('You are Obese')
    else:
        print('you are Extremely Obese' )
    
    print('Have a nice day')

    
# main menu for BMI calculator
def main():
    print("Welcome to David's BMI calculator")
    print('Enter 1 for US measuring standards for BMI')
    print('Enter 2 for world measuring standards for BMI')
    

    user_choice = int(input('Enter your standards for BMI calculations: '))
    
    if user_choice == 1:
      US_BMI()
    elif user_choice == 2:
     Metric_BMI()  
    else:
       print("ERROR: please enter a valid choice")
    
main()


'''
BMI calculator option 1 and US BMI test case:

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 1
Please enter your weight in pounds: 0
Error: Weight cannot be negative or zero
Please enter your weight in pounds: -1
Error: Weight cannot be negative or zero
Please enter your weight in pounds: 200
Enter your height in inches (not feet): 65
Here is your weight: 200.0 lbs, height: 65.0 inches
and your Body Mass Index(BMI):  33.27810650887574
You are Obese
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 1
Please enter your weight in pounds: 91
Enter your height in inches (not feet): 58
Here is your weight: 91.0 lbs, height: 58.0 inches
and your Body Mass Index(BMI):  19.01694411414982
You are normal weight
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 1
Please enter your weight in pounds: 70
Enter your height in inches (not feet): 58
Here is your weight: 70.0 lbs, height: 58.0 inches
and your Body Mass Index(BMI):  14.628418549346017
You are underweight
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 1
Please enter your weight in pounds: 1000
Enter your height in inches (not feet): 60
Here is your weight: 1000.0 lbs, height: 60.0 inches
and your Body Mass Index(BMI):  195.2777777777778
you are Extremely Obese
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 1
Please enter your weight in pounds: 161
Enter your height in inches (not feet): 66
Here is your weight: 161.0 lbs, height: 66.0 inches
and your Body Mass Index(BMI):  25.98324150596878
You are Overweight
Have a nice day

case test 2 Metric BMI

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 2
Please enter your weight in kilograms: 45
Enter your height in centimeters (not meters): 157.5
Here is your weight: 45.0 kg, height: 157.5 centimeters
and your Body Mass Index(BMI):  0.0018140589569160999
You are underweight
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 2
Please enter your weight in kilograms: 70
Enter your height in meters: 1.70
Here is your weight: 70.0 kg, height: 1.7 meters
and your Body Mass Index(BMI):  24.221453287197235
You are normal weight
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 2
Please enter your weight in kilograms: 170
Enter your height in meters: 2.2
Here is your weight: 170.0 kg, height: 2.2 meters
and your Body Mass Index(BMI):  35.123966942148755
You are Obese
Have a nice day
>>>

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 2
Please enter your weight in kilograms: 180
Enter your height in meters: 2.6
Here is your weight: 180.0 kg, height: 2.6 meters
and your Body Mass Index(BMI):  26.62721893491124
You are Overweight
Have a nice day

Welcome to David's BMI calculator
Enter 1 for US measuring standards for BMI
Enter 2 for world measuring standards for BMI
Enter your standards for BMI calculations: 2
Please enter your weight in kilograms: 900
Enter your height in meters: 1.5
Here is your weight: 900.0 kg, height: 1.5 meters
and your Body Mass Index(BMI):  400.0
you are Extremely Obese
Have a nice day
>>> 


'''
    
