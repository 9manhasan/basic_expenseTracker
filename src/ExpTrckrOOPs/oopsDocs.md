`ExpenseTracker` application to use ArrayLists instead of arrays for managing expenses. This will make it more flexible and easier to handle dynamic data.

### ExpenseTracker Class

#### Attributes
1. `budget` (int): Stores the total budget.
2. `expenses` (ArrayList of Expense objects): List to store Expense objects.

#### Methods
1. `main(String[] args)`: Entry point of the program. Initializes the expense tracker and manages user interaction.
2. `getBudgetFunc()`: Prompts the user to input the budget.
3. `getRemainingBudget()`: Calculates and returns the remaining budget.
4. `Menufunc()`: Displays the main menu and handles user input for overall expense tracker operations.
5. `ExpenseMenu()`: Displays the expense menu and handles user input for expense-related operations.
6. `addExpense()`: Adds a new expense with user-provided name and budget.
7. `deleteExpense()`: Deletes an existing expense based on user input.
8. `viewExpenseList()`: Displays the list of added expenses.

### Expense Class

#### Attributes
1. `name` (String): Name of the expense.
2. `budget` (int): Budget allocated for the expense.

#### Methods
1. Constructor: Initializes an Expense object with the provided name and budget.
2. `getName()`: Returns the name of the expense.
3. `getBudget()`: Returns the budget allocated for the expense.

By using ArrayLists, we can simplify the management of expenses and handle dynamic data more efficiently.