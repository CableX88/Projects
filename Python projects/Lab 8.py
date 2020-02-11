import random

##Student: David Brown
##class: CS2990

## task 1
def pattern(n):
    if n == 0:
        print("0",end="")
    else:
        pattern(n-1)
        print(n,end="")
        pattern(n-1)

pattern(2)




## task 2
Name_list = ["Kate", "Sam", "Kate", "Jolly", "Alp", "Beta", "Alpine", "Samuel", "Bob", "Joy"]
## modified implimentation of quicksort
def gsort(array=[12,4,5,6,7,3,1,15]):
    less = []
    equal = []
    greater = []

    if len(array) > 1:
        piv = array[0] ## pivit for modified quicksort
        for x in array:
            if x < piv:
                less.append(x)
            if x == piv:
                equal.append(x)
            if x > piv:
                greater.append(x)
                
        return gsort(less)+equal+gsort(greater)  
    
    else:  
        return array

print(gsort())
print(gsort(Name_list))


## task 3
k =list(range(0,100))
rand_L = random.sample(k,20)
print("old list:",rand_L)
def double(num):
    return num*2

doub = map(double,(rand_L))
print("Doubled list:",list(doub))

new_rand_L = rand_L.copy()
doub_list = [i**2 for i in new_rand_L]

odd_doub = list(filter(lambda x: x % 2 == 1,doub_list))

print("Odd Doubled list: ",odd_doub)


'''
task 1:
010 when pattern is 1
0102010 when pattern is 2
010201030102010

task 2:
[1, 3, 4, 5, 6, 7, 12, 15]
['Alp', 'Alpine', 'Beta', 'Bob', 'Jolly', 'Joy', 'Kate', 'Kate', 'Sam', 'Samuel']

task 3:
old list: [41, 0, 57, 16, 97, 38, 19, 73, 76, 39, 86, 92, 11, 14, 93, 1, 31, 5, 48, 71]
Doubled list: [82, 0, 114, 32, 194, 76, 38, 146, 152, 78, 172, 184, 22, 28, 186, 2, 62, 10, 96, 142]
Odd Doubled list:  [1681, 3249, 9409, 361, 5329, 1521, 121, 8649, 1, 961, 25, 5041]
'''





