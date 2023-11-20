
(2). Create a list and perform the following methods in python: 1. Insert 2. Remove 3.append 4.len 5.pop 6.clear
# Creating a list
my_list = [1, 2, 3, 4, 5]

# 1. Insert
my_list.insert(2, 10)  # Insert 10 at index 2
print(my_list)

# 2. Remove
my_list.remove(3)  # Remove the element 3
print(my_list)

# 3. Append
my_list.append(6)  # Append 6 to the end of the list
print(my_list)

# 4. Len
length = len(my_list)  # Get the length of the list
print("Length:", length)

# 5. Pop
popped_element = my_list.pop()  # Remove and return the last element
print("Popped Element:", popped_element)
print(my_list)

# 6. Clear
my_list.clear()  # Clear all elements from the list
print(my_list)

3. Create a tuple and perform the following methods in python: 1. Additions() 2, len 3. Check for the items in tuple 4. Access items
# Creating a tuple
my_tuple = (1, 2, 3, 4, 5)

# 1. Addition (Concatenation)
new_tuple = my_tuple + (6, 7)  # Concatenate tuples
print("Concatenated Tuple:", new_tuple)

# 2. Len
length = len(my_tuple)  # Get the length of the tuple
print("Length:", length)

# 3. Check for items in tuple
item_to_check = 3
if item_to_check in my_tuple:
    print(f"{item_to_check} is in the tuple.")
else:
    print(f"{item_to_check} is not in the tuple.")

# 4. Access items
first_item = my_tuple[0]  # Access the first element
last_item = my_tuple[-1]  # Access the last element
print("First Item:", first_item)
print("Last Item:", last_item)

4. Create a dict and perform the following methods in python: 1.print dictionary items 2.access items 3. Use get() 4.change values 5.finding number of items
# Creating a dictionary
my_dict = {'name': 'John', 'age': 25, 'city': 'New York'}

# 1. Print dictionary items
print("Dictionary Items:", my_dict)

# 2. Access items
name_value = my_dict['name']  # Accessing value using key
print("Name:", name_value)

# 3. Use get()
age_value = my_dict.get('age')  # Using get() to access value
print("Age:", age_value)

# 4. Change values
my_dict['age'] = 26  # Changing the value of 'age'
print("Updated Dictionary:", my_dict)

# 5. Finding the number of items
num_items = len(my_dict)  # Finding the number of key-value pairs
print("Number of Items:", num_items)

5. Create a menu and perform the following methods in python: 1. Addition 2. Substraction 3. Multiplication 4.division
Accept user input and perform actions accordingly, use functions with arguments 
def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y != 0:
        return x / y
    else:
        return "Cannot divide by zero."

# Menu
while True:
    print("\nMenu:")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Exit")

    choice = input("Enter your choice (1-5): ")

    if choice == '5':
        print("Exiting the program.")
        break

    try:
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))
    except ValueError:
        print("Invalid input. Please enter valid numbers.")
        continue

    if choice == '1':
        result = add(num1, num2)
    elif choice == '2':
        result = subtract(num1, num2)
    elif choice == '3':
        result = multiply(num1, num2)
    elif choice == '4':
        result = divide(num1, num2)
    else:
        print("Invalid choice. Please enter a number between 1 and 5.")
        continue

    print("Result:", result)


6. Write a program to check if a number is positive or negative using if else
# Input: Taking a number from the user
number = float(input("Enter a number: "))

# Checking if the number is positive, negative, or zero
if number > 0:
    print("The number is positive.")
elif number < 0:
    print("The number is negative.")
else:
    print("The number is zero.")

7. Write a program for filter() to filter only even numbers from a given list
# Function to check if a number is even
def is_even(num):
    return num % 2 == 0

# Given list of numbers
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Using filter() to filter only even numbers
even_numbers = list(filter(is_even, numbers))

# Displaying the result
print("Original List:", numbers)
print("Even Numbers:", even_numbers)

8. Write a program to print date time for today and now
# Importing the datetime module
from datetime import datetime

# Getting the current date and time for today
today_date = datetime.now().date()
print("Today's Date:", today_date)

# Getting the current date and time for now
current_datetime = datetime.now()
print("Current Date and Time:", current_datetime)

9. Write a program to add some days to your present date and print the added date
# Importing the datetime module
from datetime import datetime, timedelta

# Getting the present date
present_date = datetime.now().date()
print("Present Date:", present_date)

# Adding days to the present date
days_to_add = 5  # You can change this value to add a different number of days
new_date = present_date + timedelta(days=days_to_add)

# Printing the added date
print(f"Date after adding {days_to_add} days:", new_date)
