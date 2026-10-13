print("Choose the program you want to run:")
print(" - Program 1")
print(" - Program 2")
print(" - Program 3")
print(" - Program 4")
print(" - Program 5")
print(" - Program 6")

while True:
    choice = input("\nEnter your choice (1-6): ")

    if choice == "1":
        print("\nRunning Program 1...\n")
        num = [float(x) for x in input("Enter 10 real numbers (negative and positive) separated by spaces: ").split()]

        sum_positive = 0
        average_positive = 0
        for i in range(len(num)):
            if num[i] > 0:
                sum_positive += num[i]
            else:
                continue

        if len([x for x in num if x > 0]) > 0:
            average_positive = sum_positive / len([x for x in num if x > 0])

        print(f"Sum of positive numbers: {sum_positive:.2f}")
        print(f"Average of positive numbers: {average_positive:.2f}")

        negative_count = 0
        for i in range(len(num)):
            if num[i] < 0:
                negative_count += 1

        print(f"Count of negative numbers: {negative_count:.2f}")

        for i in range(len(num)):
            if i == 0:
                min_value = num[i]
            elif num[i] < min_value:
                min_value = num[i]
        print(f"Minimum value: {min_value:.2f}")

        break

    elif choice == "2":
        print("\nRunning Program 2...\n")
        print("Enter 8 integer numbers:")
        num = {float(input("Enter number 1: ")),
            float(input("Enter number 2: ")),
            float(input("Enter number 3: ")),
            float(input("Enter number 4: ")),
            float(input("Enter number 5: ")),
            float(input("Enter number 6: ")),
            float(input("Enter number 7: ")),
            float(input("Enter number 8: "))}
        print()
        print("Your numbers are:", num)

        num = list(num)
        num.remove(max(num))
        num.remove(min(num))

        second_greatest = max(num)
        second_smallest = min(num)

        print("The second greatest number is:", second_greatest)
        print("The second smallest number is:", second_smallest)

        break

    elif choice == "3":
        print("\nRunning Program 3...\n")
        data = [int(x) for x in input("Enter Data in Array: ").split()]

        print("Stored Data in Array:", data)

        element_position = int(input("Enter position of Elements to Delete: "))

        data.remove(data[element_position])
        print("New data in Array:", data)

        break

    elif choice == "4":
        print("\nRunning Program 4...\n")
        size = int(input("Enter Size of Array: "))

        elements = [int(x) for x in input(f"Enter any {size} elements in Array: ").split()]
        print()

        even = []
        odd = []

        for i in elements:
            if i % 2 == 0:
                even.append(i)
            else:
                odd.append(i)

        print("Even Elements:", *even)
        print("Odd Elements:", *odd)

        break

    elif choice == "5":
        print("\nRunning Program 5...\n")
        next_ = "A*"
        loop = 0

        while True:
            if loop == 0:
                print("*")
            loop += 1
            print("*" + next_)
            next_ += "A*"
            if loop == 3:
                break

        break

    elif choice == "6":
        print("\nRunning Program 6...\n")
        basic_salary = float(input("Basic Salary: $"))

        da = basic_salary * 0.12
        print(f"DA: ${da:.2f}")

        hra = float(input("HRA: $"))

        others = float(input("Others: $"))

        tax_cut_pf = basic_salary * 0.14
        tax_cut_it = basic_salary * 0.15
        print(f"Tax Cut: a) PF: ${tax_cut_pf:.2f} and b) IT: ${tax_cut_it:.2f}")

        net_salary = basic_salary + da + hra + others - (tax_cut_pf + tax_cut_it)
        print(f"Net Salary: ${net_salary:.2f}")

        break

    else:
        print("\nInvalid choice. Please enter a number between 1 and 6.")

    answer = input("\nDo you want to run another program? (yes/no): ").strip().lower()
    if answer != "yes":
        break
