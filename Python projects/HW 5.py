#David Brown
#ID: 837183
#This program calculates the costs of loans
class Loan:
    def __init__(self, rate = 2.5, years = 1, loan = 1000, borrower = " "):
        self.__rate = rate #the interest rate for your loan
        self.__years = years # the years you have to pay for
        self.__loan = loan # your loan 
        self.__borrower = borrower # I.E you

    def getRate(self): ## Annual Interest Rate
        return self.__rate

    def getYears(self): ## Number of Years loan is for
        return self.__years

    def getLoan(self): ## Ammount of the Loan
        return self.__loan

    def getBorrower(self): ## Name of the Borrower meaning you
        return self.__borrower

    def setRate(self, rate):
        self.__rate = rate

    def setYears(self, years):
        self.__years = years

    def setLoan(self, loan):
        self.__loan = loan


    def setBorrower(self, borrower):
        self.__borrower = borrower

    def getMonthlyPayment(self):
        MonthlyIntrestRate = self.__rate / 1200 ## the  Monthly Interest Rate for the loan
        monthlyPayment = (self.__loan * MonthlyIntrestRate) / (1 - (1 / (1 + MonthlyIntrestRate) ** (self.__years * 12)))
        return monthlyPayment

    def getTotalPayment(self):
        totalPayment = self.getMonthlyPayment() * self.__years * 12
        return totalPayment

def main():
    loan = Loan()
    loan.setRate(float(input("Enter yearly interest rate, for example, 7.25: ")))
    loan.setYears(float(input("Enter number of years as an integer: "))) 
    loan.setLoan(float(input("Enter a loan amount, for example, 120000.95: "))) 
    loan.setBorrower(input("Enter a borrower's name: "))
    print("The loan is for", loan.getBorrower())
    print("The monthly payment is",format(loan.getMonthlyPayment(),'.2f'))
    print("The total payment is",format(loan.getTotalPayment(),'.2f'))
    print()
    print()
    changeL=input("Do you want to change the loan ammount? Y for yes, enter to quit: ")
    while changeL.upper() == "Y":
        loan.setLoan(float(input("Enter new loan amount: ")))
        print("The loan is for", loan.getBorrower())
        print("The monthly payment is",format(loan.getMonthlyPayment(),'.2f'))
        print("The total payment is",format(loan.getTotalPayment(),'.2f'))
        changeL=input("Do you want to change the loan ammount? Y for yes, enter to quit: ")
main()

##================== RESTART: D:\python projects CS10\HW 5.py ==================
##Enter yearly interest rate, for example, 7.25: 2.5
##Enter number of years as an integer: 5
##Enter a loan amount, for example, 120000.95: 1000.00
##Enter a borrower's name: David Brown
##The loan is for David Brown
##The monthly payment is 17.75
##The total payment is 1064.84
##
##
##Do you want to change the loan ammount? Y for yes, enter to quit: Y
##Enter new loan amount: 5000
##The loan is for David Brown
##The monthly payment is 88.74
##The total payment is 5324.21
##Do you want to change the loan ammount? Y for yes, enter to quit: 
