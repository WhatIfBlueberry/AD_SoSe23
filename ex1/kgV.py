from euclidean import euclidean
# kgV * ggT = x * y. Therefore it is safe to cast the result to int.
def kgV(x, y):
    return int(x * y / euclidean(x, y))