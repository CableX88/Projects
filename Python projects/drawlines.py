import turtle

t = turtle
t.pensize(2)
t.hideturtle()
t.left(90)
t.speed('fastest')
    
def long():   #draw an upward long line
    t.fd(14)
    t.up()
    t.bk(14)
    t.right(90)
    t.fd(6)
    t.left(90)
    t.down()
    
def short():  #draw an upward short line
    t.fd(6)
    t.up()
    t.bk(6)
    t.right(90)
    t.fd(6)
    t.left(90)
    t.down()

#your functions here to print out 0, 1, ... 9
#could be one printdigit() function or 10 separate functions

t.up()
t.goto(0, -50)
t.down()

 
