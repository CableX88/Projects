def bubblesort(lst):
    #print(lst)
    for i in range(len(lst)-1):
        for j in range(len(lst)-1):
            if (lst[j]>lst[j+1]):
                t =lst[j]
                lst[j]=lst[j+1]
                lst[j+1] = t
                #print(lst)
    return lst

def binarysearch(lst,key):
    low = 0
    high = len(lst)-1
    while high >= low:
        mid = (low+high)//2
        if key < lst[mid]:
            high = mid - 1
        elif key == lst[mid]:
            return 'Found'
        else:
            low = mid + 1
    return 'not found'


def main():

    lst2=[11,4,7,10,2,45,50,79,60,66,69,70,59]
    lst = bubblesort(lst2)
    print(lst)
    print(binarysearch(lst,11))

main()
##============= RESTART: E:\python projects CS10\sortsNsearches.py =============
##[2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79]
##Found
##>>>                     
              
            
                                  
