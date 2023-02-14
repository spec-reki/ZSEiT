class Subject:
    def __init__(self):
        self._observers = []

    def attach(self, observer):
        self._observers.append(observer)

    def detach(self, observer):
        self._observers.remove(observer)

    def notify(self):
        for observer in self._observers:
            observer.update()

class Observer:
    def update(self):
        pass

class ConcreteObserver(Observer):
    def update(self):
        print("Observer has been notified.")

subject = Subject()
observer = ConcreteObserver()
subject.attach(observer)
subject.notify() # Output: Observer has been notified.

#W powyższym przykładzie, klasa Subject jest "obiektem obserwowanym" 
# i posiada listę obiektów Observer, które mogą być powiadamiane o
#  zmianie stanu. Klasa Observer jest abstrakcyjna i posiada metodę
#  update(), która jest wywoływana przez Subject, gdy zmienia się jego stan. 
# Klasa ConcreteObserver dziedziczy po Observer i implementuje metodę update() 
# w celu wykonania konkretnych działań po otrzymaniu powiadomienia.