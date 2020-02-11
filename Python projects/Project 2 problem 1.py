#Authors: David Brown
#Assignment: project 2 problem 1
#Completed (or last revision):  10/1/2018

def get_num_of_characters(inputStr):
    return len(inputStr)

def output_without_whitespace(inputStr):
    return inputStr.replace(" ", "")

def main():
    inputStr = input('Enter a sentence or phrase: ')
    print('you entered:', inputStr)
    print('Number of Characters:',get_num_of_characters(inputStr))
    print('String with no whitespace:',output_without_whitespace(inputStr))
main()

'''
Enter a sentence or phrase: The only thing we have to fear is fear itself.
you entered: The only thing we have to fear is fear itself.
Number of Characters: 46
String with no whitespace: Theonlythingwehavetofearisfearitself.


Enter a sentence or phrase: Your a big guy!! For you
you entered: Your a big guy!! For you
Number of Characters: 24
String with no whitespace: Yourabigguy!!Foryou

Enter a sentence or phrase: All your base are belong to us!! Move zig for great justice!!
you entered: All your base are belong to us!! Move zig for great justice!!
Number of Characters: 61
String with no whitespace: Allyourbasearebelongtous!!Movezigforgreatjustice!!

'''
