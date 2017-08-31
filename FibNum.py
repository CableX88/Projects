def fib(n):
    if (n==1 or n==2):
        return 1
    else:
        return fib(n-1)+fib(n-2)

def main():
    n = int(input('Enter the position of series:'))
    f = fib(n)
    print('the value is',f)
main()
##================= RESTART: E:/python projects CS10/FibNum.py =================
##Enter the position of series:6
##the value is 8
##>>> 
