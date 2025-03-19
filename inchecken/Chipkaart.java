package inchecken;

public class Chipkaart extends Main
{
    private boolean check;
    private int balance;
    private String owner;
    Checkpaal qq = new Checkpaal();

    public Chipkaart(String owner, boolean check, int balance)
    {
	this.owner = owner;
	this.check = check;
	this.balance = balance;

    }

    public void PrintInfo()
    {

	System.out.println(owner);
	System.out.println(check);
	System.out.println(balance);
    }

    public void Checker()
    {
	if (balance <= qq.getTarif())
	{
	    this.check = true;
	}
    }
}