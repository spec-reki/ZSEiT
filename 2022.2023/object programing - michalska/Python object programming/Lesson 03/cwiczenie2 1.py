class książka:
    
    tytul = ""
    autor = ""
    dataWydania = None
    iloscStron = None
    wlasciciel = ""
    
    def __init__(self, tytul, autor, dataWydania, iloscStron, wlasciciel):
        self.tytul = tytul
        self.autor = autor
        self.dataWydania = dataWydania
        self.iloscStron = iloscStron
        self.wlasciciel = wlasciciel
        
    def nowyWlasciciel(self, nowyWlasciciel):
        self.wlasciciel = wlasciciel

k1 = książka("Nessmuk", "George Michael", 1800, 190, "Biblioteka") 
k2 = książka("Zmora z Dunwitch",  "H.P. Lovecraft", 1930, 45, "Biblioteka")
k3 = książka("Zew Cthulu",  "H.P Lovecraft", 1925, 20, "Biblioteka")
k4 = książka("Władca Pierścieni",  "Tolkien", 1935, 400, "Biblioteka")
k5 = książka("Pipi Pończoszanka",  "Astrid Lindgren", 1950, 120, "Biblioteka")

listaKsiazek = [k1, k2]

for i in listaKsiazek:
    print (i.tytul)