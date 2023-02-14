from math import cos, sin, radians

class Vehicle:
    def __init__(self, make, model, capacity: int) -> None:
        self.make = make
        self.model = model
        self.capacity:int = capacity

        self.x: float = 0
        self.y: float = 0
        self.deg: float = 0

    def move_forward(self, distance: float) -> None:
        self.y = distance * sin(radians(self.deg))
        self.x = distance * cos(radians(self.deg))


class LandVehicle(Vehicle):
    def __init__(self, make, model, capacity: int, wheels_count: int, winter_tires: bool) -> None:
        super().__init__(make, model, capacity)
        self.wheels_count:int = wheels_count
        self.winter_tires: bool = winter_tires

    def change_tires(self) -> None:
        self.winter_tires = not self.winter_tires
        tire_type = ["Summer", "Winter"]
        print(f"Changing tires for {tire_type[self.winter_tires]} tires")


class AirVehicle(Vehicle):
    def __init__(self, make, model, capacity: int, engines_count: int, engines_type) -> None:
        super().__init__(make, model, capacity)
        self.engines_count: int = engines_count
        self.engines_type = engines_type
        self.z: float = 0

    def move_height(self, height: float):
        self.z += height

class WaterVehicle(Vehicle):
    def __init__(self, make, model, capacity: int, displacement: int) -> None:
        super().__init__(make, model, capacity)
        self.displacement: int = displacement

    def load_ship(self):
        print("Ship is being loaded")


car_1 = LandVehicle("Mazda", "Miata", 1, 3, True)
car_2 = LandVehicle("Boeing", "Pasazerski", 5, 4, False)

car_2.deg = 37
car_2.move_forward(5)
print(car_2.x, car_2.y)

plane = AirVehicle("PGZ", "F-16", 500, 2, "Jet")
helicopter = AirVehicle("Make", "Model", 4, 1, "Propeler")

titanic = WaterVehicle("Titanic", "Titanic", 600, 1200)
evergiven = WaterVehicle("Evergrande", "Evergiven", 20, 12345677)