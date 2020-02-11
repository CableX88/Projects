#from matplotlib import pyplot

#Authors: David Brown
#Assignment: lab 6 problem 3
#Completed (or last revision):  10/9/2018
def read_scores(student_num):
    score_list = []
    for index in range(student_num):
        score = int(input("Please enter a score between 0 to 5:"))
        score_list.append(score)
    return score_list


def count(student_num,result):
    ct = 0
    for e in result:
        if student_num == e:
            ct+=1
    return ct

def main():

    num0s = 0
    num1s = 0
    num2s = 0
    num3s = 0
    num4s = 0
    num5s = 0
    student_num = int(input('Enter your students: '))
    scores = read_scores(student_num)
    print(scores)
    result = []
    for j in range(0,6):
        ct = count(j,scores)
        result.append(ct)
    

    print('0s:',result[0])
    print('1s:',result[1])
    print('2s:',result[2])
    print('3s:',result[3])
    print('4s:',result[4])
    print('5s:',result[5])


'''
Enter your students: 6
Please enter a score between 0 to 5:1
Please enter a score between 0 to 5:2
Please enter a score between 0 to 5:3
Please enter a score between 0 to 5:4
Please enter a score between 0 to 5:1
Please enter a score between 0 to 5:3
[1, 2, 3, 4, 1, 3]
0s: 0
1s: 2
2s: 1
3s: 2
4s: 1
5s: 0
'''
    
    
main()
