import math

class circle:
    def __init__(self,radius = 1):
        self.radius = radius

    def getPerimeter(self):
        return 2*self.radius*math.pi

    def getArea(self):
        return self.radius*self.radius*math.pi

    def setRadius(self,radius):
        self.radius=radius

def main():
    circle1= circle()# instantiate an instance of object circle from class circle

    print("the area of the circle of radius",circle1.radius,"is",circle1.getArea())
    circle2= circle(25)
    print("the area of the circle2 of radius",circle2.radius,"is",circle2.getArea())

    #modify circle radius
    circle2.setRadius(100)
    print(circle2.radius,circle2.getArea())
main()
##============== RESTART: E:\python projects CS10\RadiusClass.py ==============
##the area of the circle of radius 1 is 3.141592653589793
##the area of the circle2 of radius 25 is 1963.4954084936207
##100 31415.926535897932
##>>> 
