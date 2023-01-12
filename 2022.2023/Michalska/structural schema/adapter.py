class EuropeanPlug:
    def voltage(self):
        return 230

class AmericanSocket:
    def use_voltage(self, plug):
        if plug.voltage() == 110:
            print("Using American socket with voltage 110V")
        else:
            print("Incompatible voltage")

class AmericanPlug:
    def __init__(self):
        self._plug = EuropeanPlug()
        
    def voltage(self):
        return 110

class EuropeanSocket:
    def use_voltage(self, plug):
        if plug.voltage() == 230:
            print("Using European socket with voltage 230V")
        else:
            print("Incompatible voltage")

# Create adapter
class AmericanToEuropeanAdapter(AmericanPlug):
    def voltage(self):
        return self._plug.voltage()

# Create objects
european_socket = EuropeanSocket()
american_plug = AmericanToEuropeanAdapter()

# Use American plug in European socket
european_socket.use_voltage(american_plug)


#W tym przykładzie klasa EuropeanPlug posiada interfejs do zasilania 
#o napięciu 230V, natomiast klasa AmericanSocket posiada interfejs do
#zasilania o napięciu 110V. Aby AmericanPlug mógł być używany z EuropeanSocket,
#stworzyliśmy klasę AmericanToEuropeanAdapter, która dostosowuje
#interfejs AmericanPlug do interfejsu EuropeanPlug.