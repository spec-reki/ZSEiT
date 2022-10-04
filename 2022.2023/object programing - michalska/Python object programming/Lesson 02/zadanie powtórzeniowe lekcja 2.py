class Animal:
    def __init__(self, name,type,color):
        self.name = name
        self.type = type
        self.color = color

    def move(self):
        print(f"Pies {self.name}, pobiegł w twoją stronę")

    def eat(self):
        print(f"{self.type} o kolorze {self.color} zjadł puszkę karmy!")

dog = Animal('Tokio', 'Dog', 'Brown')
cat = Animal('Kioto', 'Cat', 'White')

print(dog.type)
print(dog.__dict__)