package inchecken; 

public class Main
{

    public static void main(String[] args)
    {
	System.out.println("This is your card information");
	Chipkaart pp = new Chipkaart("John",false, 5);
	
	pp.PrintInfo();
    }

}
