package inchecken;

public class Main
{
    public static void main(String[] args)
    {
	Chipkaart pp = new Chipkaart("John", 10);
	Checkpaal qq = new Checkpaal();

	System.out.println("Card info:");
	pp.PrintInfo();

	qq.incheck(pp);

    }
}