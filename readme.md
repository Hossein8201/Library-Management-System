# Library Management System

**Name**: Hossein Tatar  
**Student Number**: 40133014

## Project Overview

This project is a simple **Library Management System** that allows users to manage books and members, as well as handle book borrowing and returning. The project is implemented using Object-Oriented Programming (OOP) principles in Java.

### Features

1. **Add Books to the Library**:
    - Each book has a unique ID (IDs must be checked for uniqueness).
    - A minimum of 5 books can be added to the library.

2. **Add Members to the Library**:
    - Members can be added with a unique member ID.
    - A minimum of 2 members can be added.

3. **Borrow and Return Books**:
    - Each member can borrow up to 3 books at a time.
    - The system checks book availability before lending (books already borrowed cannot be lent again until returned).
    - Members can return borrowed books.

4. **Print Information**:
    - The system prints information about all books, including their availability status.
    - It also prints member information and the list of borrowed books.

### Classes

- `Book`: Represents a book with attributes such as ID, title, author, and availability status.
- `Member`: Represents a library member with attributes like ID, name, and the list of borrowed books.
- `Library`: Manages the collection of books and members. It handles adding books and members, borrowing and returning books, and printing library information.

### How to Run the Project

Run the `Main` class to simulate the library's operations. It includes adding books and members, borrowing and returning books, and printing library details.

### Additional Features

- Implements OOP principles (classes, encapsulation, etc.).
- Exception handling using `throw` and `catch` to manage errors like duplicate IDs.
- Utilizes `Varargs` to allow variable numbers of books to be passed to methods like borrowing.

### Student Information

- **Name**: Hossein Tatar
- **Student Number**: 40133014
