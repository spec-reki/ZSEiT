class Person:
    def __init__(self,imie,nazwisko,wiek,zawod):
        self.imie = imie
        self.nazwisko = nazwisko
        self.wiek = int(wiek)
        self.zawod = zawod

    def przedstaw_sie(self):
        print("Nazywam się",self.imie)

p1 = Person("Maks","Pokrzywnicki",24,"Grafik")
p2 = Person("Bogdan", "Boner",22,"Egzorcysta")
p3 = Person("Krystian", "Malinowy",86, "Elektryk")

print(p2.imie,p2.nazwisko,p2.wiek,p2.zawod)
