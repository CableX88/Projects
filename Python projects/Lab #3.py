#Authors: David Brown
#Assignment: Lab #3
#Completed (or last revision):  9/5/2018
##menu

print("Davy's auto shop services")
print('Oil change -- $35')
print('Tire rotation -- $19')
print('Car wash -- $7')
print('Car wax -- $12')

## Dictionary of services that are available including the option of no service
## '-' gives the option of no service
auto_services_available = {
    '-': 0, 
    'Oil change': 35,
    'Tire rotation': 19,
    'Car wash': 7,
    'Car wax': 12
}
## checks the first service input for services provided inside of the dictionary
service_one = input('Select first service: ')
if service_one == '-':
    print('No service')
else:
    print('Service 1:',service_one,'$',auto_services_available.get(service_one) )

## checks the 2nd service input for services provided inside of the dictionary
service_two = input('Select second service: ')
if service_two == '-':
    print('No service')
else:
    print('Service 2:',service_one,'$',auto_services_available.get(service_two) )
    
## instantiates variable to hold the total cost of both selected auto shop services
Total_cost = auto_services_available.get(service_one)+auto_services_available.get(service_two)

#outputs invoice
print("Davy's auto shop invoice")
print('Service 1:',service_one,'$',auto_services_available.get(service_one))
print('Service 2:',service_one,'$',auto_services_available.get(service_two))

print('Total Cost:$',Total_cost)

'''
Davy's auto shop services
Oil change -- $35
Tire rotation -- $19
Car wash -- $7
Car wax -- $12
Select first service: Tire rotation
Service 1: Tire rotation $ 19
Select second service: -
No service
Davy's auto shop invoice
Service 1: Tire rotation $ 19
Service 2: Tire rotation $ 0
Total Cost:$ 19

Davy's auto shop services
Oil change -- $35
Tire rotation -- $19
Car wash -- $7
Car wax -- $12
Select first service: Oil change
Service 1: Oil change $ 35
Select second service: Car wash
Service 2: Oil change $ 7
Davy's auto shop invoice
Service 1: Oil change $ 35
Service 2: Oil change $ 7
Total Cost:$ 42

'''
