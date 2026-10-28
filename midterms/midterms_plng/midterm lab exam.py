class Book:
    def __init__(self, title, author, price):
        self.title = title
        self.author = author
        self.price = price

    def __str__(self):
        return f"Book: {self.title}  |  Author: {self.author}\nPrice: PHP {self.price:.2f}"

class EBook(Book):
    def __init__(self, title, author, price, file_size_mb):
        super().__init__(title, author, price)
        self.file_size_mb = file_size_mb

    def __str__(self):
        return f"{super().__str__()}  |  File size: {self.file_size_mb} MB"

def main():
    books = [
        Book("Python Basics", "Maria Santos",  450.00),
        EBook("Learning OOP", "Ana Cruz", 300.00, 5),
        EBook("Learning Python", "Juan Cruz", 299.00, 12)
    ]

    print ("Program 1: \n")

    for book in books:
        print(book)
        print()  

if __name__ == "__main__":
    main()

class Product:
    def __init__(self, product_name, price):
        self.product_name = product_name
        self.price = price

    def __str__(self):
        return f"Product: {self.product_name}\nPrice: PHP {self.price:.2f}"


class ElectronicProduct(Product):
    def __init__(self, product_name, price, warranty_months):
        super().__init__(product_name, price)
        self.warranty_months = warranty_months

    def __str__(self):
        return f"{super().__str__()}\nWarranty: {self.warranty_months} months"


class Laptop(ElectronicProduct):
    def __init__(self, product_name, price, warranty_months, ram_gb, storage_gb):
        super().__init__(product_name, price, warranty_months)
        self.ram_gb = ram_gb
        self.storage_gb = storage_gb

    def __str__(self):
        return f"{super().__str__()}\nRAM: {self.ram_gb} GB\nStorage: {self.storage_gb} GB"


def main():
    laptops = [
        Laptop("Lenovo Laptop", 35000.00, 24, 16, 512),
        Laptop("Asus Laptop", 35000.00, 12, 16, 512)
    ]
    
    print ("Program 4: \n")

    for laptop in laptops:
        print(laptop)
        print()  


if __name__ == "__main__":
    main()