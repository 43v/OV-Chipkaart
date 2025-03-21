package inchecken;

public class Checkpaal
{

    private int tarif;
    Chipkaart checkedCard;

    public Checkpaal()
    {

	this.tarif = 5;
    }

    public void incheck(Chipkaart card)
    {
	if (card.balance >= tarif)
	{
	    card.balance = card.balance - tarif;
	    checkedCard = card;
	    System.out.println("Checked in");
	}
	else
	{
	    System.out.println("Not enough money!!!!");
	}
    }
}