Lst = [2,14,6,9]

print(list(reversed(Lst)))
print(Lst[::-1])
##Output
##[9, 6, 14, 2]
##[9, 6, 14, 2]

tAnimals = ("Cat","Dog","Bear","Deer")
tCounts = (3,5,7,9)

print(dict(zip(tAnimals,tCounts)))
Animals_dict = dict(zip(tAnimals,tCounts))
Animals_dict.update({"Puma":1})
print(Animals_dict)
##print(sorted(Animals_dict.items()))

Month_Lst =["Jan","Feb","Mar","Apr"]
Tempre_Lst =[50.5,45.2,67.0,55.6]

Month_tup1 = list(zip(Month_Lst,Tempre_Lst))
Month_tup2 = tuple(zip(Month_Lst,Tempre_Lst))
Month_tup3 = dict(zip(Month_Lst,Tempre_Lst))
print(Month_tup1)
print(Month_tup2)
print(Month_tup3)

t = (["xyz",123],23,10)
t[0][0] ="abc"
print(t)
'''
[9, 6, 14, 2]
[9, 6, 14, 2]
{'Cat': 3, 'Dog': 5, 'Bear': 7, 'Deer': 9}
{'Cat': 3, 'Dog': 5, 'Bear': 7, 'Deer': 9, 'Puma': 1}
[('Jan', 50.5), ('Feb', 45.2), ('Mar', 67.0), ('Apr', 55.6)]
(('Jan', 50.5), ('Feb', 45.2), ('Mar', 67.0), ('Apr', 55.6))
{'Jan': 50.5, 'Feb': 45.2, 'Mar': 67.0, 'Apr': 55.6}
'''
