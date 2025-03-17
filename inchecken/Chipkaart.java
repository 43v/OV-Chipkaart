package inchecken;

public class Chipkaart extends Main
{
    private boolean check;
    private int saldo;
    private String owner;

    public Chipkaart(String owner, boolean check, int saldo)
    {
	this.owner = owner;
	this.check = check;
	this.saldo = saldo;

    }

public void PrintInfo() {
    
    System.out.println(owner );
    System.out.println(check );
    System.out.println(saldo);
}
}