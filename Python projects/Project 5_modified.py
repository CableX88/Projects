## Name: David Brown
## Date: November, 19, 2018

class ItemToPurchase:
    def __init__(self, name="none", price=0.0, quantity=0,description = "none"):
        self.item_name = name        #use default parameters here
        self.item_price = price
        self.item_quantity = quantity
        self.item_description = description

    def set_item_name(self,item_name):
        self.item_name = item_name

    def set_item_price(self,item_price):
        self.item_price = item_price
        
    def set_item_quantity(self,item_quantity):
        self.item_quantity = item_quantity
        
    def set_item_description(self,item_description):
        self.item_description = item_description

    def print_item_cost(self):
        recipt = "{}: {} * ${} = ${}".format(self.item_name, self.item_quantity, self.item_price, (self.item_quantity * self.item_price))
        total_Cost = self.item_quantity * self.item_price
        return recipt, total_Cost

    def print_item_description(self):
        print(self.item_name,":",self.item_description)
        
    def __repr__(self): ## to get the debug list to output the class objects and attributes
        return "Items('{}','{}','{}','{}')".format(self.item_name,self.item_price,self.item_quantity,self.item_description)



        
class ShoppingCart(ItemToPurchase):
    def __init__(self):
        ItemToPurchase.__init__(self, name="none", price=0.0, quantity=0,description = "none")
        self.customer_name = "none"
        self.current_date = "January 1,2016"
        self.cart_items = []

    def set_customer_name(self,customer_name):
        self.customer_name = customer_name

    def set_customer_date(self,customer_date):
        self.current_date = customer_date

    def set_cart_items(self,cart_items):
        self.cart_items= cart_items
        #cart_items, not cart_item
    
        
        
    def add_item(self):  #self must be a parameter, same for the following
        check_input1 = input("Do you want to add an item?(y for yes, n for no):")
        while check_input1 != 'n':
            new_item_name = input("Enter your Item's name: ")
            new_item_price = float(input("Enter your Item's price:$ "))
            new_item_quantity = int(input("Enter your Item's quantity: "))
            new_item_description = input("Enter the description of your Item: ")
            self.cart_items.append(ItemToPurchase(new_item_name,new_item_price,new_item_quantity,new_item_description))
            check_input1 = input("Do you want to add another item?(y for yes, n for no)")
        
    def remove_item(self):
        rem_item = input("which item would you like to remove?: ")
        for rem_item in self.cart_items:
            self.cart_items.remove(rem_item)
        
    def modify_item(self): ## instantiates new item to be class object iterator 
        print(self.cart_items)
        try:
            search_name = str(input("which item would you like to modify:"))
            for items in self.cart_items:
                if items.item_name == search_name: ## finds items by item_name and checks search name paramater
                    print("enter 1 for modifying an items description")
                    print("enter 2 for modifying an items price")
                    print("enter 3 for modifying an items quantity")
                    mod_choice = input("Enter your choice: ")
                    if mod_choice == '1':
                        descript_change =input(" Enter new description: ")
                        items.item_description = descript_change
                    elif mod_choice == '2':
                        price_change = float(input(" Enter new price: "))
                        items.item_price = price_change
                    elif mod_choice == '3':
                        quantity_change = int(input("new quantity: "))
                        items.item_quantity = quantity_change
                else:
                    print("Error: enter valid input")
                    break
        except:
            print("Error: Item not in list")
            
    def print_total(): ## adds the total quantities through the list
        print("All items in your cart:")
        number_of_items = 0
        for items in self.cart_items:
            number_of_items += items.item_quantity
        return number_of_items

        
    def get_cost_of_cart(self,ItemToPurchase): ## iterates through the list to get total cost of cart
        print("Total Cost of Cart:")
        total = 0
        prices = 0
        for items in self.cart_items:
            prices = (items.item_quantity * items.item_price)
            total += cost
        return total
        
    def print_descriptions(self):
        print(' Your Item Descriptions:', end='\n')
        for items in self.cart_items:
            print('{}: {}'.format(items.item_name, items.item_description), end='\n')

    def output_cart(self):
        print('Your Shopping Cart for today:', end='\n')
        print(self.customer_name,'\'s Shopping Cart -',self.current_date)     
        print('Number of Items:', returning_Customer.get_num_items_in_cart(), end='\n')
        if (self.item_quantity == 0):
           print('SHOPPING CART IS EMPTY')
        else:
            Entire_cost = 0.0
            for items in self.cart_items:
                print('{}: {} * ${} = ${}'.format(item.item_name, item.item_quantity,item.item_price, (item.item_quantity * item.item_price)), end='\n')
                Entire_cost += (item.item_quantity * item.item_price)
                print('Total: ${}'.format(Entire_cost), end='\n')
            
    
        
def print_menu():
    check = ShoppingCart()
    print(check.cart_items)
    print("MENU")
    print("a - Add item to cart")
    print("r - Remove item from cart")
    print("c - Change item quantity, price, or description")
    print("i - Output items' descriptions")
    print("o - Output shopping cart")
    print("q - Quit")
    command = input("enter your choice: ")
    while command != 'q':
        if command == 'a':
            check.add_item()
        elif command == 'r':
            check.remove_item()
        elif command == 'c':
            check.modify_item()
        elif command == 'i':
            check.print_descriptions()
        elif command == 'o':
            check.output_cart()
        else:
            print("Error")
        print("MENU")
        print(check.cart_items)
        print("a - Add item to cart") ## works
        print("r - Remove item from cart") ## works
        print("c - Change item quantity")## works
        print("i - Output items' descriptions")##works
        print("o - Output shopping cart") ##needs work
        print("q - Quit") ## works 
        command = input("enter another choice: ")
        #must add this, otherwise infinite loop


def main():
    shopper_name = input("Enter your name: ")
    shopper_date = input("Enter the current date: ")
    print_menu()


main()
        
            
'''
Enter your name: David
Enter the current date: 11/22/18
[]
MENU
a - Add item to cart
r - Remove item from cart
c - Change item quantity, price, or description
i - Output items' descriptions
o - Output shopping cart
q - Quit
enter your choice: a
Do you want to add an item?(y for yes, n for no):y
Enter your Item's name: Pizza 
Enter your Item's price:$ 11.99
Enter your Item's quantity: 2
Enter the description of your Item: Large Cheese and Pesto with Ham
Do you want to add another item?(y for yes, n for no)y
Enter your Item's name: Dr Pepper
Enter your Item's price:$ 1.99
Enter your Item's quantity: 5
Enter the description of your Item: The most ambiguous soda on the market
Do you want to add another item?(y for yes, n for no)n
MENU
[Items('Pizza ','11.99','2','Large Cheese and Pesto with Ham'), Items('Dr Pepper','1.99','5','The most ambiguous soda on the market')]
a - Add item to cart
r - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
enter another choice: r
which item would you like to remove?: Pizza
MENU
[Items('Dr Pepper','1.99','5','The most ambiguous soda on the market')]
a - Add item to cart
r - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
enter another choice: c
[Items('Dr Pepper','1.99','5','The most ambiguous soda on the market')]
which item would you like to modify:Dr Pepper
enter 1 for modifying an items description
enter 2 for modifying an items price
enter 3 for modifying an items quantity
Enter your choice: 2
 Enter new price: 2.99
MENU
[Items('Dr Pepper','2.99','5','The most ambiguous soda on the market')]
a - Add item to cart
r - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
enter another choice: c
[Items('Dr Pepper','2.99','5','The most ambiguous soda on the market')]
which item would you like to modify:Dr Pepper
enter 1 for modifying an items description
enter 2 for modifying an items price
enter 3 for modifying an items quantity
Enter your choice: 3
new quantity: 15
MENU
[Items('Dr Pepper','2.99','15','The most ambiguous soda on the market')]
a - Add item to cart
r - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
enter another choice: i
 Your Item Descriptions:
Dr Pepper: The most ambiguous soda on the market
MENU
[Items('Dr Pepper','2.99','15','The most ambiguous soda on the market')]
a - Add item to cart
r - Remove item from cart
c - Change item quantity
i - Output items' descriptions
o - Output shopping cart
q - Quit
enter another choice: o
Your Shopping Cart for today:
none 's Shopping Cart - January 1,2016
>>> 
'''
            

    
    


