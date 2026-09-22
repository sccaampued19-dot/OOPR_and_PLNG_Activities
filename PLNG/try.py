txt = "Hello, World!"
print(txt[5:7].upper())
print(txt.upper())
name = "Python"
print("I love Python")

print(" ")

print(10>9)
print(10==9)
print(10<9)

print(" ")

a = 200
b = 33

print(10 > 9)
print(10 == 9)
print(bool("Hello"))
print(bool(0))

print(" ")

a = 15
b = 4
print(a % b)
print(a // b)
print(a * b)
a += 10
print(a)

print(" ")

thislist = ["apple", "banana", "cherry"]
print(thislist)

print(" ")

thislist = ["apple", "banana", "cherry", "apple", "cherry"]
print(thislist)

print(" ")

thislist = ["apple", "banana", "cherry"]
thislist.append("orange")
print(thislist)

print(" ")

thislist = ["apple",  "banana", "cherry"]
thislist.insert(1, "Maksuda Sultana")
print(thislist)

print(" ")

thislist = ["apple", "Maksuda Sultana", "cherry"]
thislist.remove("Maksuda Sultana")
print(thislist)

print(" ")

thislist = ["apple", "banana", "cherry"]
thislist.pop(1)
print(thislist)

print(" ")

thislist = ["apple", "banana", "cherry"]
del thislist[0]
print(thislist)

print(" ")

thislist = ["apple", "banana", "cherry"]
for x in thislist:
    print(x)

print(" ")

color = ["red", "green", "blue"]
print(color[0])
color [1] = "blue"
color.append("purple")
del color[0]
print(color)

print(" ")

thistuple = ("apple", "banana", "cherry")
print(thistuple[-0])

print(" ")

thistuple = ("aple", "banana", "cherry", "orange", "kiwi", "melon", "mango")
print(thistuple[2:5])

print(" ")

a = 200
b = 33
if b > a:
    print("b is greater than a")
elif a == b:
    print("a and b are equal")
else:
    print("a is greater than b")

print(" ")

age = 20
if age < 13:
    print("Child")
elif age < 18:
    print("Teenager")
else:
    print("Adult")

print(" ")