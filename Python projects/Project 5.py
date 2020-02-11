
class ItemToPurchase:
    def __init__(self):
        self.item_name = "none"
        self.item_price = 0.0
        self.item_quantity = 0
        self.item_description = "none"

    def set_item_name(self,item_name):
        self.item_name = item_name

    def set_item_price(self,item_price):
        self.item_price = item_price
        
    def set_item_quantity(self,item_quantity):
        self.item_quantity = item_quantity
        
    def set_item_description(self,item_description):
        self.item_description = item_description

    def print_item_cost(self):
        print(self.item_name,":",self.item_quantity,"*","$",self.item_price,"=","$",self.item_price*self.item_quantity)

    def print_item_description(self):
        print(self.item_name,":",self.item_description)



        
class ShoppingCart(ItemToPurchase):
    def __init__(self):
        self.customer_name = "none"
        self.current_date = "January 1,2016"
        self.cart_items = []

    def set_customer_name(self,customer_name):
        self.customer_name = customer_name

    def set_customer_date(self,customer_date):
        self.current_date = customer_date

    def set_cart_items(self,cart_items):
        self.cart_item = cart_item
        
    
        
        
    def add_item(ItemToPurchase):
        ShoppingCart.set_cart_items
        new_item_name = input("Enter your Item's name: ")
        new_item_price = float(input("Enter your Item's price:$ "))
        new_item_quantity = int(input("Enter your Item's quantity: "))
        new_item_description = input("Enter the description of your Item: ")
        cart_items.append(ItemToPurchase(new_item_name,new_item_price,new_item_quantity,new_item_description))

    def remove_item(ItemToPurchase):
        rem_item = input("which item would you like to remove?: ")
        for rem_item in cart_items:
            cart_items.remove(rem_item)
        
    def modify_item(ItemToPurchase):
        print(cart_items)
        try:
            i = input("which item would you like to modify:")
            for i in cart_items:
                print("enter 1 for modifying an items description")
                print("enter 2 for modifying an items price")
                print("enter 3 for modifying an items quantity")
                mod_choice = input("Enter your choice: ")
                if mod_choice == '1':
                    descript_change =input("new description: ")
                    ItemToPurchase.set_item_description(descript_change)
                elif mod_choice == '2':
                    price_change = float(input("new price: "))
                    ItemToPurchase.set_item_price(price_change)
                elif mod_choice == '3':
                    quantity_change = int(input("new quantity: "))
                    ItemToPurchase.set_item_quantity(quantity_change)

                else:
                    print("Error: enter valid input")
                    break
        except:
            print("Error: Item not in list")
            
    def print_total():
        print(len(cart_items))
        
    def get_cost_of_cart():
        for cc in cart_items:
            print(sum(ItemsToPurchase.set_item_price(cc)))
        
    def print_descriptions():
        for pd in cart_items:
            print(ItemToPurchase.set_item_description(pd))
        
def print_menu():
    check = ShoppingCart()
    print("MENU")
    print("a - Add item to cart")
    print("r - Remove item from cart")
    print("c - Change item quantity")
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
        else:
            print("Error")


def main():
    shopper_name = input("Enter your name: ")
    shopper_date = input("Enter the current date: ")
    print_menu()


main()
        
            
            
            

    
    

       


##I2 = ItemToPurchase()
##I2.set_item_name("Slurm")
##I2.set_item_price(5.50)
##I2.set_item_quantity(5)
##I2.set_item_description("Extreme Sadness flavor, 12 pack")
##I2.print_item_cost()
##I2.print_item_description()
