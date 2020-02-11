

def addPlayer(player_dict):
    player =input("Enter a player: ")
    print("Enter",player,"'s Rating: ")
    rating = int(input())
    player_dict[player] = rating
    print(player_dict)
    return player_dict

def removePlayer(player_dict):
    print(player_dict)
    delete_player = input("which player do you want to remove: ")
    del player_dict[delete_player]
    return player_dict

def updatePlayer(player_dict):
    print(player_dict)
    player_update = input("which player's rating do you want to update?: ")
    rating_update = int(input('value:'))
    player_dict[player_update] = rating_update
    print(player_dict)

def outputRosterRating(player_dict):
    print(player_dict)
    sorted_player_dict = sorted(player_dict.items(), key=lambda x: x[1])
    print(sorted_player_dict)

def outputAboveRating(player_dict):
    print(player_dict)
    sortparam = int(input("Enter your sort param: "))
    
    for keys, values  in player_dict.items():
        if keys > sortparam:
            print(values)
        
    
    
    

player_dict ={"Kirk" : 9, "Spock": 6, "Sulu": 7}
print(player_dict)
    
def main():    

    print(player_dict)
    print("MENU")
    print("a ---- Add a player")
    print("d ---- Remove a player")
    print("q ---- quit program")
    print("u ---- Update player rating")
    print("r ---- Output players above a rating")
    print("o ---- Output roster in order of rating")


    options = input("enter your options:")
    if options != 'q':
        print(player_dict)
        if options == 'a':
            addPlayer(player_dict)
            main()
        elif options == 'd':
            removePlayer(player_dict)
            main()
        elif options == 'u':
            updatePlayer(player_dict)
            main()
        elif options == 'r':
            outputRosterRating(player_dict)
            main()
        elif options == 'o':
            outputRosterRating(player_dict)
            main()
            
        else:
            print("please enter an actual option")
    else:
        print("Have a good day")
        
'''
{'Kirk': 9, 'Spock': 6, 'Sulu': 7}
{'Kirk': 9, 'Spock': 6, 'Sulu': 7}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:a
{'Kirk': 9, 'Spock': 6, 'Sulu': 7}
Enter a player: David
Enter David 's Rating: 
9
{'Kirk': 9, 'Spock': 6, 'Sulu': 7, 'David': 9}
{'Kirk': 9, 'Spock': 6, 'Sulu': 7, 'David': 9}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:d
{'Kirk': 9, 'Spock': 6, 'Sulu': 7, 'David': 9}
{'Kirk': 9, 'Spock': 6, 'Sulu': 7, 'David': 9}
which player do you want to remove: Spock
{'Kirk': 9, 'Sulu': 7, 'David': 9}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:u
{'Kirk': 9, 'Sulu': 7, 'David': 9}
{'Kirk': 9, 'Sulu': 7, 'David': 9}
which player's rating do you want to update?: David 11
value:11
{'Kirk': 9, 'Sulu': 7, 'David': 9, 'David 11': 11}
{'Kirk': 9, 'Sulu': 7, 'David': 9, 'David 11': 11}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:u
{'Kirk': 9, 'Sulu': 7, 'David': 9, 'David 11': 11}
{'Kirk': 9, 'Sulu': 7, 'David': 9, 'David 11': 11}
which player's rating do you want to update?: David
value:13
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:r
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
[('Sulu', 7), ('Kirk', 9), ('David 11', 11), ('David', 13)]
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:o
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
[('Sulu', 7), ('Kirk', 9), ('David 11', 11), ('David', 13)]
{'Kirk': 9, 'Sulu': 7, 'David': 13, 'David 11': 11}
MENU
a ---- Add a player
d ---- Remove a player
q ---- quit program
u ---- Update player rating
r ---- Output players above a rating
o ---- Output roster in order of rating
enter your options:q

'''
    



main()
