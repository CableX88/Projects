player_name_lst =["John","Tam","Ken","Jesse"]
rating_lst =[]

for p in player_name_lst:
    print("Enter",p,"'s Rating: ")
    rating = int(input())
    rating_lst.append(rating)
    print(rating_lst)

player_tup =dict(zip(player_name_lst,rating_lst))

print('Roster')
for name in sorted(player_tup) :
    print(name, player_tup[name])
    
print(player_tup)

'''
Enter John 's Rating: 
2
[2]
Enter Tam 's Rating: 
3
[2, 3]
Enter Ken 's Rating: 
1
[2, 3, 1]
Enter Jesse 's Rating: 
6
[2, 3, 1, 6]
Roster
Jesse 6
John 2
Ken 1
Tam 3
{'John': 2, 'Tam': 3, 'Ken': 1, 'Jesse': 6}
'''
