
str_list = ["13","36","ABC","20.3"]
str_list2 = ["13.1.2","3BYEs","Iphone8","$30.50"]
str_list3 = ["13.1","12","25.5","30.1","#.3","0.5","0.0","43","13.4","12.8","32b"]

def con_to_flt(str_list3):
    new_lst =[]
    num_lst =[]
    for i in str_list3:
        new_lst.append(i)
        print(new_lst)
        if i.isdecimal() ==True:
            print("all good")
        elif i.isalnum() == False and i.isalpha() == True:
            print(i)
            pass
        elif i.isnumeric() == True and i.isalpha()== False:
            print(i)
            
            
        else:
            print("value is ignored")
            new_lst.remove(i)
            
    for j in new_lst:
        num_lst.append(float(j))
    if len(num_lst) == 0:
        print("Average: 0.0")
    else:
        print("Average:",sum(num_lst)/len(num_lst))
        print(new_lst)

##con_to_flt(str_list3)

## Final Problem 2

Pass_Manage_Sys ={"Ted": "p123","Andrew": "d19","Kenny": "stf456", "Jamie": "tdx1982"}
def add_new_users(Pass_Manage_Sys):
    print("Entering new account")
    account_name = input("Enter you new account name: ")
    if account_name not in Pass_Manage_Sys:
        
        account_pw = input("Enter your new account password: ")
        Pass_Manage_Sys[account_name] = account_pw
        print("new user successfully added")
    else:
        print("User already exists")
    print(Pass_Manage_Sys)
def user_authentication(Pass_Manage_Sys):
    entry_tries = 0 ## count variable
    print("user authentication")
    while entry_tries < 3:
        acc_name = input("Enter your account name: ")
        if acc_name in Pass_Manage_Sys:
            print(acc_name,"is in the system")
            acc_pw = input("Enter the password: ")
            if Pass_Manage_Sys[acc_name] == acc_pw:
                print("login successful")
            else:
                print("Eror: wrong password")
                entry_tries = entry_tries+1
            
                  
        else:
                  print("User not found")
                  entry_tries = entry_tries+1
                  
            
                  

print(Pass_Manage_Sys)
print("Have a nice day")



add_new_users(Pass_Manage_Sys)
user_authentication(Pass_Manage_Sys)
                  

'''
first test case:

["13","36","ABC","20.3"]

['13']
all good
['13', '36']
all good
['13', '36', 'ABC']
value is ignored
['13', '36', '20.3']
Average: 23.099999999999998
['13', '36', '20.3']

second test case:

['13.1.2']
value is ignored
['3BYEs']
value is ignored
['Iphone8']
value is ignored
['$30.50']
value is ignored
Average: 0.0

third test case:

'13.1']
value is ignored
['12']
all good
['12', '25.5']
value is ignored
['12', '30.1']
value is ignored
['12', '#.3']
value is ignored
['12', '0.5']
value is ignored
['12', '0.0']
value is ignored
['12', '43']
all good
['12', '43', '13.4']
value is ignored
['12', '43', '12.8']
value is ignored
['12', '43', '32b']
value is ignored
Average: 27.5
['12', '43']


problem 2

for adding new accounts:

{'Ted': 'p123', 'Andrew': 'd19', 'Kenny': 'stf456', 'Jamie': 'tdx1982'}
Entering new account
Enter you new account name: David
Enter your new account password: dman99
new user successfully added
{'Ted': 'p123', 'Andrew': 'd19', 'Kenny': 'stf456', 'Jamie': 'tdx1982', 'David': 'dman99'}

{'Ted': 'p123', 'Andrew': 'd19', 'Kenny': 'stf456', 'Jamie': 'tdx1982'}
Entering new account
Enter you new account name: Ted
User already exists
{'Ted': 'p123', 'Andrew': 'd19', 'Kenny': 'stf456', 'Jamie': 'tdx1982'}

user authentication
Enter your account name: Ted
Ted is in the system
Enter the password: p123
login successful
Enter your account name: Drew
User not found
Enter your account name: Kenny
Kenny is in the system
Enter the password: I love math
Eror: wrong password
Enter your account name: George
User not found
'''
    
