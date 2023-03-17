from euclidean import euclidean
from euclideanRecursive import euclideanRecursive
from kgV import kgV

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))
print("Euclidean: ", euclidean(x, y))
print("Euclidean recursive: ",euclideanRecursive(x, y))
print("kgV: ", kgV(x, y))