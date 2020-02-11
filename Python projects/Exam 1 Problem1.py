##Test Program 1

##David Brown

taxable_income = float(input('Enter your income:$'))
tax_owed = 0

#calc
if taxable_income > 0 and taxable_income < 9325.0:
    tax_owed = taxable_income*0.1
elif taxable_income >= 9325.0 and taxable_income < 37950:
    tax_owed = (taxable_income*0.15)+932.50

else:
    tax_owed = (taxable_income*0.25)+5226.25

print('your taxes owed:$',tax_owed)

'''
Enter your income:$5100
your taxes owed: $510.0

Enter your income:$10050.50
your taxes owed: $2440.075

Enter your income:38012.75
your taxes owed: $14729.4375
>>>
Enter your income:$5000
your taxes owed:$ 500.0
>>> 
'''

     
