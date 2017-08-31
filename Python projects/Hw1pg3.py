#David Brown
#837183
#Homework 1 program 3
#This program calculates stock

#input
name = input("Enter Stock name: ")
shares = int(input("Enter Number of shares: "))
B = float(input("Enter Purchase price: "))#stock bought price
S = float(input("Enter selling price: "))#stock sold price
Comm = float(input("Enter comission: "))#comission ex 0.05 for 5%

#calc
TotB = shares *B #Total prices of shares bought
TBcomm = TotB * Comm #Total paid for commission when bought
TotS = shares * S #total price of shares sold
tcomS = TotS * Comm #total paid for commission when sold
GL = (TBcomm + tcomS) - (TotB - TotS)#profit gained or lost

#output
print("")
print("Stock Name:",name)
print("")
print("Ammount paid for the stock:      $",format(TotB,'10,.2f'))
print("Commission paid on the purchase: $",format(TBcomm,'10,.2f'))
print("Ammount the stock sold for:      $",format(TotS,'10,.2f'))
print("Commission paid on the sale:     $",format(tcomS,'10,.2f'))
print("Profit(or loss if negative):     $",format(GL,'10,.2f'))

##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw1pg3.py =====
##Enter Stock name: Kaplack,Inc
##Enter Number of shares: 10000
##Enter Purchase price: 33.92
##Enter selling price: 35.92
##Enter comission: 0.04
##
##Stock Name: Kaplack,Inc
##
##Ammount paid for the stock:      $ 339,200.00
##Commission paid on the purchase: $  13,568.00
##Ammount the stock sold for:      $ 359,200.00
##Commission paid on the sale:     $  14,368.00
##Profit(or loss if negative):     $  47,936.00
##>>> 
