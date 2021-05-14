
public class Bank {

	public int cash()
		{
			CurrentAccount ca = new CurrentAccount();
			int caCash=ca.cash();
			SavingsAccount sa = new SavingsAccount();
			int saCash=sa.cash();
			int fxd=2000,cash=20000;
			int totalcash=saCash+caCash;
			return totalcash;
		}
	}


