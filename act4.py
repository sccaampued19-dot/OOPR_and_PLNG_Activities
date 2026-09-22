print("Welcome! Please enter the cost of your purchased items.")
item1 = float(input(" - Enter the cost of item 1:  "))
item2 = float(input(" - Enter the cost of item 2:  "))
cost = item1 + item2
payment_amount = float(input(f"\nYour total cost is {cost:.2f}. Please enter your payment amount: "))

if payment_amount >= cost:
    change = payment_amount - cost
    if change > 0:
        print(f"Your change is {change:.2f}. Thank you for your purchase!")
    else:
        print("Your don't have any change. Thank you for your purchase!")
else:
    owe = cost - payment_amount
    remaining_amount = float(input(f"You still owe {owe:.2f}. Please provide the remaining amount: "))
    remaining_amount -= owe
    if remaining_amount >= 0:
        print(f"Your change is {remaining_amount:.2f}. Thank you for your purchase!")

new = input(f"\nDo you want to enter another transaction? (YES/NO): ")

while new.upper() == "YES":
    print("\nWelcome! Please enter the cost of your purchased items.")
    item1 = float(input(" - Enter the cost of item 1:  "))
    item2 = float(input(" - Enter the cost of item 2:  "))
    cost = item1 + item2
    payment_amount = float(input(f"\nYour total cost is {cost:.2f}. Please enter your payment amount: "))

    if payment_amount >= cost:
        change = payment_amount - cost
        if change > 0:
            print(f"Your change is {change:.2f}. Thank you for your purchase!")
        else:
            print("Your don't have any change. Thank you for your purchase!")
    else:
        owe = cost - payment_amount
        print(f"You still owe {owe:.2f}. Please provide the remaining amount.")

    new = input(f"\nDo you want to enter another transaction? (YES/NO): ")

print("\nProgram terminated. Thank you for shopping with us!")