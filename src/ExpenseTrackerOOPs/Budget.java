package ExpenseTrackerOOPs;

import java.util.Scanner;

public class Budget {
    ExpenseManagement expM = new ExpenseManagement();
    Scanner sc = new Scanner(System.in);
    int budget;
    int remainBudget;
     public Budget()
     {
         this.budget = 0;
         this.remainBudget = 0;
     }
     // will use to store budget.
     void getBudget()
     {
         System.out.println("Enter the budget here pls : ");
         budget = sc.nextInt();
     }
     int getRemainBudget()
     {
         return remainBudget;
     }
     void deductExp(int amount)
     {
          remainBudget -= amount;
     }
    void addExpense(int amount) {
        remainBudget += amount;
    }
}
