#My solution for the fizz buzz interview question
for num in range(1,101):
    message = '' # creates an empty string
    if num % 3 == 0:
        message += 'Fizz'
    if num % 5 == 0:       
        message += 'Buzz'
    if not message:      # check if message is an empty string
        message += str(num)
    print (message)
