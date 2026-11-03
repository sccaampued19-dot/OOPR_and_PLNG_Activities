#31
import pymysql.cursors

connection = pymysql.connect(host='localhost', user='root', password='', db='students', charset='utf8mb4', cursorclass=pymysql.cursors.DictCursor)

try:
    with connection.cursor() as cursor:
        sql = "SELECT `id`, `firstname`,`lastname` FROM `users`"
        cursor.execute(sql)
        for row in cursor.fetchall():
            firstname = str(row["firstname"])
            lastname = str(row["lastname"])
            print("firstname : " + firstname)
            print("lastname : " + lastname)
finally:
    connection.close()


#32
from tkinter import *
window = Tk()

window.title('Hello Python')
window.geometry("300x200+10+20")
window.mainloop()

#33
from tkinter import *
from tkinter import messagebox
window = Tk()
window.title("mrhuseyin.medium.com")
window.geometry("400x300")
application = Frame(window)
application.grid()
L1 = Label(application, text="Enter your name")
L1.grid(padx=110, pady=10)
E1 = Entry(application, bd =2)
E1.grid(padx=110, pady=3)
window.mainloop()

#34
from tkinter import *

from tkinter import messagebox

window = Tk()

window.title("mrhuseyin.medium.com")
window.geometry("400x300")

application = Frame(window)
application.grid()

Lb1 = Listbox(application)
Lb1.insert(1, "Python")
Lb1.insert(2, "C#")
Lb1.insert(3, "JAVA")
Lb1.insert(4, "JAVASCRIPT")
Lb1.grid(padx=110, pady=10)

pencere.mainloop()

#35
from openpyxl import *
from tkinter import *

wb = load_workbook('C:\\Users\\Admin\\Desktop\\excel.xlsx')

sheet = wb.active

def excel():

    sheet.column_dimensions['A'].width = 30
    sheet.column_dimensions['B'].width = 10
    sheet.column_dimensions['C'].width = 10
    sheet.column_dimensions['D'].width = 20
    sheet.column_dimensions['E'].width = 20
    sheet.column_dimensions['F'].width = 40
    sheet.column_dimensions['G'].width = 50

    sheet.cell(row=1, column=1).value = "Name"
    sheet.cell(row=1, column=2).value = "Course"
    sheet.cell(row=1, column=3).value = "Semester"
    sheet.cell(row=1, column=4).value = "Form Number"
    sheet.cell(row=1, column=5).value = "Contact Number"
    sheet.cell(row=1, column=6).value = "Email id"
    sheet.cell(row=1, column=7).value = "Address"

def focus1(event):
    course_field.focus_set()

def focus2(event):
    sem_field.focus_set()

def focus3(event):
    form_no_field.focus_set()

def focus4(event):
    contact_no_field.focus_set()

def focus5(event):
    email_id_field.focus_set()

def focus6(event):
    address_field.focus_set()

def clear():
    name_field.delete(0, END)
    course_field.delete(0, END)
    sem_field.delete(0, END)
    form_no_field.delete(0, END)
    contact_no_field.delete(0, END)
    email_id_field.delete(0, END)
    address_field.delete(0, END)

def insert():
    if (name_field.get() == "" and
        course_field.get() == "" and
        sem_field.get() == "" and
        form_no_field.get() == "" and
        contact_no_field.get() == "" and
        email_id_field.get() == "" and
        address_field.get() == ""):
        
        print("empty input")
    
    else:
        current_row = sheet.max_row
        current_column = sheet.max_column

        sheet.cell(row=current_row + 1, column=1).value = name_field.get()
        sheet.cell(row=current_row + 1, column=2).value = course_field.get()
        sheet.cell(row=current_row + 1, column=3).value = sem_field.get()
        sheet.cell(row=current_row + 1, column=4).value = form_no_field.get()
        sheet.cell(row=current_row + 1, column=5).value = contact_no_field.get()
        sheet.cell(row=current_row + 1, column=6).value = email_id_field.get()
        sheet.cell(row=current_row + 1, column=7).value = address_field.get()

        wb.save('C:\\Users\\Admin\\Desktop\\excel.xlsx')

        name_field.focus_set()

        clear()

if __name__ == "__main__":

    root = Tk()

    root.configure(background='light green')

    root.title("registration form")

    root.geometry("500x300")

    excel()

    heading = Label(root, text="Form", bg="light green")

    name = Label(root, text="Name", bg="light green")

    course = Label(root, text="Course", bg="light green")

    sem = Label(root, text="Semester", bg="light green")

    form_no = Label(root, text="Form No.", bg="light green")

    contact_no = Label(root, text="Contact No.", bg="light green")

    email_id = Label(root, text="Email id", bg="light green")

    address = Label(root, text="Address", bg="light green")

    heading.grid(row=0, column=1)
    name.grid(row=1, column=0)
    course.grid(row=2, column=0)
    sem.grid(row=3, column=0)
    form_no.grid(row=4, column=0)
    contact_no.grid(row=5, column=0)
    email_id.grid(row=6, column=0)
    address.grid(row=7, column=0)

    name_field = Entry(root)
    course_field = Entry(root)
    sem_field = Entry(root)
    form_no_field = Entry(root)
    contact_no_field = Entry(root)
    email_id_field = Entry(root)
    address_field = Entry(root)

    name_field.bind("<Return>", focus1)
    course_field.bind("<Return>", focus2)
    sem_field.bind("<Return>", focus3)
    form_no_field.bind("<Return>", focus4)
    contact_no_field.bind("<Return>", focus5)
    email_id_field.bind("<Return>", focus6)

    name_field.grid(row=1, column=1, ipadx="100")
    course_field.grid(row=2, column=1, ipadx="100")
    sem_field.grid(row=3, column=1, ipadx="100")
    form_no_field.grid(row=4, column=1, ipadx="100")
    contact_no_field.grid(row=5, column=1, ipadx="100")
    email_id_field.grid(row=6, column=1, ipadx="100")
    address_field.grid(row=7, column=1, ipadx="100")

    excel()

    submit = Button(root, text="Submit", fg="Black", bg="Red", command=insert)
    submit.grid(row=8, column=1)

    root.mainloop()

#36
from random import randint

rand = randint(1, 100)
counter = 0

while True:
    counter += 1
    num = int(input("Enter values between 1 and 100 (0 exit):"))
    if(num==0):
        print("You canceled the game.")
        break
    elif num < rand:
        print("Enter a Higher Number.")
        continue
    elif num > rand:
        print("Enter a Lower Number.")
        continue
    else:
        print("Randomly selected number {0}!".format(rand))
        print("Your guess number {0}".format(counter))

#37
avorite_fruits = ['apples', 'erics', 'oranges']
print("My favourite fruits {}".format(favorite_fruits))

#38
list=[3.14,2.54,"CPU","WINDOWS 10"]

print(list)

#39
weekdays=["Monday","Tuesday","Wednesday","Thursday","Friday"]
print(weekdays[4])

#40
list=[3,1,2]

list[0]=1
list[1]=1
list[2]=2

print(list)

#41
weekdays=["Monday","Tuesday","Wednesday","Thursday","Friday"]

print("Friday" in weekdays)
print("Saturday" in weekdays)

#42
list1 = [10, 21, 4, 45, 66, 93]

for num in list1:

    if num % 2 == 0:
        print(num, end = " ")

#43
numbers = [3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]
numbers2 = [21,22,23,24,25]
combine = numbers + numbers2

for number in combine:
    if number % 4 == 0:
        print(number)

#44
i = 1
while i <= 12:
    print(" {}. class".format(i))
    i += 1

#45
number = input("enter a number: ")
sum = 0
for numberofdigit in number:
    sum += int(numberofdigit)

print("the sum of the digits of the number:",sum)

#46
number = input("enter an number: ")
multiplication = 1
for digitofnumber in str(number):
    if int(digitofnumber) != 0:
        multiplication *= int(digitofnumber)
print("digits of the number: ",multiplication)

#47
text = input("enter a name: ")

for i in range(10):
    print(text)

#48
text = input("enter a name: ")

i=0
while i<10:
    i+=1
    print(text)

#49
list=[35,48,52,57,68,84]

total = sum(list)
piece = len(list)
print(total/piece)

#50
total=0
while True:
    num = float(input("enter a number: "))
    if num == 0:
        break
    total += num
print("The sum of the numbers: ", total)