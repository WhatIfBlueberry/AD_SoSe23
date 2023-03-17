def euclidean(x, y):
    r = x % y
    while r != 0:
        x = y
        y = r
        r = x % y
    return y
