import sys

class BankAccount:
    def __init__(self, initial_balance):
        self._balance = initial_balance

    def withdraw(self, amount):
        if amount <= self._balance:
            self._balance -= amount
            print(f"Successfully withdrew {amount:.2f}")
        else:
            print("Insufficient funds for this withdrawal.")

    def deposit(self, amount):
        self._balance += amount
        print(f"Successfully deposited {amount:.2f}")

    def get_balance(self):
        return self._balance


class LabDate:
    def __init__(self, year, month, day):
        self.year = year
        self.month = month
        self.day = day

    def __str__(self):
        return f"{self.year}/{self.month}/{self.day}"


class PatientBase:
    def __init__(self):
        self.name = ""
        self.admission_date = None
        self.disease = ""
        self.discharge_date = None

    def enter_info(self):
        self.name = input("1. Name of the patient: ")
        print("2. Date of admission:")
        self.admission_date = read_date()
        self.disease = input("3. Disease: ")
        print("4. Date of discharge:")
        self.discharge_date = read_date()

    def display_info(self):
        print(f"Patient Name: {self.name}")
        print(f"Date of Admission: {self.admission_date}")
        print(f"Disease: {self.disease}")
        print(f"Date of Discharge: {self.discharge_date}")


class Patient(PatientBase):
    def __init__(self):
        super().__init__()
        self._age = 0

    def enter_info(self):
        super().enter_info()
        self._age = read_int_in_range("5. Age: ", 0, 150)

    def display_info(self):
        super().display_info()
        print(f"Age: {self._age}")
        print("-" * 40)

    def get_age(self):
        return self._age


class Professor:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def __str__(self):
        return f"Name: {self.name}\n• Salary: {int(self.salary)}"


class Dean(Professor):
    def __init__(self, name, salary, department):
        super().__init__(name, salary)
        self.department = department

    def __str__(self):
        return (f"\n Status\n Rank: Dean\n Name: {self.name}\n "
                f"Department: {self.department}\n Salary: {int(self.salary)}")


class Executive(Dean):
    def __init__(self, name, salary, department):
        super().__init__(name, salary, department)

    def __str__(self):
        dean_string = super().__str__()
        return dean_string.replace("Rank: Dean", "Rank: Executive")


def read_int(prompt):
    while True:
        try:
            return int(input(prompt))
        except ValueError:
            print("Error: Please enter a whole number.")


def read_int_in_range(prompt, min_val, max_val):
    while True:
        value = read_int(prompt)
        if min_val <= value <= max_val:
            return value
        print(f"Error: Value must be between {min_val} and {max_val}.")


def read_non_negative_double(prompt):
    while True:
        try:
            value = float(input(prompt))
            if value >= 0:
                return value
            print("Error: Value cannot be negative.")
        except ValueError:
            print("Error: Please enter a valid number.")


def read_date():
    year = read_int_in_range("   Enter Year: ", 1, 9999)
    month = read_int_in_range("   Enter Month (1-12): ", 1, 12)
    day = read_int_in_range("   Enter Day (1-31): ", 1, 31)
    return LabDate(year, month, day)


def run_bank_account_program():
    print("\nBank Account\nWelcome!")
    while True:
        try:
            initial_balance = float(input("Enter your initial balance: "))
            if initial_balance < 0:
                print("Error: Balance cannot be negative. Try again.")
                continue
            break
        except ValueError:
            print("Error: Invalid input! Characters and strings are not allowed.")

    account = BankAccount(initial_balance)
    choice = 0

    while choice != 3:
        print("\nSelect an option:")
        print("1. Withdraw Amount")
        print("2. Deposit Amount")
        print("3. Return to Main Workspace Selector")
        choice = read_int("Enter selection (1-3): ")

        if choice == 1:
            while True:
                try:
                    print("\nHow much amount you want to withdraw from your account?")
                    withdraw_amount = float(input("Amount: "))
                    if withdraw_amount < 0:
                        print("Error: Amount cannot be negative.")
                        continue
                    account.withdraw(withdraw_amount)
                    break
                except ValueError:
                    print("Error: Invalid transaction amount format.")
            print(f"Your current balance is: {account.get_balance():.2f}")
        
        elif choice == 2:
            while True:
                try:
                    print("\nHow much amount you want to deposit in your account?")
                    deposit_amount = float(input("Amount: "))
                    if deposit_amount < 0:
                        print("Error: Amount cannot be negative.")
                        continue
                    account.deposit(deposit_amount)
                    break
                except ValueError:
                    print("Error: Invalid transaction amount format.")
            print(f"Your current balance is: {account.get_balance():.2f}")
        
        elif choice == 3:
            print("\nThank you for using the system!")
        else:
            print("\nInvalid selection. Please choose 1, 2, or 3.")


def run_patient_database_program():
    database = []
    print("\nPatient Registry")
    
    while True:
        print("\n1. Insert New Patient")
        print("2. Display all Patients")
        print("3. Display pediatric patients (< 12 Years)")
        print("4. Return to Main Workspace Selector")
        choice = read_int("Enter choice: ")
        
        if choice == 1:
            p = Patient()
            p.enter_info()
            database.append(p)
            print("Patient added successfully!")
            
        elif choice == 2:
            print("\nAll Patients:")
            if not database:
                print("No records found.")
            else:
                for patient in database:
                    patient.display_info()
                    
        elif choice == 3:
            print("\nPediatric Patients (Less than 12 Years) ")
            found_pediatric = False
            for patient in database:
                if patient.get_age() < 12:
                    patient.display_info()
                    found_pediatric = True
            if not found_pediatric:
                print("No pediatric patients found.")
                
        elif choice == 4:
            print("Exiting...")
            break
        else:
            print("Invalid option! Please pick 1, 2, 3, or 4.")


def run_academic_hierarchy_program():
    print("\nAcademic Hierarchical Roles")
    while True:
        print("\nAre you a Dean or an Executive?")
        print("1. Dean")
        print("2. Executive")
        print("3. Return to Main Workspace Selector")
        choice = read_int("Enter your choice (1-3): ")
        
        if choice in [1, 2]:
            name = input("\nEnter Name: ")
            department = input("Enter Department: ")
            salary = read_non_negative_double("Enter Salary: ")
            if choice == 1:
                dean = Dean(name, salary, department)
                print(dean)
            else:
                exec_member = Executive(name, salary, department)
                print(exec_member)
        elif choice == 3:
            print("\nExiting...")
            break
        else:
            print("\nInvalid choice. Please select 1, 2, or 3.")


def main():
    main_choice = 0
    while main_choice != 4:
        print("\n=============================================")
        print("             MIDTERM LAB ACTIVITY 6          ")
        print("=============================================")
        print("1. Run Bank Account System1")
        print("2. Run Patient Database System")
        print("3. Run Academic Hierarchy Profile")
        print("4. Exit")
        print("=============================================")
        main_choice = read_int("Select a program to execute (1-4): ")

        if main_choice == 1:
            run_bank_account_program()
        elif main_choice == 2:
            run_patient_database_program()
        elif main_choice == 3:
            run_academic_hierarchy_program()
        elif main_choice == 4:
            print("\nSession terminated.")
        else:
            print("\nInvalid selection! Restrict choice to (1-4).")


if __name__ == "__main__":
    main()