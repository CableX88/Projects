#Homework 3 Program 1
#David Brown
#8360232
#CS 10

def load():
    name = input("Enter Stock name: ")
    shares = int(input("Enter Number of shares: "))
    B = float(input("Enter Purchase price: "))#stock bought price
    S = float(input("Enter selling price: "))#stock sold price
    Comm = float(input("Enter comission: "))#comission ex 0.05 for 5%
    return name, shares, B, S, Comm

def calc(name, shares, B, S, Comm):
    TotB = shares *B #Total prices of shares bought
    TBcomm = TotB * Comm #Total paid for commission when bought
    TotS = shares * S #total price of shares sold
    tcomS = TotS * Comm #total paid for commission when sold
    GL = (TBcomm + tcomS) - (TotB - TotS)#profit gained or lost
    return TotB, TBcomm, TotS, tcomS, GL

def Print(name, TotB, TBcomm, TotS, tcomS, GL):
    print("")
    print("Stock Name:",name)
    print("")
    print("Ammount paid for the stock:      $",format(TotB,'10,.2f'))
    print("Commission paid on the purchase: $",format(TBcomm,'10,.2f'))
    print("Ammount the stock sold for:      $",format(TotS,'10,.2f'))
    print("Commission paid on the sale:     $",format(tcomS,'10,.2f'))
    print("Profit(or loss if negative):     $",format(GL,'10,.2f'))

def main():
        end = "Y"
        total_profit = 0.0
        while end.upper() == "Y":
            name, shares, B, S, Comm = load()
            TotB, TBcomm, TotS, tcomS, GL = calc(name, shares, B, S, Comm)
            Print(name,TotB, TBcomm, TotS, tcomS, GL)
            total_profit = total_profit + GL
            end = input("press y to continue, anything else to end: ")
            print()
        print("The total profit is $",format(total_profit, ',.2f'),sep='')
        
main()
##=============== RESTART: G:\python projects CS10\HW 3 pg 1.py ===============
##Enter Stock name: Dave, inc
##Enter Number of shares: 1000
##Enter Purchase price: 10000
##Enter selling price: 1000000
##Enter comission: 0.05
##
##Stock Name: Dave, inc
##
##Ammount paid for the stock:      $ 10,000,000.00
##Commission paid on the purchase: $ 500,000.00
##Ammount the stock sold for:      $ 1,000,000,000.00
##Commission paid on the sale:     $ 50,000,000.00
##Profit(or loss if negative):     $ 1,040,500,000.00
##press y to continue, anything else to end: y
##
##Enter Stock name: Brown Corp
##Enter Number of shares: 12345
##Enter Purchase price: 1234
##Enter selling price: 123456
##Enter comission: 0.05
##
##Stock Name: Brown Corp
##
##Ammount paid for the stock:      $ 15,233,730.00
##Commission paid on the purchase: $ 761,686.50
##Ammount the stock sold for:      $ 1,524,064,320.00
##Commission paid on the sale:     $ 76,203,216.00
##Profit(or loss if negative):     $ 1,585,795,492.50
##press y to continue, anything else to end: peace out
##
##The total profit is $2,626,295,492.50
##>>> 
