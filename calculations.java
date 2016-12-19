import java.util.Scanner;

public class calculations {
	Scanner o = new Scanner(System.in);
	
	
	float P1, P2, Q1, Q2, E, CD, CP;
	
	void calc(){
		System.out.println("1) Elasticity\n2) Average Fixed Cost\n\n0 to go BACK");
		int ch;
		ch = o.nextInt();
		switch(ch){
		case 1: 
			elast();
			break;
		case 2:
			TFC();
			break;
		case 0:
			return;
			}
		}
	void elast(){
	System.out.println("Welcome to Price Elasticity");
	
	System.out.print("\nPlease, enter the intial price: ");
	P1 = o.nextFloat();
	
	System.out.print("\nEnter the current price: ");
	P2 = o.nextFloat();
	
	System.out.print("\nThe Initial quantity demanded: ");
	Q1 = o.nextFloat();
	
	System.out.print("\nThe current quantity demanded: ");
	Q2 = o.nextFloat();

	CD= (Q2-Q1)/(Q1+Q2)/2*100;
	CP= (P2 - P1)/(P1+P2)/2*100;
	E = (CD/CP);
	
	if (E<0){
	System.out.println("\nPrice elasticity is: "+E*(-1));}
	
	else{
	System.out.println("\nPrice elasticity is: "+E);}
	
	if (E < 0)
		{E = E*(-1);}
			
		
	if (E >= 1.02)
			System.out.println("\nDemand is Elastic!");
	else if (E <= 0.98)
			System.out.println("\nDemand is Inelastic!");
	else if (E==1)
			System.out.println("\nDemand is perfectrly Unit-elastic1");
	else
			System.out.println("\nDemand is almost Unit-elastic!");
	
	System.out.println("\npress ENTER to go BACK ");
	
	o.nextLine();
	o.nextLine();
	calc();
	
}
	void TFC(){
		int inq, tfc, unt;
		
		System.out.println("Initial Quantity: ");
		inq = o.nextInt();
		System.out.println("Total Fixed Cost: ");
		tfc = o.nextInt();
		System.out.println("Until which Quantity: ");	
		try{
		unt = o.nextInt();
		
		System.out.printf("%s|\t%"
				+ "s|\t%s\n__________________________________________________________\n", 
				"Quantity", "Total Fixed Cost", "Average Fixed Cost");

		for(int i=inq ; i<=unt; i++)
			System.out.println(i+"\t|\t"+"$ "+tfc+"\t\t|\t"+"$ "+(double) tfc/i);
		System.out.println("__________________________________________________________");
		System.out.println("\npress ENTER to go BACK");
		
		o.nextLine();
		o.nextLine();
		calc();
		}
		
		catch(ArithmeticException e){
			System.out.println("\nWe cannot divide anyhing by 0! Remember it, please!");
			System.out.println("\nPress ENTER to restart.");
			o.nextLine();
			o.nextLine();
			TFC();
			
		}
		}

	}