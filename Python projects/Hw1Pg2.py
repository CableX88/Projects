#David Brown
#837183
#Homework 1 program 2
#This program calculates the total amount of a meal at a restaurant
#with tip and tax

#input
charge = float(input("Enter the charge for food:$"))

#formulas
tip = 15 #15% tip rate
tax = 7.25 # 7.25% tax rate

#calc
total = (charge) + (charge) * (tip/100) + (charge)*(tax/100)

#output

print("Tip:",format(tip,',.2f')+" percent")
print("Tax:",format(tax,',.2f')+" percent")
print("Total bill: $",format(total,',.2f'), sep='')

##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw1Pg2.py =====
##Enter the charge for food:$100
##Tip: 15.00 percent
##Tax: 7.25 percent
##Total bill: $122.25
##>>> 
