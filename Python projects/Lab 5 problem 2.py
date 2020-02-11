#Authors: David Brown
#Assignment: Lab #5 problem 2
#Completed (or last revision):  9/22/2018

#creates the base height of the downward arrowhead
arrowBase_Height = int(input('Enter the arrow base height:'))

#creates the base width of the downward arrowhead
arrowBase_Width = int(input('Enter the arrow base width:'))

#creates the width of the downward arrowhead
arrowHead_Width = int(input('Enter the arrow head width:'))

# creates the height and width of the downward arrow
for i in range(arrowBase_Height):
  for j in range(arrowBase_Width):
    print('*', end='')
  print('')

#creates the head of the downward arrow
for i in range(arrowHead_Width):
  for j in range(arrowHead_Width - i):
    print('*', end='')
  print('')

#output
'''
Enter the arrow base height:5
Enter the arrow base width:2
Enter the arrow head width:4
**
**
**
**
**
****
***
**
*

Enter the arrow base height:6
Enter the arrow base width:3
Enter the arrow head width:7
***
***
***
***
***
***
*******
******
*****
****
***
**
*

Enter the arrow base height:5
Enter the arrow base width:3
Enter the arrow head width:6
***
***
***
***
***
******
*****
****
***
**
*
'''
