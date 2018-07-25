import java.util.Scanner;
public class Foodie {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Foodie f = new Foodie();
		String log,pass;
		boolean check;
		Scanner s = new Scanner(System.in);
		System.out.printf("\t\t\t\t\tFoodie\n");
		System.out.println("Welcome to Foodie");
		System.out.print("Log in :");
		log = s.nextLine();
		System.out.print("Password :");
		pass = s.nextLine();
		check = f.validate(log,pass);
		if(check)
		{
			System.out.println("Welcome, " + log);
			System.out.println("Location : Chennai");
			f.hotel();
		}
		else
		{
			System.out.println("Sorry, User Id not found :)");
		}
	}
	boolean validate(String log , String pass)
	{
		if(log.equals("admin") && pass.equals("pass"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void bnb()
	{	
		int i;
		System.out.println("Menu will be updated soon.Thank you! 1.Back");
		i = s.nextInt();
		if(i==1)
			{
			return;
			}
		else
		{
			System.out.println("Option not found :)");	
		}
	}
	void kc()
	{
		int i;
		System.out.println("Menu will be updated soon.Thank you! 1.Back");
		i = s.nextInt();
		if(i==1)
			{
			return;
			}
		else
		{
			System.out.println("Option not found :)");	
		}
	}
	void cb()
	{
		int i;
		System.out.println("Menu will be updated soon.Thank you! 1.Back");
		i = s.nextInt();
		if(i==1)
			{
			return;
			}
		else
		{
			System.out.println("Option not found :)");	
		}
	}
	void hotel()
	{
		Foodie fo = new Foodie();
		boolean choice = true;
		int n;
		while(choice)
		{
			System.out.printf("1.BNB Live Grill\n2.Kipling Cafe\n3.Coal Barbeque\n4.Logout\nEnter your choice:");
			n = s.nextInt();
			switch(n)
			{
			case 1:
				fo.bnb();break;
			case 2:
				fo.kc();break;
			case 3:
				fo.cb();break;
			case 4:
				
				return;
			default:
				System.out.println("Enter correct choice.");
			}
		}
	}
}
