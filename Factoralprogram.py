def fact(n):
    if n==0:
        return 1
    else:
        return n * fact(n-1)

def main():
    n = int(input('Enter a non-negative integer: '))
    f = fact(n)
    print('The factorial of', n, 'is',f)
main()
##============ RESTART: E:/python projects CS10/Factoralprogram.py ============
##Enter a non-negative integer: 4
##The factorial of 4 is 24
##>>> 
