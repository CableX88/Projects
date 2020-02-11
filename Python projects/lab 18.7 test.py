userInt = int(input('Enter integer (0 - 155):\n'))
userFloat = float(input('Enter float:\n'))
userChar = (input('Enter character:\n'))
userString = (input('Enter string:\n'))

print(userInt,end=' ')
print(userFloat,end=' ')
print(userChar,end=' ')
print(userString)
#print(userInt,userFloat,userChar,userString, end='')
print(userString,userChar,userFloat,userInt)
print(userInt,'converted to a character is',chr(userInt))
#sample output
##Enter integer (0 - 155):
##99
##Enter float:
##3.77
##Enter character:
##z
##Enter string:
##Howdy
##99 3.77 z Howdy
##Howdy z 3.77 99
##99 converted to a character is c
