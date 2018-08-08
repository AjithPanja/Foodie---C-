package Foods;
import java.util.Scanner;
public class nonveg {
	String item[] = new String[5];
	int count[] = new int[5];
	int price[] = new int[5];
	int c = 0;
	public void display_nonveg()
	{
		Scanner s = new Scanner(System.in);
		int price_nonveg[] = new int[5];
		int p;
		boolean flag = true;
		String items_nonveg[] = new String[5];
		items_nonveg[0] = "Chicken Briyani. ";
		price_nonveg[0] = 140;
		items_nonveg[1] = "Mutton Briyani. ";
		price_nonveg[1] = 180;
		items_nonveg[2] = "Prawn Briyani. ";
		price_nonveg[2] = 200;
		items_nonveg[3] = "Fish Briyani. ";
		price_nonveg[3] = 175;
		items_nonveg[4] = "Chicken Dosa. ";
		price_nonveg[4] = 70;
		int choice,n,check;
		boolean b = true;
		while(b)
		{
			for(int i=0;i<5;i++)
			{
				System.out.print((i+1) + " : " );
				System.out.println(items_nonveg[i]);
			}
			System.out.print("Enter your Choice : ");
			choice = s.nextInt();
			for(int k =0;k<c;k++)
			{if(item[k] == items_nonveg[choice-1])
			{
				System.out.println("Item Already in the cart...1.Wanna Modify ? 2.Wanna Delete ? 3.No");
				p = s.nextInt();
				if(p==1)
				{
					System.out.print("Enter the no.of.Items :");
					n = s.nextInt();
					count[k] = n;
				}
				if(p==2)
				{
					item[k] = "";
					count[k] = 0;
					price[k] = 0;
					swap(k);
				}
				flag = false;
				break;
			}
			else
			{
				flag = true;
			}}
			if(flag)
			{
				System.out.print("Enter the no.of.Items :");
				n = s.nextInt();
				item[c] = items_nonveg[choice-1];
				price[c] = price_nonveg[choice-1];
				count[c++] = n;
			}
			
			System.out.print("1.Add another item or 2.Checkout :");
			check = s.nextInt();
			if(check==2)
			{
				display_nonveg_list();
				break;
			}
		}
	}
	public void display_nonveg_list()
	{float total = 0;
	for(int j=0;j<c;j++)
	{
		System.out.println(item[j] + " " + count[j] + " * " + price[j]);
		total = total + (price[j] * count[j]);
	}
	System.out.println("Total Price : " + total);
	}
	public void clearAll()
	{
		for(int j=0;j<c;j++)
		{
			item[j] = "";
			count[j] = 0;
			price[j] = 0;
		}
	}
	public void swap(int k)
	{
		for(int x=k;x<c;x++)
		{
			item[x] = item[x+1];
			count[x] = count[x+1];
			price[x] = price[x+1];
		}
		c--;
	}
}
