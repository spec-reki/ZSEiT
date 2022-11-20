class Laptop:    
    def __init__(self, brand, model, price):
        assert price > 0
        self.brand = brand
        self.model = model
        self.price: float = price
        
        
    def show_details(self):
        print(f"Brand: {self.brand} \nModel: {self.model} \nPrice: {self.price}")
        
    def pln_to_usd(self):
        pln_dolar = 4.87
        self.price /= pln_dolar

object1=Laptop("dell","wolny",1050)
object1.pln_to_usd()
object1.show_details()
print(dir(object1))

object2=Laptop("samsung","super",3000)
object2.pln_to_usd()
object2.show_details()
print(dir(object2))
