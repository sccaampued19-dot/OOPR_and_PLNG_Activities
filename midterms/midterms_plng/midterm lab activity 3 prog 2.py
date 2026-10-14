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
