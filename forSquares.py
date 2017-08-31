# This program allows the user to enter start and end range
#Program List nums and its squares

start = int(input("Enter start number: "))
end = int(input("Enter end number: "))
print("Number\t Square")
print("_______________")

for num in range(start,end):
    square = num**2
    print(num,'\t',square)
##=============== RESTART: H:/python projects CS10/forSquares.py ===============
##Enter start number: 10
##Enter end number: 21
##Number	 Square
##_____________________
##10 	 100
##11 	 121
##12 	 144
##13 	 169
##14 	 196
##15 	 225
##16 	 256
##17 	 289
##18 	 324
##19 	 361
##20 	 400
##>>> 
