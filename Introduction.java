import java.text.SimpleDateFormat;
import java.util.*;

public class Introduction {
	
	static Scanner ob = new Scanner(System.in);
	Steps st = new Steps();
	static int choice = 0;
	TodaysQuote obj1 = new TodaysQuote();
	Test test = new Test();
	calculations calc = new calculations();
	
	String name, publisher, author;
	
	/* These Strings are for my Administer's profile, I used arrays, because it is easier to add something with them and I used micro for five of them 
	 * that means I am using these arrays for Microeconomics books
	 */
	String[] microauthorarr = {"E. F. Schumacher", "B. Douglas Bernheim", "N. Gregory Mankiw"};
	String[] microname = {"Principles of Microeconomics, 7th Edition", "Microeconomics (McGraw-Hill Economics) 2nd Edition",
			"Small Is Beautiful: Eco nomics as if People Mattered"};
	String[] micropub = {"Cengage Learning", "Business And Economics", "Blond & Briggs Ltd."};
	int[] micpages = {495, 800, 352};
	int[] micyears = {2015, 2013, 1973};
	String[] microar = {"Principles of Microeconomics", "Microeconomics", "Small Is Beautiful"};
	
	
	
	int year, pages;
	
	// ppp is for Admin user, whenever the Admin enters his profile ppp will change its value and plays the role of an indicator
	int ppp = 0;
	
	int en = 0;
	searchClass se = new searchClass();
	calculations cal = new calculations();
	
	void IntroSt(){
		
		String patternDate= "dd/M/yyyy";
		String patternTime= "HH:mm";
	
		SimpleDateFormat sr = new SimpleDateFormat(patternDate);
		SimpleDateFormat sp = new SimpleDateFormat(patternTime);
		
		String date = sr.format(new Date());
		String time = sp.format(new Date());
		
		if(se.psf==1){
			do{
				IntroCh();
			}while(ppp==999);
			se.psf=0;
		}
		else{
		System.out.println("Date: "+date+"\nTime: "+time);
		System.out.println("\nWelcome!\nThis is Economicus!");
		System.out.println("Please, choose the section:");
		do{
			IntroCh();}
		while(en==0);
		}}
		
		void IntroCh(){
		while(true){System.out.println("\n1) Start Learning!\n2) Test\n3) Quote\n4) Program's goal\n5) Instruction\n6) Books\n7) Search\n8) Calculations\n9) Admin");
		
		 do
		    {
		    try {choice = ob.nextInt();
			
		
		while(choice>9 || choice<1){
			System.out.println("Type the proper number!");
			choice = ob.nextInt();
		}
		
		switch(choice){
		case 1:
			start();
			break;
		case 4:
			progGoal();
			break;
		case 5:
			instr();
			break;
		case 3:
			obj1.quote();
			break;
		case 2:
			IntroTest();
			break;
		case 6:
			books();
			break;
		case 9:
			Admin();
			break;
		case 7:
			se.search();
			break;
		case 8:
			cal.calc();
			break;
		}}
	    catch(InputMismatchException e)
	    {System.out.println("Enter numbers, please!");
	    ob.next();}
	    }while(choice>1 || choice<9);}
		
		}	
	
		void Admin(){
			Scanner ob = new Scanner(System.in);
			final String pass;
			String check;
			pass = "zukhriddin";
			System.out.print("Password: ");
			check = ob.nextLine();
			if(pass.equals(check)){
				
				this.ppp = 1;
				IntroCh();}
			else{
				System.out.println("Wrong password!");
				System.out.println("Press Enter to go BACK");
				
				ob.nextLine();
				
				IntroCh();}
				
		}
	void start(){
		
		System.out.println("1) New User\n2) Old User\n\n0 to go BACK");
		
		
		int ch;
		
		
		try{
			ch = ob.nextInt();
		
		
		
		while(ch>2 || ch<0){
			System.out.println("Please, type the proper number!");
			ch=ob.nextInt();}
		
		switch(ch){
		case 1:
			newUser();
			break;
		case 2:
			oldUser();
			break;
		case 0:
			IntroCh();
			break;			
		}}
		catch(InputMismatchException e){
			System.out.println("Type a number, please!");
			start();
			
		}
	}
	void newUser(){
		
		System.out.println("If you are new here, this program is written so as to improve your knowledge\n"
				+ "of Economics. It covers the most useful information and facts about the sphere.\n"
				+ "\nWe present our learning process in steps, to choose a step you want to go press ENTER");
		// The inputs below provide us with an opportunity to make the user more active during the process of learning, because whenever they press 
		// ENTER program will go to the next page or step.
		ob.nextLine();
		ob.nextLine();
		
		steps();
		

	
	}
	
	void oldUser(){
		System.out.println("Welcome again! If you have been using this program for sometime, just choose\n"
				+ "the step you have come, (we are sorry that we haven't created and opportunity for you to\n"
				+ "sign up):");
		steps();
	}
	
	void progGoal(){
		String enter;
		int a;
		String[] goals = {"1st goal: To make the user aware of the basic principles of Economics;"
				, "2nd goal: To make the learning process more productive;"
				, "3rd goal: To provide tools to calculate easily and understand the Mathematicspart of it;", 
				"4th goal: To provide tests at the end of each step."};
		
		for(int i=0; i<goals.length; )
			{enter = ob.nextLine();
			if(enter.equals(""))
			System.out.println(goals[i]);
			if(i==0)
				System.out.println("\nPress ENTER to continue...");
			i++;
			}
		
		System.out.println("\n\n0 to BACK");
		a = ob.nextInt();
		while(a>0 || a<0){
			System.out.println("Please, type the proper number!");
			a=ob.nextInt();}
		
		if(a==0){
			IntroCh();
		}
	}
	
	void steps(){
		int choice;
		System.out.println("Step 1: What is Economics?;\nStep 2: Principles of Economics;");
		choice = ob.nextInt();
		
		while(choice>2 || choice<0){
			System.out.println("Please, type the proper number!");
			choice=ob.nextInt();}
		
		if (choice==1)
			st.Step1();
		else if(choice==2)
			st.Step2();
		else if(choice==0)
			IntroCh();
	}
	
	void instr(){
		System.out.println("\nPlease, note that using this program in the process of learning sometimes\n"
				+ "requires to press ENTER in order to continue, do not be frustrated, it gives\n"
				+ "you an opporunity to keep track of yout interest in the article.");
		System.out.println("\nPress ENTER to go back");
		
		ob.nextLine();
		ob.nextLine();
		IntroCh();
	}
	
	final void books(){
		System.out.println("1) Microeconomics\n2) Macroeconomics\n\nPress 0 to go BACK");
		int ch;
		ch = ob.nextInt();
		
		// the new array members of the program below are the main parts of our addition process
				String [] mic = new String[microar.length+1];
				String [] newauthor = new String[microauthorarr.length+1];
				String [] newmicname = new String[microname.length+1];
				String [] newmicropub = new String[micropub.length+1];
				int [] newmicpages = new int[micpages.length+1];
				int [] newmicyears = new int[micyears.length+1];
				
		
		while(ch>2 || ch<0){
			System.out.println("Please, type the proper number!");
			ch=ob.nextInt();}
		
		
		switch(ch){
		case 1: 
			{for(int i=0; i<microar.length; i++){
				System.out.println(++i+") "+microar[--i]);
			}
			
			if(this.ppp == 1){
				System.out.println("Add");
			}
			ch = ob.nextInt();
			
			while(ch>microar.length+1 || ch<1){
				System.out.println("Please, type the proper number!");
				ch=ob.nextInt();}
			
			if(ch==1){
				author = microauthorarr[2];
				name = microname[0];
				publisher = micropub[0];
				pages = micpages[0];
				year = micyears[0];}
			
			else if(ch==2){
				author = microauthorarr[1];
				name = microname[1];
				year = micyears[1];
				publisher =  micropub[1];
				pages = micpages[1];}
			
			else if(ch==3){
				author = microauthorarr[0];
				name = microname[2];
				year = micyears[2];
				publisher =  micropub[2];
				pages = micpages[2];
			}
			
			
				
			
				
			else if(ch==microar.length+1){
				
				/* These codes are for adding a book in the runtime, firstly I initialized all the information from old array to new array
				 * as: 
				 *  for (String auth: microauthorarr){
					newauthor[e]=auth;
					e++;
				}
				and created a new input String, and wrote e++ in the index box of my new array because I want to add new element to it  
				newauthor[e++]=addauthor;
				After that, I initialized new author array as old author array
				microauthorarr = newauthor;
				 */
				Scanner ob = new Scanner(System.in);
				
				int e = 0;
				int e1 = 0;
				int e2=0, e3=0, e4=0, e5=0;
				
				System.out.print("Book: ");
				String add;
				
				add = ob.nextLine();
				
				for (String mic2: microar){
					mic[e1]=mic2;
					e1++;
				}
				mic[e1++]=add;
				microar = mic;
				
				System.out.print("Author: ");
				
				String addauthor;
				
				addauthor = ob.nextLine();
				
				for (String auth: microauthorarr){
					newauthor[e]=auth;
					e++;
				}
				newauthor[e++]=addauthor;
				microauthorarr = newauthor;
				
				
				System.out.print("Book name: ");
				String addname;
				addname = ob.nextLine();
				
				for(String micname: microname){
					
					newmicname[e2] = micname;
					e2++;
				}
				newmicname[e2++]=addname;
				microname = newmicname;
				
				System.out.println("Publisher: ");
				
				String addPub;
				addPub=ob.nextLine();
				
				for(String pubname :  micropub)
				{
					newmicropub[e3]=pubname;
				e3++;}
				newmicropub[e3++]=addPub;
				micropub = newmicropub;
				
				System.out.println("Pages: ");
				int addpages;
				addpages = ob.nextInt();
				
				for(int page:micpages){
					newmicpages[e4]=page;
					e3++;
				}
					newmicpages[e4++]=addpages;
					micpages = newmicpages;
					
					System.out.println("Year: ");
					int addyear;
					addyear = ob.nextInt();
					
					for(int year:micyears){
						newmicyears[e5]=year;
						e5++;
					}
					newmicyears[e5++]=addyear;
					micyears = newmicyears;
				}
			
			else if(ch>=microar.length-1 && ch!=15){
				for(int i=0; i<microar.length; i++){
					author = microauthorarr[ch-1];
					name = microname[ch-1];
					year = micyears[ch-1];
					publisher = micropub[ch-1];
					pages = micpages[ch-1];
			}}
			if(ppp==0){
			MicroBooks micro = new MicroBooks(name, publisher, year, pages, author);
			
			micro.disp();
			
			System.out.println("\nPress ENTER to go back");
			
			ob.nextLine();
			ob.nextLine();
			books();}
			
			else if(ppp==1){
				ppp = 0;
				IntroCh();
			}
		}
		
		case 2:
		{System.out.println("1) The Road to Ruin: The Global Elites' Secret Plan for the Next Financial Crisis\n2) The Curse of Cash\n\n0 to go BACK");
			ch = ob.nextInt();
			if(ch == 1)
				{author = "James Rickards";
				name = "The Road to Ruin: The Global Elites' Secret Plan for the Next Financial Crisis";
				year = 	2016;
				publisher = "Penguin";
				pages = 340;}
				
			else if(ch==2){
				author = "Kenneth S. Rogoff";
				name = "The Curse of Cash";
				year = 2016;
				pages = 283;
				publisher = "Princeton University Press";}
			else if(ch==0){
				books();
			}
			
			MacroBooks macro = new MacroBooks(name, publisher, year, pages, author);
			
			macro.disp();
			
			System.out.println("\nPress ENTER to go back");
			
			ob.nextLine();
			ob.nextLine();
			books();
		}
		case 0:
			IntroCh();
			break;
	
	
	}
	}
void IntroTest(){
	int ch;
	System.out.println("Welcome! Test will check your knowledge of Economics and show\n"
			+ "the result of yours.");
	System.out.println("1) Foundations of Economics\n2) Mixed\n\n0 ot go BACK");
	
	ch=ob.nextInt();
	
	switch(ch){
	case 1: {
		test.foundtest();
		break;}
	case 2:{
		test.test();
		break;}
	case 0:{
		return;}
}
}}

	