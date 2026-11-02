print("Choose an option")
print("[1] Run Program 1")
print("[2] Run Program 2")
choice = int(input("Enter your choice (1 or 2): "))

if choice == 1:
    print("\nPROGRAM 1")
    message = str(input("Input message: "))

    bytes_obj = bytes(message, "utf-8")
    print("1. Bytes object:", bytes_obj)

    string = bytes_obj.decode("utf-8")
    print("2. Bytes to string:", string)

    hex_string = message.encode("utf-8").hex()
    print("3. Hexadecimal string:", hex_string)

    back_to_bytes_object = bytes.fromhex(hex_string)
    print("4. Hex to bytes:", back_to_bytes_object)

    bytearray_obj = bytearray(message, "utf-8")
    print("5. New bytearray:", bytearray_obj) 

    bytearray_obj = bytearray(bytes_obj)
    print("6. Bytes to bytearray:", bytearray_obj) 

    print("7. Sliced bytes:", bytes_obj[6:])

    bytearray_obj = bytearray(message, "utf-8")

    first_char_lower = chr(bytearray_obj[0]).lower()  
    bytearray_obj[0] = ord(first_char_lower)          

    result = bytearray_obj.decode("utf-8")
    print("8. Modified message:", result)

elif choice == 2:
    print("\nPROGRAM 2")
    first_name = str(input("First name: "))
    last_name = str(input("Last name: "))

    fullname = first_name + " " + last_name
    print(fullname)

    print("First character:", first_name[0])
    print("Last character:", last_name[-1])

    try:
        first_name[0] = "D"
    except TypeError:
        print("Strings are immutable; individual characters cannot be changed directly.")

    new_name = "D" + (first_name[1:])

    print("New name: ", new_name)
    print("Original name:", first_name)

    print("Characters in the fullname:")
    for x in fullname:
        print(x)

    try:
        firstname, lastname = fullname.split(maxsplit=1)
        print("Sliced first name: ", firstname)
        print("Sliced last name: ", lastname)
    except ValueError:
        print("Error.")

    char = str(input("Enter one character to search: "))

    if char in fullname:
        indices = [] 

        for i, letter in enumerate(fullname):
            if letter == char:
                indices.append(i)  

        indices_string = ", ".join(str(idx) for idx in indices)

        print("Character found at index:", indices_string)
    else:
        print(f"Character '{char}' was not found.")

    print(f"The blank line between {first_name[-1]} and {last_name[0]} is the space in the \"{fullname}\"")