print("\nARITHMETIC OPERATIONS\n")

print("Arithmetic Calculator")
print("1. Addition")
print("2. Subtraction")
print("3. Multiplication")
print("4. Division")
print("5. Modulus")
print("6. Increment")
print("7. Decrement")

select = int(input("\nSelect an arithmeticoperation: "))

if select == 1:
    x = float(input("Enter the value of x: "))
    y = float(input("Enter the value of y: "))
    result = x + y
    print(f"\nVariable Values: x = {x}, y = {y}")
    print(f"Addition: {x} + {y} = {result}")
elif select == 2:
    x = float(input("Enter the value of x: "))
    y = float(input("Enter the value of y: "))
    result = x - y
    print(f"\nVariable Values: x = {x}, y = {y}")
    print(f"Subtraction: {x} - {y} = {result}")
elif select == 3:
    x = float(input("Enter the value of x: "))
    y = float(input("Enter the value of y: "))
    result = x * y
    print(f"\nVariable Values: x = {x}, y = {y}")
    print(f"Multiplication: {x} * {y} = {result}")
elif select == 4:
    x = float(input("Enter the value of x: "))
    y = float(input("Enter the value of y: "))
    if y != 0:
        result = x / y
        print(f"\nVariable Values: x = {x}, y = {y}")
        print(f"Division: {x} / {y} = {result}")
    else:
        print("\nError: Division by zero is not allowed.")
elif select == 5:
    x = float(input("Enter the value of x: "))
    y = float(input("Enter the value of y: "))
    result = x % y
    print(f"\nVariable Values: x = {x}, y = {y}")
    print(f"Modulus: {x} % {y} = {result}")
elif select == 6:
    x = float(input("Enter the value of x: "))
    x += 1
    print(f"\nVariable Values: x = {x}")
    print(f"Increment: {x - 1} + 1 = {x}")
elif select == 7:
    x = float(input("Enter the value of x: "))
    x -= 1
    print(f"\nVariable Values: x = {x}")
    print(f"Decrement: {x + 1} - 1 = {x}")
else:
    print("\nInvalid selection. Please choose a valid arithmetic operation.")

cntn = input("\nDo you want to continue? (YES/NO): ")

while cntn == "YES":
    print("\nARITHMETIC OPERATIONS\n")

    print("Arithmetic Calculator")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Modulus")
    print("6. Increment")
    print("7. Decrement")

    select = int(input("\nSelect an arithmetic operation: "))

    if select == 1:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        result = x + y
        print(f"\nVariable Values: x = {x}, y = {y}")
        print(f"Addition: {x} + {y} = {result}")
    elif select == 2:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        result = x - y
        print(f"\nVariable Values: x = {x}, y = {y}")
        print(f"Subtraction: {x} - {y} = {result}")
    elif select == 3:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        result = x * y
        print(f"\nVariable Values: x = {x}, y = {y}")
        print(f"Multiplication: {x} * {y} = {result}")
    elif select == 4:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        if y != 0:
            result = x / y
            print(f"\nVariable Values: x = {x}, y = {y}")
            print(f"Division: {x} / {y} = {result}")
        else:
            print("\nError: Division by zero is not allowed.")
    elif select == 5:
        x = float(input("Enter the value of x: "))
        y = float(input("Enter the value of y: "))
        result = x % y
        print(f"\nVariable Values: x = {x}, y = {y}")
        print(f"Modulus: {x} % {y} = {result}")
    elif select == 6:
        x = float(input("Enter the value of x: "))
        x += 1
        print(f"\nVariable Values: x = {x}")
        print(f"Increment: {x - 1} + 1 = {x}")
    elif select == 7:
        x = float(input("Enter the value of x: "))
        x -= 1
        print(f"\nVariable Values: x = {x}")
        print(f"Decrement: {x + 1} - 1 = {x}") 
    else:
        print("\nInvalid selection. Please choose a valid arithmetic operation.")

print("\nProgram terminated. Thank you!")