#David Brown
#837183
#Hw 1 program 1
#This program calculates Gravitational force and acceleration

#formulas
r = 6373 * 10**3 # Radius of planet Earth
m1 = 5.9742 * 10**24 #mass of planet Earth
G = 6.67300 * 10** -11 #universal Gravitational Constant

#input

X = float(input("How much do you weigh?: "))#Weight of user

#Calc
F = (G)*(m1)*(X)/(r**2) #gravitational force
g = F/X #Acceleration due to gravity

#output
print(" The resulting value of f is ",format(g,',.4f')+" which is close to the earth's gravitational force")

##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw1pg1.py =====
##How much do you weigh?: 180
## The resulting value of f is  9.8155 which is close to the earth's gravitational force
##>>> 
##===== RESTART: C:/Users/DAVIDX2X/Desktop/python projects CS10/Hw1pg1.py =====
##How much do you weigh?: 245.5
## The resulting value of f is  9.8155 which is close to the earth's gravitational force
##>>> 
