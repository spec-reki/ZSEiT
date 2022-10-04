class Person:
    def __init__(self,imie):
        self.imie = imie

    def przedstaw_sie(self):
        print("Nazywam się",self.imie)

p = Person("Maks")

p.przedstaw_sie()
