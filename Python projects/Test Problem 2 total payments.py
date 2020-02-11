payments = float(input("Enter your payments:"))

total_payments = 0
count =0
while payments != -1.0:
     total_payments = total_payments+ payments
     payments = float(input("Enter your payments:"))
     count = count +1
     print(count,"payments recieved")
    
print(total_payments)

'''
Enter your payments:50.0
Enter your payments:25.5
1 payments recieved
Enter your payments:32.2
2 payments recieved
Enter your payments:10.4
3 payments recieved
Enter your payments:-1
4 payments recieved
118.10000000000001

Enter your payments:-1
0
'''
