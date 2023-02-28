#import Person
from Person import Person

#inicjalizacja klasy Client
class Client(Person):
    def __init__(self, clientID, name, surname, gender, age, phonenumber, address):
        super().__init__(name, surname, gender, age, phonenumber, address)
        self.clientID = clientID

#metody klasy Client
client1 = Client(1, "Bogdan", "Boner", "M", 43, "666", "dupaBlada")
client2 = Client(2, "Tytus", "Bomba", "M", 25, "694202137", "GalaktykaKurwix")
client3 = Client(3, "Anna", "Wesołowska", "W", 45, "776283633", "Woronicza 17")
