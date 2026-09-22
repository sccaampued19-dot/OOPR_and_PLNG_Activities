print("\nPRICE CONVERTER\n")

print("Enter the prices of 6 items in dollars ($)")
price1 = float(input(" - Enter the price of item 1: $ "))
price2 = float(input(" - Enter the price of item 2: $ "))
price3 = float(input(" - Enter the price of item 3: $ "))
price4 = float(input(" - Enter the price of item 4: $ "))
price5 = float(input(" - Enter the price of item 5: $ "))
price6 = float(input(" - Enter the price of item 6: $ "))

new_price1 = price1 * 0.87
new_price2 = price2 * 0.87
new_price3 = price3 * 0.87
new_price4 = price4 * 0.87
new_price5 = price5 * 0.87
new_price6 = price6 * 0.87

print("\nConverted Prices in Euros (€):")
print(f" - Item 1: € {new_price1:.2f}")
print(f" - Item 2: € {new_price2:.2f}")
print(f" - Item 3: € {new_price3:.2f}")
print(f" - Item 4: € {new_price4:.2f}")
print(f" - Item 5: € {new_price5:.2f}")
print(f" - Item 6: € {new_price6:.2f}")
