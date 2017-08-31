#Auto intiallizes into 2D list
import random
row = 3
col = 4
values=[]
values2 = [[0 for i in range(4)] for j in range(3)]
print(values2)
for r in range(row):
    values.append([])  
    for c in range(col):                 
        values[r].append(0)
    print(values[r])
##============== RESTART: E:\python projects CS10\2DListAppend.py ==============
##[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
##>>> 
##============== RESTART: E:\python projects CS10\2DListAppend.py ==============
##[0, 0, 0, 0]
##[0, 0, 0, 0]
##[0, 0, 0, 0]
##>>> 
