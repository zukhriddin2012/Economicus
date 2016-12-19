import java.util.*;

public class searchClass {
	int psf = 0;
	
	
	String[] all= {"economy", "economics", "market economy", "invisible hand", "microeconomics", "market failure", "recession", "macroeconmics"};
	String[] data = {"An economy is a system for\n"
			+ "coordinating society’s productive\n"
			+ "activities.", "Economics is the social science\n"
					+ "that studies the production,\n"
					+ "distribution, and consumption of\n"
					+ "goods and services."};
	boolean fnd = false;
	int ind = 0;
	void search(){
		String a ;
		Introduction intr = new Introduction();
		Scanner ob = new Scanner(System.in);
		String arr;
		System.out.print("\nSearch: ");
		arr = ob.nextLine();
		psf=1;
		for(int i=0; i<all.length; i++){
		if(all[i].equalsIgnoreCase(arr) || all[i].contains(arr)){
			fnd = true;
			ind = i;
			break;
		}
		}
		if(fnd){
		System.out.println(data[ind]);
		fnd=false;}
			else
				System.out.println("Sorry, it cannot be found.");
			
			System.out.println("\npress ENTER to go BACK");
			System.out.println("Or 1 to search AGAIN");
			
			a = ob.nextLine();
			if(a.equals("1")){
				search();
			}
			else
				intr.IntroCh();
			
	}
}
