from testArrayStorage import *

print("initial array", lectureArray)

def insertionsort(array):
    for j in range(1, len(array)):
        key = array[j]
        i = j - 1
        while i >= 0 and array[i] > key:
            array[i + 1] = array[i]
            i = i - 1
        print("step", j, array)
        array[i + 1] = key
    return array

result = insertionsort(lectureArray)
print("sorted array", result)