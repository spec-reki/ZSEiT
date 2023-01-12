class Dog:
    def __init__(self, name):
        self._name = name

    def speak(self):
        return "Woof!"

class Cat:
    def __init__(self, name):
        self._name = name

    def speak(self):
        return "Meow!"

class DogFactory:
    def get_pet(self):
        return Dog("Doggie")

    def get_food(self):
        return "dog food"

class CatFactory:
    def get_pet(self):
        return Cat("Kitty")

    def get_food(self):
        return "cat food"

def get_factory(pet="dog"):
    return DogFactory() if pet == "dog" else CatFactory()

factory = get_factory("cat")
pet = factory.get_pet()
print(pet.speak())

#W powyższym przykładzie, interfejs fabryki jest reprezentowany przez klasę
# DogFactory i CatFactory, które implementują metody get_pet oraz get_food.
#  Klient korzysta z fabryki poprzez funkcję get_factory, która zwraca 
# odpowiednią fabrykę. Dzięki temu, kod klienta nie jest zależny od konkretnej
#  implementacji obiektu (psa lub kota), a jedynie od interfejsu fabryki.