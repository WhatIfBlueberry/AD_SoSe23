from euclidean import euclidean
from euclideanRecursive import euclideanRecursive
from kgV import kgV

numbers = [x for x in range(30, 41)]
numbersY = [x for x in range(40, 29, -1)]
# call euclidean and kgV for all numbers
for x in numbers:
    for y in numbersY:
        print("ggT: ", euclidean(x, y))
        print("kgV: ", kgV(x, y))
        print("a * b: ", x * y)
