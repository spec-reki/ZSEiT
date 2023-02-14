class Restaurant:
    def __init__(self, restaurat_name, cuisine_type):
        self.name = restaurat_name
        self.cuisine = cuisine_type

    def open_restaurant(self):
        print(f"Restauracja otwarta w godzinach 9:00 - 21:00")

    def describe_restaurant(self):
        print(f"{self.name} - {self.cuisine}")


class IceCreamStand(Restaurant):
    def __init__(self, flavors):
        self.flavors = []
        for flavor in flavors:
            self.flavors.append(flavor)
    
    def show_flavors(self):
        print("\n\nSmaki lodów\n")
        for flavor in self.flavors:
            print(f"{flavor}")


restaurant = Restaurant("Wiśniowy Piec", "Kuchnia Włoska")
restaurant.describe_restaurant()
restaurant.open_restaurant()

i1 = IceCreamStand(["Waniliowy","Wiśniowy","Miętowy","OwoceLeśne","Gargamelowy"])
ii = Restaurant("LodowaBudka", "Budka z Lodami")
ii.describe_restaurant()
i1.show_flavors()

#Autor: Maksymilian Pokrzywnicki IV TP