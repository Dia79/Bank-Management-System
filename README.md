# Bank Management System

This project is a comprehensive Java-based Bank Management System that allows users to perform various banking transactions such as deposits, withdrawals, balance inquiries, and more. The system features a graphical user interface (GUI) created using Java Swing and connects to a backend database to manage user information and transactions.

## Table of Contents

- [Features](##Features)
- [Requirements](#requirements)
- [Setup](#setup)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Screenshots](#screenshots)
- [License](#license)

## Features

- User Registration and Login
- Deposit Money
- Withdraw Money
- Fast Cash Withdrawal
- Balance Inquiry
- Mini Statement
- PIN Change

## Requirements

- Java Development Kit (JDK)
- MySQL Database
- JDBC Driver for MySQL

## Setup

1. **Clone the Repository:**
```bash
 git clone https://github.com/yourusername/bank-management-system.git
  cd bank-management-system
```
2. **Database Setup:**
- Install MySQL and create a database named `bank_management`.

3. **Configure Database Connection:**
- Update the `con.java` file with your MySQL database connection details.

4. **Compile and Run:**
```bash
javac bank/management/system/*.java
java bank.management.system.Login
 ```

## Usage

1. **Login:**
- Enter your card number and PIN to log in.

2. **Main Menu:**
- Choose from various options like Deposit, Withdrawal, Fast Cash, Balance Inquiry, Mini Statement, and PIN Change.

3. **Deposit:**
- Enter the amount to deposit and confirm.

4. **Withdrawal:**
- Enter the amount to withdraw and confirm.

5. **Fast Cash:**
- Select a predefined amount for quick withdrawal.
6. **Balance Inquiry:**
- View the current balance in your account.
7. **Mini Statement:**
- View the last few transactions.
8. **PIN Change:**
- Change your account PIN.
## Code Overview
### Main Classes
- **Login.java:**
- Manages user login.
- Validates card number and PIN.

- **Signup.java:**
- Handles new user registration.
- **Deposit.java:**
- Allows users to deposit money into their account.
- **Withdrawl.java:**
- Facilitates money withdrawal from the user's account.
- **FastCash.java:**
 - Provides options for quick cash withdrawal.
- **BalanceEnquiry.java:**
 - Displays the user's current account balance.
 - **Mini.java:**
- Shows a mini statement with recent transactions.
- **Pin.java:**
- Allows users to change their PIN.
### Database Connection
- **con.java:**
- Manages the connection to the MySQL database using JDBC.
### Data Structures
- The project primarily uses standard Java collections like `ArrayList` for handling transaction data and `ResultSet` for interacting with the database.

## Screenshots
### Signin Signup Page

<img src="Screenshot/Login.png" alt="Login.jpg" width="600" height="350" >

### Signup Form1

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="540" >

### Signup Form2

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="540" >

### Signup Form3

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="540" >

### New Card No.

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

### Transaction Screen

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

### Cash Deposit

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

### Cash Withdrawal

<img src="Screenshot/mini_statement.png" alt="mini.png" width="600" height="400" >

### Fast Cash Withdrawal

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

### Change PIN

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

### Balance Enquiry

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

### Mini Statement

<img src="Screenshot/signup_form1.png" alt="signup_form1.png" width="600" height="400" >

## License
This project is licensed under the MIT License. See the [LICENSE](https://choosealicense.com/licenses/mit/) file for details.
