class Trojkat:
    def __init__(self, a, b, c):
            self.poprawne = False
            self.a = a
            self.b = b
            self.c = c
            if ((self.a+self.b>self.c) and (self.a+self.c>self.b) and (self.b+self.c>self.a)):
                self.poprawne = True
 
    def check(self):
        if self.poprawne == True:
            print("Można zbudować trójkąt")
        else:
            print("Nie można zbudować trójkąta")
 
class TrojkatRoznoboczny(Trojkat):
    def __init__(self, pole, obwod):
        super().__init__(pole, obwod)
        p = (self.a + self.b +self.c) / 2
        Po = (p * (p - self.a) * (p - self.b) * (p - self.c))
        pole_tr_roznobocznego = Po
        obwod_tr_roznobocznego = (self.a + self.b + self.c)
        self.pole = pole_tr_roznobocznego
        self.obwod = obwod_tr_roznobocznego

    def into_tr_roznobocznego(self):
        print(f"Obwod trójkąta roznobocznego wynosi: " + obwod_tr_roznobocznego+ " ,a pole wynosi: " + obwod_tr_roznobocznego)


 
class TrojkatRownoboczny(Trojkat):
    def __init__(self, pole, obwod):
        super().__init__(pole, obwod)
        p = (self.a + self.b +self.c) / 2
        Po = (p * (p - self.a) * (p - self.b) * (p - self.c))
        pole_tr_rownobocznego = Po
        obwod_tr_rownobocznego = (self.a + self.b + self.c)
        self.pole = pole_tr_rownobocznego
        self.obwod = obwod_tr_rownobocznego

    def into_tr_roznobocznego(self):
        print(f"Obwod trójkąta roznobocznego wynosi: " + obwod_tr_roznobocznego+ " ,a pole wynosi: " + obwod_tr_roznobocznego)


 
class TrojkatProstokatny(Trojkat):
    def __init__(self, pole, obwod):
        super().__init__(pole, obwod)
        p = (self.a + self.b +self.c) / 2
        Po = (p * (p - self.a) * (p - self.b) * (p - self.c))
        pole_tr_prostokatnego = Po
        obwod_tr_prostokatnego = (self.a + self.b + self.c)
        self.pole = pole_tr_prostokatnego
        self.obwod = obwod_tr_prostokatnego

    def into_tr_roznobocznego(self):
        print(f"Obwod trójkąta roznobocznego wynosi: " + obwod_tr_prostokatnego+ " ,a pole wynosi: " + pole_tr_prostokatnego)



