from datetime import datetime
import math

def main():
    today = datetime.now().date()
    date_format = "%m/%d/%Y"

    name = ""
    while not name:
        input_name = input("Please enter your name: ").strip()

        if input_name.replace(" ", "").isalpha() and input_name:
            name = input_name
        else:
            print("Invalid input! Names can only contain letters and spaces. Try again.\n")
            
    print(f"\n\tWelcome {name}")

    page = -1
    while page <= 0:
        input_page = input("\nHow many pages does the book have? ").strip()
        try:
            page = int(input_page)
            if page <= 0:
                print("Invalid input! Total pages must be greater than 0. Try again.")
        except ValueError:
            print("Invalid input! Please enter a valid whole number (no text or decimals).")

    issue_date = None
    while issue_date is None:
        input_issue = input("What is the Issue Date? (MM/dd/yyyy): ").strip()
        try:
            issue_date = datetime.strptime(input_issue, date_format).date()
        except ValueError:
            print("Invalid format! Use MM/dd/yyyy (e.g., 10/14/2026).")

    page_read = -1
    while page_read < 0 or page_read > page:
        input_read = input("\nHow many pages have you read? ").strip()
        try:
            page_read = int(input_read)
            if page_read < 0:
                print("Invalid input! Pages read cannot be negative. Try again.")
            elif page_read > page:
                print(f"Invalid input! You cannot read more pages than the book has ({page}). Try again.")
        except ValueError:
            print("Invalid input! Please enter a valid whole number (no text or decimals).")

    due_date = None
    while due_date is None:
        input_due = input("What is the Due Date? (MM/dd/yyyy): ").strip()
        try:
            temp_date = datetime.strptime(input_due, date_format).date()
            if temp_date < issue_date:
                print(f"Error: Due date cannot be earlier than the issue date ({issue_date.strftime(date_format)})!")
            else:
                due_date = temp_date
        except ValueError:
            print("Invalid format! Use MM/dd/yyyy (e.g., 10/25/2026).")
            
    answer = ""
    while answer not in ["y", "yes", "n", "no"]:
        answer = input("\nDo you want to Calculate? (y/n): ").strip().lower()
        if answer not in ["y", "yes", "n", "no"]:
            print("Invalid choice. Please type 'y' or 'n'.")

    if answer in ["y", "yes"]:
        read_percentage = (page_read / page) * 100
        print(f"\nYou have read {read_percentage:.2f}% of the book.")
        
        actual_days_left = (due_date - today).days
        
        if actual_days_left < 0:
            print(f"The book is OVERDUE by {abs(actual_days_left)} days!")
        else:
            print(f"You have {actual_days_left} day(s) remaining to return the book.")
            
        unread_pages = page - page_read
        if actual_days_left > 0 and unread_pages > 0:
            pages_per_day = math.ceil(unread_pages / actual_days_left)
            print(f"You should read {pages_per_day} pages per day to finish on time.")
        elif unread_pages == 0:
            print("Congratulations! You have already finished the book.")
        else:
            print(f"The deadline has passed or is today! You need to finish the remaining {unread_pages} pages immediately.")
    else:
        print("Calculation canceled.")

if __name__ == "__main__":
    main()