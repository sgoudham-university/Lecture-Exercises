def main():
    """Demonstrating the use of dictionaries"""

    lecturers = ["Matt", "Derek", "Waqar", "John", "Hannah"]
    not_cool = {}
    cool = {}

    for lecturer in lecturers:
        if lecturer == "Matt":
            not_cool[lecturer] = "Hates their students"
        else:
            cool[lecturer] = "Likes their students"

    print()
    print(cool)
    print(not_cool)
    print()

    # Time to get rid of Matt forever
    del not_cool["Matt"]
    print(f"Matt has been deleted - {not_cool}")

    print()

    # Pop a random lecturer from the dict
    print(f"Lecturer Removed - {cool.popitem()}")
    print(f"After Random Lecturer Was Removed - {cool}")

    print()

    # One important thing to note is that using .get() on a key that doesn't exist returns None
    # However, trying to access the key with the dict[key] notation will result in an Error

    # Doesn't result in KeyError and returns None
    print(cool.get("Matt"))

    # Results in KeyError
    cool["Matt"]


main()

a = [1, 2, 3]
b = a
a.append(1)
print(id(a))
print(id(b))
print(b)

mapping = {"name": "Star Wars", "duration": "125", "rating": [1, 2, 3]}
mapping_2 = mapping
mapping["rating"] = [2, 3]
print(mapping)
print(mapping_2)

movie = {"name": "Star Wars", "duration": 125, "credits": {"director": "Matt"}}
new_movie = movie.copy()
new_movie["credits"]["director"] = "Goudham"
print(movie)
print(new_movie)
