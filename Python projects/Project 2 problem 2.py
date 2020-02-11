#Authors: David Brown
#Assignment: project 2 problem 2
#Completed (or last revision):  10/2/2018

## function to create the checksum to be
##concatenated to the end of the zipstring
def checksum(clean_zipstring ):
    sum_num = 0
    for s in clean_zipstring :
        num = int(s)
        sum_num +=num
    check_digit = 10-sum_num % 10
    print('check digit:',check_digit)
    return check_digit
## sends the newzipstring to be converted using
## a dictionary and list comprehension to seperate the string input
## then joins together the barcode values
def Encode_Bar_Code(newzip):
    digits = {1:'...||',
          2:'..|.|',
          3:'..||.',
          4:'.|..|',
          5:'.|.|.',
          6:'.||..',
          7:'|...|',
          8:'|..|.',
          9:'|.|..',
          0:'||...',}
    newzip_list = [int(num) for num in str(newzip)]
    barcode = ''.join([digits[num] for num in newzip_list])
    start = '|'
    stop = '|'
    final_barcode = start + barcode + stop
    print(final_barcode)
    

    
    
def main():
    zipstring =input('Enter your Zip+4 number:')
    clean_zipstring =zipstring.replace("-","")
    str(zipstring)
    newzip = clean_zipstring  + str(checksum(clean_zipstring ))
    print(newzip)
    Encode_Bar_Code(newzip)

main()

'''
Enter your Zip+4 number:55555-1237
check digit: 2
5555512372
|.|.|..|.|..|.|..|.|..|.|....||..|.|..||.|...|..|.||

Enter your Zip+4 number:91768-1234
check digit: 9
9176812349
||.|.....|||...|.||..|..|....||..|.|..||..|..||.|..|

Enter your Zip+4 number:20500-0000
check digit: 3
2050000003
|..|.|||....|.|.||...||...||...||...||...||.....||.|
>>> 
'''
