#Authors: David Brown
#Assignment: Lab #4
#Completed (or last revision):  9/13/2018

User_password = input("Set your password: ")
count = 0
finished = False
print(len(User_password))
while not finished and count < 5:
    if len(User_password) < 8:
         print("Invalid: password needs to be atleast 8 characters")
         print("Warning: user will be locked out after 5 failed attempts")
         User_password = input("re-enter your password: ")
         count = count+1
         print(count)
    else:
        finished = True
    
    if not finished:
        print("please try again")
    else:
        print("password is set")
            
            
            
        
flag = 0
Confirmed_password = User_password
Attempted_password = input("Enter your password:")
print(Confirmed_password)
while Attempted_password != Confirmed_password:
    if Attempted_password != Confirmed_password:
         print("Incorrect Password")
         print("Warning: user will be locked out after 3 failed attempts")
         Attempted_password = input("re-enter your password: ")
         flag = flag+1
         print(flag)
    if flag == 3: ##index start from 0 
        print("System Locked: contact an administrator")
        break


print("Have a good day")
    






'''
Set your password: Pomona
Invalid: password needs to be atleast 8 characters
Warning: user will be locked out after 5 failed attempts
re-enter your password: Pomona
1
Enter your password:Pomona
Invalid: password needs to be atleast 8 characters
Warning: user will be locked out after 5 failed attempts
re-enter your password: Pomona
2
Enter your password:Pomona
Invalid: password needs to be atleast 8 characters
Warning: user will be locked out after 5 failed attempts
re-enter your password: Pomona
3
Enter your password:Pomona
Invalid: password needs to be atleast 8 characters
Warning: user will be locked out after 5 failed attempts
re-enter your password: Pomona
4
System Locked: contact an administrator
Have a good day

Set your password: Dogbert1
8
Enter your password:dogbert
Dogbert1
Incorrect Password
Warning: user will be locked out after 3 failed attempts
re-enter your password: dogBert1
1
Incorrect Password
Warning: user will be locked out after 3 failed attempts
re-enter your password: Dogbert1
2
Have a good day
>>> 


set your password: FilthyFrank
11
Enter your password:FilthyFrank
FilthyFrank
Have a good day
>>>

set your password: DavidisGreat
12
Enter your password:DavidIsGreat
DavidisGreat
Incorrect Password
Warning: user will be locked out after 3 failed attempts
re-enter your password: davidisgreat
1
Incorrect Password
Warning: user will be locked out after 3 failed attempts
re-enter your password: DAVIDISGREAT
2
System Locked: contact an administrator
Have a good day
>>> 
'''
