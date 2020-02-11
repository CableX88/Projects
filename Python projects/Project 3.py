##import matplotlib issue with matplotlib



    
shell_list = ['Puka','Cone', 'Driftwood', 'Sea Glass','Starfish']
value_list =[]
new_shell_list = shell_list.copy()
college_friends = ['Alex','Bay','Dana','Max','Terry','Wes']
for s in college_friends:
    print("Hello",s,"! Please tell me how many different shells you collected:")
    for shell in shell_list:
        new_shell_list.append(shell)
        val = int(input("Enter how many shells collected:"))
        value_list.append(val)
        ##print(value_list)
        zipped_tup = list(zip(new_shell_list,value_list))
        ##print(zipped_tup)
        print(shell,':',val)
        print('\n')
        
print(zipped_tup)
ctL = []
for j in shell_list:
    ct = 0
    for item in zipped_tup:
        if item[0]==j:
            ct += item[1]
    ctL.append(ct)
print(ctL)

print('Puka:', ctL[0])
print('Cone:', ctL[1])
print('Driftwood:', ctL[2])
print('Sea Glass:', ctL[3])
print('Starfish:', ctL[4])

##Calc

Puka_sale = float(ctL[0] * 1.00)
cone_sale = float(ctL[1] * 1.50)
Driftwood_sale = float(ctL[2] * .50)
Sea_Glass_sale = float(ctL[3] * 2.00)
Starfish_sale = float(ctL[4] * 2.50)
print("Puka Profit:$",format(Puka_sale,'10,.2f'))
print("Cone Profit:$",format(cone_sale,'10,.2f'))
print("Driftwood Profit:$",format(Driftwood_sale,'10,.2f'))
print("Sea Glass Profit:$",format(Sea_Glass_sale,'10,.2f'))
print("Starfish Profit:$",format(Starfish_sale,'10,.2f'))

### plots shell distribution
##pyplot.bar(1,ctL[0])
##pyplot.bar(2,ctL[1])
##pyplot.bar(3,ctL[2])
##pyplot.bar(4,ctL[3])
##pyplot.bar(5,ctL[4])
##
#### creates axis labels
##pyplot.xlabel("")
##pyplot.ylabel("Frequency of each kind")

    
'''
Hello Alex ! Please tell me how many different shells you collected:
Enter how many shells collected:1
Puka : 1


Enter how many shells collected:2
Cone : 2


Enter how many shells collected:3
Driftwood : 3


Enter how many shells collected:4
Sea Glass : 4


Enter how many shells collected:5
Starfish : 5


Hello Bay ! Please tell me how many different shells you collected:
Enter how many shells collected:1
Puka : 1


Enter how many shells collected:2
Cone : 2


Enter how many shells collected:3
Driftwood : 3


Enter how many shells collected:4
Sea Glass : 4


Enter how many shells collected:5
Starfish : 5


Hello Dana ! Please tell me how many different shells you collected:
Enter how many shells collected:1
Puka : 1


Enter how many shells collected:2
Cone : 2


Enter how many shells collected:3
Driftwood : 3


Enter how many shells collected:4
Sea Glass : 4


Enter how many shells collected:5
Starfish : 5


Hello Max ! Please tell me how many different shells you collected:
Enter how many shells collected:1
Puka : 1


Enter how many shells collected:2
Cone : 2


Enter how many shells collected:3
Driftwood : 3


Enter how many shells collected:4
Sea Glass : 4


Enter how many shells collected:5
Starfish : 5


Hello Terry ! Please tell me how many different shells you collected:
Enter how many shells collected:1
Puka : 1


Enter how many shells collected:2
Cone : 2


Enter how many shells collected:3
Driftwood : 3


Enter how many shells collected:4
Sea Glass : 4


Enter how many shells collected:5
Starfish : 5


Hello Wes ! Please tell me how many different shells you collected:
Enter how many shells collected:1
Puka : 1


Enter how many shells collected:2
Cone : 2


Enter how many shells collected:3
Driftwood : 3


Enter how many shells collected:4
Sea Glass : 4


Enter how many shells collected:5
Starfish : 5


[('Puka', 1), ('Cone', 2), ('Driftwood', 3), ('Sea Glass', 4), ('Starfish', 5), ('Puka', 1), ('Cone', 2), ('Driftwood', 3), ('Sea Glass', 4), ('Starfish', 5), ('Puka', 1), ('Cone', 2), ('Driftwood', 3), ('Sea Glass', 4), ('Starfish', 5), ('Puka', 1), ('Cone', 2), ('Driftwood', 3), ('Sea Glass', 4), ('Starfish', 5), ('Puka', 1), ('Cone', 2), ('Driftwood', 3), ('Sea Glass', 4), ('Starfish', 5), ('Puka', 1), ('Cone', 2), ('Driftwood', 3), ('Sea Glass', 4), ('Starfish', 5)]
[6, 12, 18, 24, 30]
Puka: 6
Cone: 12
Driftwood: 18
Sea Glass: 24
Starfish: 30
Puka Profit:$       6.00
Cone Profit:$      18.00
Driftwood Profit:$       9.00
Sea Glass Profit:$      48.00
Starfish Profit:$      75.00
>>> 
'''
            
            
        

    

        
        
        

   
