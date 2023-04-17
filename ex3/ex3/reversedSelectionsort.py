from testArrayStorage import *

print("initial array", testArray)

def selectionsort(array):
    for step in range(len(array)-1, -1, -1):
        max_idx = step
        for i in range(step - 1, -1, -1):
            if array[i] > array[max_idx]:
                max_idx = i
        array[step], array[max_idx] = array[max_idx], array[step]
        print("step", step, array)
    return array

result = selectionsort(testArray)
print("sorted array", result)
