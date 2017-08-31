#Homework 3 program 2
#David Brown
#8360232
#CS 10
def ReverseCheck(words):
    return words[::-1]

def isPalindrome(words):
    return words == ReverseCheck(words)

word = input("Enter your word: ")
if isPalindrome(word):
     print("Yes , it is a palindrome")
else:
    print("Nope, not a palindrome")
    
##=============== RESTART: G:/python projects CS10/HW 3 pg 2.py ===============
##Enter your word: dog
##Nope, not a palindrome
##>>> 

##=============== RESTART: G:/python projects CS10/HW 3 pg 2.py ===============
##Enter your word: mom
##Yes , it is a palindrome
##>>> 
