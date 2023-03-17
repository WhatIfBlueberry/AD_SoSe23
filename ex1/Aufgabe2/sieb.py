import math

def sieb(k):
    table = [x for x in range(2, k+1)]
    table2 = [x for x in range(2, k+1)]
    pointer = 2
    count = 1
    while pointer < int(math.sqrt(k+1)):
        for x in table:
            if x % pointer == 0 and x != pointer:
                table2.remove(x)
        table = table2
        pointer = table[count]
        count += 1
        print(pointer)
    print("all prime numbers until: ", k, "include: ",table)



def printTable(k):
    for x in range(2, k+1):
        if x%10:
            print(x, end=" ")
        else: 
            print(x)

# 2.
#printTable(100)
#sieb(100)

# 3.
sieb(100000)