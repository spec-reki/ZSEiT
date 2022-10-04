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