#inicjalizacja klasy Bank

class Bank:
    def __init__(self, name):
        self.name = name
        self.accountsNumbers = []
        self.accountsPins = []

#metody klasy Bank
#metoda do tworzenia konta
#metoda do usuwania konta
#metoda do wyswietlania kont

    def createAccount(self, account, pin):
        self.accountsNumbers.append(account)
        self.accountsPins.append(pin)

    def closeAccount(self, account, pin):
        self.accountsNumbers.remove(account)
        self.accountsPins.remove(pin)

    def viewAccounts(self):
        print(self.accountsNumbers)

#nazwa banku

bank = Bank("BankFullOFMoney")