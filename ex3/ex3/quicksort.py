from testArrayStorage import *
import random

print("initial array", testArray)

def quicksort(array):
    if len(array) <= 1:
        return array
    else:
        selection = random.randint(0, len(array) - 1)
        pivot = array.pop(selection)
        items_greater = []
        items_lower = []
        for item in array:
            if item > pivot:
                items_greater.append(item)
            else:
                items_lower.append(item)
        return quicksort(items_lower) + [pivot] + quicksort(items_greater)
    
result = quicksort(testArray)
print("sorted array", result)

