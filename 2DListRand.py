import random

rows=3
cols=4

def main():
    values = [[0,0,0,0],[0,0,0,0],[0,0,0,0]]
#This goes from top to bottom
    for r in range(rows):
#This goes from left to right
        for c in range(cols):
            values[r][c] = random.randint(1,100)
    print(values[0])
    print(values[1])
    print(values[2])
main()
##=============== RESTART: E:\python projects CS10\2DListRand.py ===============
##[[88, 39, 29, 26], [99, 53, 78, 93], [56, 39, 68, 28]]
##>>> 

##=============== RESTART: E:\python projects CS10\2DListRand.py ===============
##[51, 30, 29, 14]
##[35, 42, 86, 56]
##[56, 92, 38, 26]
##>>> 
