def main():
    """Examples of Using Lists"""

    good_lecturers = ["Derek", "Matt", "Waqar"]
    print("The Good Lecturers: ", good_lecturers)

    good_lecturers.remove("Matt")

    print("The Good Lecturers: ", good_lecturers)

    sliced_list = good_lecturers[:-1]
    print(sliced_list)

    element_from_slice_list = sliced_list[0]
    sliced_element_from_slice_list = element_from_slice_list[2:4]
    print(sliced_element_from_slice_list)

    best_lecturers = []
    best_lecturers.append("Matt")
    print("Best Lecturers: ", best_lecturers)

    command_line_input = list(input("Please Enter Numbers: "))
    print(command_line_input)

    spaced_command_line_input = input("Please Enter Numbers: ")
    list_command_line_input = spaced_command_line_input.split()
    print(list_command_line_input)


main()
