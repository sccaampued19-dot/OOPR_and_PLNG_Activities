print("\nStudent Grade Calculator\n")

java = int(input("Java Programming Score: "))
c = int(input("C Programming Score: "))
database_handling = int(input("Database Handling Score: "))

average = (java + c + database_handling) / 3

print(f"\nAverage Score: {average}")

if average >= 90:
    print("Grade: A because the average is between 90 and 100")
elif average >= 80:
    print("Grade: B because the average is between 80 and 89")
elif average >= 75:
    print("Grade: C because the average is between 75 and 79")
else:
    print("Grade: F because the average is below 75")

cntn = input("\nDo you want to continue? (YES/NO): ")

while cntn == "YES":
    java = int(input("Java Programming Score: "))
    c = int(input("C Programming Score: "))
    database_handling = int(input("Database Handling Score: "))

    average = (java + c + database_handling) / 3

    print(f"\nAverage Score: {average:.2f}")

    if average >= 90:
        print("Grade: A because the average is between 90 and 100")
    elif average >= 80:
        print("Grade: B because the average is between 80 and 89")
    elif average >= 75:
        print("Grade: C because the average is between 75 and 79")
    else:
        print("Grade: F because the average is below 75")

    cntn = input("\nDo you want to continue? (YES/NO): ")

print("\nProgram terminated. Thank you!")
