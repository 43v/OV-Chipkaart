package inchecken;

public class Chipkaart
{
    int balance;
    String owner;

    public Chipkaart(String owner, int balance)
    {
	this.owner = owner;
	this.balance = balance;
    }

    public void PrintInfo()
    {
	System.out.println(owner);
	System.out.println(balance);
    }
}