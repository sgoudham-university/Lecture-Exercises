import Calculate


def main():
    """Calculate Bill"""
    bill = Calculate.Bill(float(input("Please Enter The Amount of Units: ")))
    bill.calculate_cost(bill.power_used)
    bill.add_standing(bill.cost)
    bill.display_cost(bill.total_cost)
    print(bill.__repr__())


main()
