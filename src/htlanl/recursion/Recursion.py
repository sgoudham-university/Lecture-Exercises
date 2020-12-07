def fibonacci(i):
    """Get Next Number In Fibonacci Sequence"""
    if i == 0: return 0
    if i == 1: return 1
    return fibonacci(i - 2) + fibonacci(i - 1)


def main():
    """Fibonacci Sequence"""

    for i in range(10):
        print(fibonacci(i))


main()
