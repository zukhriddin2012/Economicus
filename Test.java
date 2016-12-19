import java.util.*;

public class Test {
	
	String check1;
	String check2;
	int ans;
	int a;
	static Scanner ob = new Scanner(System.in);
	
	void foundtest(){
		int answer=0, i;
	String[] foundatans = {"c","b", "a", "d","a"}; 
	
	String[] foundat = {"Economics is the study of\n"
			+ "A)	production technology\n"
			+ "B)	consumption decisions\n"
			+ "C)	how society decides what, how, and for whom to produce\n"
			+ "D)	the best way to run society",
			"The opportunity cost of a good is\n"
			+ "A)	the time lost in finding it\n"
			+ "B)	the quantity of other goods sacrificed to get another unit of that good\n"
			+ "C)	the expenditure on the good\n"
			+ "D)	the loss of interest in using savings",
			"A command economy decides resource allocation by government planning\n"
			+ "A)	TRUE\n"
			+ "B)	FALSE", 
			"In a free market __________ ___________\n"
			+ "A)	governments intervene\n"
			+ "B)	governments plan production\n"
			+ "C)	governments interfere\n"
			+ "D)	prices adjust to reconcile scarcity and desires",
			"In the mixed economy\n"
			+ "A)	economic problems are solved by the government and market\n"
			+ "B)	economic decisions are made by the private sector and free market\n"
			+ "C)	economic allocation is achieved by the invisible hand\n"
			+ "D)	economic questions are solved by government departments"};
	
	for (i=0; i<foundat.length; i++){
		
		System.out.println("\n"+(++i)+") "+foundat[--i]);
		check1 = ob.nextLine();

		if(check1.equals(foundatans[i]))
				answer++;}
		

			System.out.println("Correct answers: "+answer+"\nOut of: "+i);
			System.out.println("\npress ENTER to go BACK");
			ob.nextLine();
			check1 = null;
			return;
		
	
	}
	
	void test(){
		
		String[] op = {"a", "b", "a", "a", "c"};
		String[] tests = {"What is Economics?\na) social science;\nb) money\nc) study of quantity;", 
				"Economics is about money?"
				+ "\na) yes\nb) no", 
				"Which of the following statements describe features of a market economy?\n"
						+ "a. The invisible hand harnesses the power of self-interest for the good of society.\n"
						+ "b. A central authority makes decisions about production and consumption.\n"
						+ "c. The pursuit of one’s own self-interest sometimes results in market failure.\n"
						+ "d. Growth in a market economy is steady and without fluctuations.",
				"All economic activities involve individual choice.\n"
								+ "a. true\nb. false", 
				"Phenomenon of scarcity stems from the fact that\n\na. Most economies' production \n"
						+ "methods are not very good\n\nb. In most economies, wealthy people\nconsume disproportionate quantities\n"
						+ "of goods and services\n\nc. Resources are limited", }; 
		int i;
		
		for (i=0; i<tests.length; i++){
			
			System.out.println("\n"+(++i)+") "+tests[--i]);
			
			check2 = ob.nextLine();
			
				if(check2.equals(op[i]))
					ans++;}
																																																																																																																																		
			
		
			

			System.out.println("Correct answers: "+ans+"\nOut of: "+i);
			System.out.println("\npress ENTER to go BACK");
			ob.nextLine();
			check2=null;
			return;
	}
	
	
}
