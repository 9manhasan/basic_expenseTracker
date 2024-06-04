package ExpTrckrOOPs;
class Expense
{
	private String name;
	private int budget;
	public Expense(String n, int b)
	{
		this.name = n;
		this.budget = b;
	}
	public String getName(){
		return name;
	}
	public int getBudget()
	{
		return budget;
	}
}
