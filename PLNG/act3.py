print("MULTIPLE OF 5")

x = int(input(" - Enter a number: "))
if x >= 1 and x <= 100:
    if x % 5 == 0:
        print(f" - {x} is valid.")
    else:
        print(f" - {x} is not valid.")
else:
    print(f" - {x} is out of range. Please enter a number between 1 and 100.")
