for value in range(1, 151):
    print(value),

for value1 in range(5, 1001, 5):
    print(value1),

for value2 in range(1, 1001):
    if value2%10==0:
        print("coding dojo")
    elif value2%5==0:
        print("coding")
    else:
        print(value2)    


sum = 0
for value3 in range(1, 500001, 2):
    sum += value3
print(sum)

number = 2018
while number > 0:
    print(number)
    number -= 4

value5 = 2
value9= 9
value6= 3
for i in range(value6, value5 + 1):
    if i % value9 == 0:
        print(i)

