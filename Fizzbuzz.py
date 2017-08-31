#My solution for the fizz buzz interview question
for num in range(1,101):
    message = ''
    if num % 3 == 0:
        message += 'Fizz'
    if num % 5 == 0:       # no more elif
        message += 'Buzz'
    if not message:      # check if msg is an empty string
        message += str(num)
    print (message)
