# 1. Read all numbers on a single line and store them in an array (list)
print("Enter 10 real numbers separated by spaces:")
user_input = input()

# Split the string by spaces and convert each item into a float
numbers = [float(item) for item in user_input.split()]

# Ensure we process exactly the first 10 numbers if more were entered
numbers = numbers[:10]


# --- LOOP 1: Sum and Average of Positive Numbers ---
sum_positive = 0
positive_count = 0

for num in numbers:
    if num > 0:
        sum_positive += num
        positive_count += 1

average_positive = sum_positive / positive_count if positive_count > 0 else 0


# --- LOOP 2: Count Negative Numbers ---
negative_count = 0

for num in numbers:
    if num < 0:
        negative_count += 1


# --- LOOP 3: Find the Minimum Value ---
# Start by assuming the first number in the array is the smallest
min_value = numbers[0]

for num in numbers:
    if num < min_value:
        min_value = num


# --- Display Results ---
print("\n--- RESULTS ---")
print("The sum of positive numbers is:", sum_positive)
print("The average of positive numbers is:", average_positive)
print("The total count of negative numbers is:", negative_count)
print("The minimum value in the array is:", min_value)
