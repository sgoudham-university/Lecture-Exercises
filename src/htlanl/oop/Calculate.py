class Bill:
    converter = 12.376
    VAT = 25.00

    def __init__(self, power_used):
        self.power_used = power_used
        self.cost = 0
        self.total_cost = 0

    def calculate_cost(self, units_used):
        self.cost = units_used * Bill.converter

    def add_standing(self, bill):
        self.total_cost = bill + Bill.VAT

    def display_cost(self, total):
        print("The cost of your bill is £{:.2f}".format(total))

    def __repr__(self):
        return "This is my bill: " + str(self.total_cost)


