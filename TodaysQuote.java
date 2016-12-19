import java.util.*;
public class TodaysQuote {
	Scanner ob = new Scanner(System.in);
String[] quote = {" \"Economics is the science which studies human behavior as a \n"
		+ "relationship between given ends and scarce means which have alternative uses.\"", 
		"Political Economy or Economics is a study of mankind in the ordinary business \n"
		+ "of life; it examines that part of individual and social action which is most \n"
		+ "closely connected with the attainment and with the use of the material requisites \n"
		+ "of wellbeing. (Alfred Marshall)", 
		"\"There are 10^11 stars in the galaxy. That used to be a huge number. But it’s only \n"
		+ "100 billion. It’s less than the national deficit. We used to call them astronomical \n"
		+ "numbers. Now we should call them economical numbers.\" Richard Feynman, scientist (1918–88)",
		"Competition is not only the basis of protection to the \nconsumer, but is the incentive to progress.- Herbert Hoover"
		};
	void quote(){
		
		System.out.println(quote[(int)((Math.random()*5)-1)]);
		System.out.println("\npress ENTER to go BACK");
		
		ob.nextLine();
		return;
	}
}