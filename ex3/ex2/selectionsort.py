from testArrayStorage import *

print("initial array", testArray)

def selectionsort(array):
    for step in range(len(array)):
        min_idx = step
        for i in range(step + 1, len(array)):
            if array[i] < array[min_idx]:
                min_idx = i
        array[step], array[min_idx] = array[min_idx], array[step]
        print("step", step, array)
    return array

result = selectionsort(testArray)
print("sorted array", result)
