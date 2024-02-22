number = 5
while number > -1:
    print(number)
    number -= 1


def print_and_return(numbers):
    if len(numbers) < 2:
        print("Error")
        return None
    print(numbers[0])
    return numbers[1]
result = print_and_return([1, 2])
print (result)


def first_plus_length(list):
    sum = list[0] + len(list)
    return sum
print(first_plus_length([1,2,3,4,5]))



def Values_Greater_than_Second(list):
    new_list = []
    sum = 0 
    if (len(list) < 2 ):
        return False
    else:
        for i in range(len(list)):
            if (list[i] > list[1] ):
                sum += 1
                new_list.append(list[i])
    print(sum)
    return new_list
print(Values_Greater_than_Second([5,2,3,2,1,4]))    

def This_Length_That_Value(size,value):
    output = []
    for i in range(0, size):
        output.append(value)
    return output

print(This_Length_That_Value(4,7))
print(This_Length_That_Value(6,2))


