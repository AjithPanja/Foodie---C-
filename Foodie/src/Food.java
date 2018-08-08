import java.util.Scanner;
import Foods.nonveg;
import Foods.veg;
public class Food{
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Food f = new Food();
		Hotel h = new Hotel();
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
			h.hotel();
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
}
class Hotel extends Food
{
	String nam;
	Scanner s = new Scanner(System.in);
	public void hotel()
	{
		Hotel[] a = new Hotel[3];
		for ( int i=0; i<3; i++) 
		{
			a[i]=new Hotel();
		}
		a[0].nam = new String("A2B");
		a[1].nam = new String("Coal barbeque");
		a[2].nam = new String("Arasan");
		boolean choice = true;
		int n;
		while(choice)
		{
			System.out.printf("1.A2B\n2.Coal Barbeque\n3.Arasan\n4.Logout\nEnter your choice:");
			n = s.nextInt();
			switch(n)
			{
			case 1:
				choice = a[n-1].printe();break;
			case 2:
				choice = a[n-1].printe();break;
			case 3:
				choice = a[n-1].printe();break;
			case 4:
				choice = false;
				return;
			default:
				System.out.println("Enter correct choice.");
			}
		}
	}

	boolean printe()
	{	
		int i,j;
		System.out.println("Welcome to " + nam);
		//System.out.println("Menu will be updated soon.Thank you! 1.Back");
		veg v = new veg();
		Delivery d = new Delivery();
		nonveg nv = new nonveg();
		System.out.println("1.Vegetarian or 2.Non-Vegetarian ... Enter your Choice :");
		i = s.nextInt();
		if(i==1)
		{
			v.display_veg();
			d.getAddr();
			d.display();
			v.display_veg_list();
			System.out.println("1.Would like to place a Order ? 2.Clear Cart..");
			j = s.nextInt();
			if(j==1)
			{
				System.out.println("Your Order is on the Way :");
				return false;
			}
			else
			{
				v.clearAll();
				d.clearAll();
				return true;
			}
		}
		else
		{
			nv.display_nonveg();
			d.getAddr();
			d.display();
			nv.display_nonveg_list();
			System.out.println("1.Would like to place a Order ? 2.Clear Cart..");
			j = s.nextInt();
			if(j==1)
			{
				System.out.println("Your Order is on the Way :");
				return false;
			}
			else
			{
				nv.clearAll();
				d.clearAll();
				return true;
			}
		}
	}
}