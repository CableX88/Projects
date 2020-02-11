#name: David Brown
#class: CS 2990

def createDB(names,pwds):
     DB =dict(zip(names,pwds))
     print(DB)
     return DB

def updatePwds(pwds):
    leng = "$"
    for i in pwds:
        if len(i) <= 8:
            i + leng
        elif len(i) > 8:
            i.strip()
        print(i)
    

def addNewAcct(DB):
    acct_C = input("Which account would you like to add?:")
    if acct_C in DB:
        print("Account Exists")
    else:
        pwds_create = input("which password would you like to set?:")
    DB.update(acct_C = pwds_create)
    print(DB)
    return DB

    
    
def delAcct(DB):
    print(DB)
    remov_acct = input("Which account would you like to delete?:")
    del DB[remov_acct]
    print(DB)
    return DB

    
    
        
    

def main():
    names =["Ted","Alex","Bob","Jess","Nan"]
    pwds = ["AAABBB","ThlsBeautiful","Be1There","ThankU2","HappyBday2U"]
    createDB(names,pwds)
    DB = createDB(names,pwds)
    updatePwds(pwds)
    addNewAcct(DB)
    delAcct(DB)

main()

'''
{'Ted': 'AAABBB', 'Alex': 'ThlsBeautiful', 'Bob': 'Be1There', 'Jess': 'ThankU2', 'Nan': 'HappyBday2U'}
{'Ted': 'AAABBB', 'Alex': 'ThlsBeautiful', 'Bob': 'Be1There', 'Jess': 'ThankU2', 'Nan': 'HappyBday2U'}

Which account would you like to add?:David
which password would you like to set?:BigGuy4U

{'Ted': 'AAABBB', 'Alex': 'ThlsBeautiful', 'Bob': 'Be1There', 'Jess': 'ThankU2', 'Nan': 'HappyBday2U', 'acct_create': 'BigGuy4U'}
{'Ted': 'AAABBB', 'Alex': 'ThlsBeautiful', 'Bob': 'Be1There', 'Jess': 'ThankU2', 'Nan': 'HappyBday2U', 'acct_create': 'BigGuy4U'}

Which account would you like to delete?:Ted
{'Alex': 'ThlsBeautiful', 'Bob': 'Be1There', 'Jess': 'ThankU2', 'Nan': 'HappyBday2U', 'acct_create': 'BigGuy4U'}
>>> 

'''
