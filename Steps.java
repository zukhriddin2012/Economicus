import java.util.*;
public class Steps {
	static Scanner ob = new Scanner(System.in);
	static Introduction ob1 = new Introduction();
	
	String enter;
	
	void Step1(){
		
		System.out.println("Why are some countries rich and some countries poor? \n"
				+ "What happened in 2008 to cause the worst recession since the 1930s?");
		System.out.println("\nPress ENTER to Continue...");
		
		
		enter = ob.nextLine();
		
		
		if(enter.equals("")){
		System.out.println("Economics is a discipline that can help us answer these questions. \n"
				+ "Economics can actually be defined a few different ways: it’s the study of \n"
				+ "scarcity, the study of how people use resources, or the study of decision-making.");
		
		System.out.println("\nPress ENTER");
		ob.nextLine();
				
		System.out.println("Many people hear the word \"economics\" and think it is all about money. \n"
				+ "Economics is not just about money. It is about weighing different choices or \n"
				+ "alternatives. Some of those important choices involve money, but most do not. \n");
		
		System.out.println("...");
		ob.nextLine();
		
		System.out.println("Most of your daily, monthly, or life choices have nothing to do with money, \n"
				+ "yet they are still the subject of economics. For example, your decisions about \n"
				+ "whether it should be you or your roommate who should be the one to clean up or do \n"
				+ "the dishes, whether you should spend an hour a week volunteering for a worthy \n");
		
		System.out.println("...");
		ob.nextLine();
		
		System.out.println("charity or send them a little money via your cell phone, or whether you should take \n"
				+ "a job so you can help support your siblings or parents or save for your future are all \n"
				+ "economic decisions. In many cases, money is merely a helpful tool or just a veil, \n"
				+ "standing in for a partial way to evaluate some of the goals you really care about \n"
				+ "and how you make choices about those goals. ");
		
		System.out.println("\nENTER to go back");
		
		ob.nextLine();
				
		ob1.steps();
		}
		
	}
	
	void Step2(){
		System.out.println("Principles of Economics.");
		System.out.println("\nPress ENTER to continue...");
		
		ob.nextLine();
		System.out.println("The Principles of Individual Choice\n1. People must make choices because resources are scarce.\n"
				+ "2. The opportunity cost of an item—what you must give up \n"
				+ "in order to get it—is its true cost.\n"
				+ "3. “How much” decisions require making trade-offs at the \n"
				+ "margin: comparing the costs and benefits of doing a little\n"
				+ "bit more of an activity versus doing a little bit less.\n"
				+ "4. People usually respond to incentives, exploiting\n"
				+ "opportunities to make themselves better off.\n\n5. Next page");
		int choice;
		choice = ob.nextInt();
		
		if(choice == 1){
		System.out.println("Principle #1: Choices Are Necessary \nBecause Resources Are Scarce");
		System.out.println("...");
		
		ob.nextLine();
		
		System.out.println("\nYou can’t always get what you want.");
		System.out.println("Everyone would like to have a beautiful house in a great location \n"
				+ "(and have help with the housecleaning), a new car or two, and a nice vacation \n"
				+ "in a fancy hotel.");
		System.out.println("...");
		
		ob.nextLine();
		
		System.out.println("But even in a rich country like\n"
				+ "the United States, not many families can afford all that. So they must make\n"
				+ "choices—whether to go to Disney World this year or buy a better car, whether\n"
				+ "to make do with a small backyard or accept a longer commute in order to live\n"
				+ "where land is cheaper.");
		
		if(choice == 5){
			System.out.println("The Principles of the\n"
					+ "Interaction of Individual Choices\n"
					+ "5. There are gains from trade.\n"
					+ "6. Because people respond to incentives, markets\n"
					+ "move toward equilibrium.\n"
					+ "7. Resources should be used as efficiently as possible\n"
					+ "to achieve society’s goals.\n"
					+ "8. Because people usually exploit gains from trade,\n"
					+ "markets usually lead to efficiency.\n"
					+ "9. When markets don’t achieve efficiency, government\n"
					+ "intervention can improve society’s welfare.");
			
		}
	}
		}
	
}
