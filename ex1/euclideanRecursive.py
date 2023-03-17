def euclideanRecursive(a, b):
    if b == 0:
        return a
    else:
        return euclideanRecursive(b, a % b)