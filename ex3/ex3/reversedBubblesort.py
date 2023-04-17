from testArrayStorage import *

print("initial array", testArray)

def bubblesort(array):
    for step in range(len(array)):
        for i in range(len(array) - 1):
            if array[i] > array[i + 1]:
                array[i], array[i + 1] = array[i + 1], array[i]
        print("step", step, array)
    return array

result = bubblesort(testArray)
print("sorted array", result)