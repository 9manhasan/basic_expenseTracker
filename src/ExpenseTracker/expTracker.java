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
    public static int RemainingBudget = 0;


    //GetBudget will store budget.
    public static void getBudgetFunc()
    {
        System.out.println("Enter the budget here pls : ");
        Budget = sc.nextInt();
    }

    //getRemainingBudget will show the remaining budget.
    public static int getRemainingBudget(){
        return Budget - TotalExpense;
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

                System.out.println("5. Exit ");
                System.out.println("Enter the option here : ");
                op = sc.nextInt();
                switch (op)
                {
                    case 1:
                        System.out.println("under construction.");
                        break;
                    case 2:
                        System.out.println("under construction.");
                        break;
                    case 3:
                        System.out.println("under construction.");
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
                        System.out.println(getRemainingBudget());
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
