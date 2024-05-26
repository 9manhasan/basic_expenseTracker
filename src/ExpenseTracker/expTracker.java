package ExpenseTracker;
import java.util.*;
public class expTracker {
    static Scanner sc = new Scanner(System.in);
    //declaring variable's to use them.
    //Total Budget which will be saved in "Budget.txt"
    public static int Budget = 0;
    //Total expense which will have sum of the budgets of all the expense's.
    public static int TotalExpense = 0;
    //Remaining budget which will get (Budget-TotalExpense);
//    public static int RemainingBudget = 0;

    //max number of expense can be created.
    public static  int MAX_VALUE = 100;
    //expenseName will be used for storing the name of the expense.
    public static String[] expenseName = new String[MAX_VALUE];
    //expenseBudget will be used for storing the budget of the expense.
    public static int[] expenseBudget = new int[MAX_VALUE];
    //num will be the number or position where the designated budget and name will be stored.
    public static int numOfExpense = 0;

    //GetBudget will store budget.
    public static void getBudgetFunc()
    {
        System.out.println("Enter the budget here pls : ");
        Budget = sc.nextInt();
    }

    //getRemainingBudget will show the remaining budget.
    public static int getRemainingBudget(){
        return  Budget - TotalExpense;
    }

    /*Task Menu
    * 1.Add Expense: use to add Expense.
    * 2.Delete Expense: use to delete Expense.
    * 3.View : Lets you see a log of Expense.
    * 4.Menu : will return to previous menu.
    * 5.Close : will close the program.*/
    static void ExpenseMenu()
    {
        int op = 0;
        do
        {
            try
            {
                System.out.println("Type the following number to use that : ");
                //to add an expense.
                System.out.println("1. Add Expense. ");
                //to delete am expense.
                System.out.println("2. Delete Expense ");
                //to let you see log's of.
                System.out.println("3. View ");
                //to exit to the menu.
                System.out.println("4. Menu ");
                //to exit out of the program.
                System.out.println("5. Exit ");
                System.out.println("Enter the option here : ");
                op = sc.nextInt();
                switch (op)
                {
                    case 1:
                        AddExpense();
                        break;
                    case 2:
                        deleteExpense();
                        break;
                    case 3:
                        viewExpenseList();
                        break;
                    case 4:
                        Menufunc();
                        break;
                    case 5:
                        System.out.println("Exiting bye....");
                        System.exit(0);
                }
            }catch (InputMismatchException e)
            {
                System.out.println("Invalid data type.");
                sc.next();
            }
        }while(op != 5);
    }

    //add func will be called to let user add or track expense
    static void AddExpense()
    {
        if(numOfExpense >= MAX_VALUE) {
            System.out.println("Max value reached.");
            return;
        }
        int remainingBudget = getRemainingBudget();
        if(remainingBudget <= 0)
        {
            System.out.println("No more expense is allowed as it has reached its maximum.");
            return;
        }
        sc.nextLine();
            try
        {
            //taking name and input.
            System.out.println("Enter the Expense name here : ");
            String name = sc.nextLine();
            //if name is empty then it will return.
            if(name.isEmpty())
            {
                System.out.println("Name cannot be empty.");
                return;
            }
            //if not empty it will store.
            expenseName[numOfExpense]= name;

            System.out.println("Enter the Expense Budget here : ");
            int expense = sc.nextInt();
            //if it's more than remaining then we will not register it.
            if(expense  > remainingBudget)
            {
                System.out.println("Expense exceeds remaining budget. Cannot add this expense. ");
            } else {
                expenseBudget[numOfExpense] = expense;
                System.out.println("Expense added successfully.");
                TotalExpense += expense;
                numOfExpense++;
            }
        }catch (InputMismatchException e)
        {
            System.out.println("Invalid data type.");
            sc.next();
        }
    }

    //delete expense will use to delete the expense given by the user only one at a time.
    public static void deleteExpense()
    {
        if(numOfExpense == 0)
        {
            System.out.println("No expense to delete.");
            return;
        }
        viewExpenseList();

        int op;
        try
        {
            System.out.println("Enter the number here : ");
            op = sc.nextInt();
            int index = op - 1;
            if(index < 0 || index >= numOfExpense)
            {
                System.out.println("Invalid expense number. Please try again.");
                return;
            }
            //subtracting the budget of that particular expense.
            TotalExpense -= expenseBudget[index];
            for (int i = index; i < numOfExpense - 1; i++) {
                expenseBudget[i] = expenseBudget[i + 1];
                expenseName[i] = expenseName[i + 1];
            }
            expenseBudget[numOfExpense - 1] = 0;
            expenseName[numOfExpense - 1] = null;
            numOfExpense--;
            System.out.println("Expense deleted.");
        }catch (InputMismatchException e)
        {
            System.out.println("Invalid data type entered.");
            sc.next();
        }
    }

    //will show the list to user.
    public static void viewExpenseList()
    {
        if(numOfExpense == 0) {
            System.out.println("No Expense is added. ");
            return;
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < numOfExpense; i++) {
            System.out.println( (i+1) + "|Expense Name : " + expenseName[i] + " |Budget : " + expenseBudget[i] +" inr |");
        }
        System.out.println("--------------------------------------");
    }


    /*Menu which will show these four options :
    * 1.Budget.
    * 2.Remaining Budget.
    * 3.Task.
    * 4.Exit. */
    public static void Menufunc()
    {
        int op = 0;
        do
        {
            try
            {
                System.out.println("Type the following number to use that : ");
                //to show the budget.
                System.out.println("1. Budget. ");
                //to get remaining expense.
                System.out.println("2. Remaining Budget. ");
                //to use task's menu.
                System.out.println("3. Expense Section. ");
                //to exit the menu and close the program.
                System.out.println("4. Exit. ");
                System.out.println("Enter the option here : ");
                op = sc.nextInt();
                switch(op)
                {
                    case 1:
                        System.out.println(Budget);
                        break;
                    case 2:
                        System.out.println(getRemainingBudget() + " inr is your remaining budget.");
                        break;
                    case 3 :
                        ExpenseMenu();
                        break;
                    case 4 :
                        System.out.println("Exiting...bye");
                        break;
                    default:
                        System.out.println("Enter op from the menu only.");
                        break;
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input, Try again.");
                sc.next();
            }
        }while(op != 4);
    }


    //main func()
    public static void main(String[] args)
    {
        System.out.println("America ya :D  ");
        while(Budget <= 0)
        {
            try{
                getBudgetFunc();
                if(Budget <= 0)
                {
                    System.out.println("Budget must be greater than 0. Try again.");
                }
            }catch (InputMismatchException e)
            {
                System.out.println("invalid type enter, try again.");
                sc.next();
            }
        }
        Menufunc();
    }

}
