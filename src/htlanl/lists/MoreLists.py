def sort_lists(char_list, num_list):
    """Sort the lists given"""

    # Using dumb print statements
    print()

    # Sorting all the characters
    print(f"Before Sort: {char_list}")
    print(f"Descending Sort: {char_list.sort(reverse=True)}")
    print(f"Ascending Sort: {char_list.sort()}")

    # Using dumb print statements
    print()

    # Sorting all the numbers
    print(f"Before Sort: {num_list}")
    print(f"Descending Sort: {num_list.sort(reverse=True)}")
    print(f"Ascending Sort: {num_list.sort()}")


def print_lists_side_by_side(char_list, num_list):
    """Print out the lists side by side (Matching ASCII to Char)"""

    # Using dumb print statements
    print()

    # The problem with using the length of one list is that
    # What happens when one list is bigger than the other!?!? ERROR??
    for i in range(len(char_list)):
        print(f"{char_list[i]} - {num_list[i]}")

    # Using dumb print statements
    print()

    # Dumb way of doing it with built-in zip function
    # zip() allows for parallel iteration essentially
    # Like iterating through 2 lists at once :D
    for (char, num) in zip(char_list, num_list):
        print(f"{char} - {num}")


def main(data):
    """More Practice Using Lists"""

    char_list = []
    num_list = []

    for element in data:
        if (isinstance(element, int)):
            num_list.append(element)
        elif (isinstance(element, str)):
            char_list.append(element)

        # Example of one line implementation BUT WE DON'T CARE ABOUT IT
        # Thankfully the one line implementations for Python are very readable UNLIKE SOME LANGUAGES (cough cough Java)
        # num_list.append(element) if isinstance(element, int) else char_list.append(element)

    sort_lists(char_list, num_list)
    print_lists_side_by_side(char_list, num_list)


data = ["B", 78, 69, "E", "S", 73, "P", 80, 83, 66, "I", "N"]
main(data)
