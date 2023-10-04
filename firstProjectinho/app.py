x = 0
y = 1
for i in range(10):
    x, y = y, x+y
    print(x)