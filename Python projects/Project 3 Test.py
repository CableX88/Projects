shell_list = ['Puka','Cone', 'Driftwood', 'Sea Glass','Starfish']
value_list =[]
college_friends = ['Alex']
for s in college_friends:
    print("Hello",s,"! Please tell me how many different shells you collected:")
    for shell in shell_list:
        
        val = int(input("Enter how many shells collected:"))
        value_list.append(val)
        print(value_list)
        ##print(shell_list)
        zipped_tup = list(zip(shell_list,value_list))
        print(zipped_tup)
        print(shell,':',val)
        ##shell_list = shell_list.copy()
        print('\n')
