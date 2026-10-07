#prog1
print("Hello World")
print()

#prog2
usertext = input("What is your name? ")
print("Hello", usertext)
print()

#prog3
num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

sum = float(num1) + float(num2)

print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))
print()

#prog4
num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

average =(int(num1) + int(num2))

print('average: {0} '.format(average))
print()

#prog5
visagrade = input('enter your visa grade: ')
finalgrade = input('enter your final grade: ')
average =(float(visagrade)*0.3)+(float(finalgrade)*0.7)
print("average: {0} ".format(average))
print()

#prog6
firstexam = input('your first exam: ')
secondexam = input('your second exam: ')
thirdexam = input('your third exam: ')
average =(float(firstexam)+float(secondexam)+float(thirdexam))/3
print("average: {0} ".format(average))
print()

#prog7
average = input('enter average: ')
if(int(average)>=50):
    print("Passed")
else:
    print("Failed")
print()

#prog8
num = int(input("Enter a number: "))
if (num % 2) == 0:
    print("{0} is Even".format(num))
else:
    print("{0} is Odd".format(num))
print()

#prog9
num = float(input("Enter a number: "))
if num > 0:
    print("Positive number")
elif num == 0:
    print("Zero")
else:
    print("Negative number")
print()

#prog10
print("body mass index calculation program")
height = float(input("enter height (m): "))
weight = int(input("enter weight (kg): "))

index = weight/(height*height)

if index <=18:
    print("\nunderweight BMİ: {}".format(index))
elif index > 18 and index <=25 :
    print("\noverweight BMİ: {}".format(index))
elif index > 25 and index <=30:
    print("\nobese BMİ: {}".format(index))
elif index > 30:
    print("\nseverely obese BMİ: {}".format(index))
print()

#prog11
age = input('enter age: ')
if(int(age)<18):
    print("Your Age Is Not Eligible To Get A Driver's License")
else:
    print("Your Age Is Eligible To Get Your License")
print()

#prog12
for i in range(1,101):
    print(i)
print()

#prog13
for i in range(1,101):
    if i%2==0:
        print(i)
print()

#prog14
for i in range(1,101):
    if i%2!=0:
        print(i)
print()

#prog15
for i in range(1,101):
    if i%3==0 or i%5==0:
        print(i)
print()

#prog16
num = input('enter number: ')
for i in range(1,int(num)+1):
    print(i)
print()

#prog17
short = input('Enter short side: ')
tall = input('Enter tall side: ')

area = int(short) * int(tall)
perimeter = 2 * (int(short) + int(tall))

print("area: {0}".format(area))
print("perimeter: {0}".format(perimeter))
print()

#prog18
word = 'mrhuseyin'
for char in word:
    print(char)
print()

#prog19
sumofnumbers = 0
num1 = input('first number: ')
num2 = input('second number: ')

start = int(num1)
end = int(num2)

low = min(start, end)
high = max(start, end)

for i in range(low + 1, high):
    sumofnumbers += i

print("Sum of numbers between {0} and {1} : {2}".format(num1, num2, sumofnumbers))
print()

#prog20
selection = input("Press (1) for Cinema, (2) for Theater : ")
student = input("Are you student(Y/N): ")
price = 0
    #non-discounted fee calculation
if selection == '1':
    price = 10 #cinema
elif selection == '2':
    price = 5 #theatre
    #student discount
if student =='Y' or student =='y':
    price=price / 2 #%50
    print(" The fee you have to pay: {}".format(price))
print()

#prog21
num = int(input("Enter a number: "))

if num > 1:
    for i in range(2,num):
        if (num % i) == 0:
            print(num,"is not a prime number")
            print(i,"times",num//i,"is",num)
            break
        else:
            print(num,"is a prime number")

else:
    print(num,"is not a prime number")
print()

#prog22
NumList = []
Even_Sum = 0
Odd_Sum = 0

Number = int(input("Please enter the Total Number of List Elements: "))
for i in range(1, Number + 1):
    value = int(input("Please enter the Value of %d Element: " %i))
    NumList.append(value)

for j in range(Number):
    if(NumList[j] % 2 == 0):
        Even_Sum = Even_Sum + NumList[j]
    else:
        Odd_Sum = Odd_Sum + NumList[j]

print("\nThe Sum of Even Numbers in this List = ", Even_Sum)
print("The Sum of Odd Numbers in this List = ", Odd_Sum)
print()

#prog23
newsalary = 0
salary = input("enter new salary: ")

raise_rate = input("salary raise rate(%): ")

newsalary = float(salary) + (float(salary) * float(raise_rate) / 100)

print("increased salary:", newsalary)
print()

#prog24
import math

def find_Diameter(radius):
    return 2 * radius

def find_Circumference(radius):
    return 2 * math.pi * radius

def find_Area(radius):
    return math.pi * radius * radius

r = float(input('Please Enter the radius of a circle: '))

diameter = find_Diameter(r)
circumference = find_Circumference(r)
area = find_Area(r)

print("\nDiameter Of a Circle = %.2f" %diameter)
print("Circumference Of a Circle = %.2f" %circumference)
print("Area Of a Circle = %.2f" %area)
print()

#prog25
def areaRectangle(a, b):
    return (a * b)

def perimeterRectangle(a, b):
    return (2 * (a + b))
a = 5;
b = 6; print ("Area = ", areaRectangle(a, b))

print ("Perimeter = ", perimeterRectangle(a, b))
print()

#prog26
import random
import math

# Taking Inputs
lower = int(input("Enter Lower bound:- "))
upper = int(input("Enter Upper bound:- "))

# Generating random number between the lower and upper
x = random.randint(lower, upper)

# Calculate total chances cleanly using ceil
chances = math.ceil(math.log(upper - lower + 1, 2))
print(f"\n\tYou've only {chances} chances to guess the integer!\n")

# Initializing the number of guesses.
count = 0

# Loop runs while count is less than total allowed chances
while count < chances:
    # Taking guessing number as input
    guess = int(input("Guess a number:- "))
    count += 1  # Increment after the guess is taken

    # Condition testing
    if x == guess:
        print("Congratulations you did it in ", count, " try")
        break
    elif x > guess:
        print("You guessed too small!")
    elif x < guess:
        print("You Guessed too high!")

# If the loop finishes and the last guess was wrong
if count >= chances and x != guess:
    print("\nThe number is %d" % x)
    print("\tBetter Luck Next time!")

print()

#prog27
import datetime

date=str(input('Enter the date(for example:09 02 2019): '))

day_name= ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday',
'Saturday','Sunday']
day = datetime.datetime.strptime(date, '%d %m %Y').weekday()
print(day_name[day])
print()

#prog28
def find_missing(lst):
    return [x for x in range(lst[0], lst[-1]+1)
if x not in lst]

    # Driver code
lst = [1, 2, 4, 6, 7, 9, 10]
print(find_missing(lst))
print()

#prog29
char_list = ["a", "b" ,"c"]
string = "abcd"
matched_list = [characters in char_list for characters in string]
print(matched_list)
string_contains_chars = all(matched_list)
print(string_contains_chars)
print()

#prog30
total = 0
evenSums = 0
evenCount = 0 

oddSums = 0
oddCount = 0   

done = False

while not done:
    user_in = input("Give me an integer or type 'done' to be done: ")
    
    if user_in.lower() == "done":
        done = True
    else:
        num = int(user_in)
        total += num
        
        if num % 2 == 0:
            evenSums += num
            evenCount += 1
        else:
            oddSums += num
            oddCount += 1

evenAverage = evenSums / evenCount if evenCount > 0 else 0
oddAverage = oddSums / oddCount if oddCount > 0 else 0

print("\n--- Results ---")
print("Total Sum:", total)
print("Even Average: " + str(evenAverage))
print("Odd Average: " + str(oddAverage))
