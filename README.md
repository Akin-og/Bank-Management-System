# Bank-Management-System

## Description

This Java program implements a **Bank Account Management System** with basic functionalities such as depositing money, withdrawing funds, and viewing the current account balance. It is designed for a single account holder and uses a command-line interface for user interaction.

## Features

- **Create Account**:  
  Generate a random account number and initialize an account with a name and balance.

- **Deposit Funds**:  
  Add money to the account and update the balance.

- **Withdraw Funds**:  
  Deduct money from the account if sufficient funds are available.

- **View Account Details**:  
  Display account information, including username, account number, and balance.

. **Interact with the Menu**:  
   Choose options from the main menu:
   - Press `1` to deposit money.
   - Press `2` to withdraw money.
   - Press `3` to view account details.
   - Press `4` to exit the program.

 **Provide Input**:  
   Enter the required information, such as deposit or withdrawal amounts, when prompted.

## Class Details

### `bank`
Represents a bank account with methods to manage account information and transactions.  
**Attributes**:
- `name`: Account holder's name.
- `AcctNum`: A randomly generated unique account number.
- `balance`: The current balance in the account.

**Methods**:
- `setBalance(long balance)`: Update the account balance.
- `setName(String name)`: Update the account holder's name.
- `setAcct(long AcctNum)`: Assign a unique account number.
- `getName()`, `getBalance()`, `getAcctNum()`: Retrieve account details.
- `display()`: Print account details to the console.

**Main Menu**:
The `main` method provides an interactive loop allowing users to perform account-related operations.
