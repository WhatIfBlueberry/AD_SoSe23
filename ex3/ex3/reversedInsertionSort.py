from testArrayStorage import *

print("initial array", testArray)

def insertionsort(array):
    for j in range(len(array)-2, -1, -1):
        key = array[j]
        i = j + 1
        while i < len(array) and array[i] < key:
            array[i - 1] = array[i]
            i = i + 1
        array[i - 1] = key
        print("step", j, array)
    return array

result = insertionsort(testArray)
print("sorted array", result)