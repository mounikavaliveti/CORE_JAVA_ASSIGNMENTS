
public class ChocoCandy extends DessertItem {
	float quantity;
	public ChocoCandy(float q)
	{
		quantity=q;
	}

	@Override
	public float getcost() {
		float cost = quantity*2f*60;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}

