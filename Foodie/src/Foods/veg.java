package Foods;
import java.util.Scanner;
public class veg {
	String item[] = new String[5];
	int count[] = new int[5];
	int price[] = new int[5];
	int c = 0;
	public void display_veg()
	{
		Scanner s = new Scanner(System.in);
		int price_veg[] = new int[5];
		int p;
		boolean flag = true;
		String items_veg[] = new String[5];
		items_veg[0] = "Dosa. ";
		price_veg[0] = 20;
		items_veg[1] = "Idly. ";
		price_veg[1] = 10;
		items_veg[2] = "Chappathi. ";
		price_veg[2] = 15;
		items_veg[3] = "Masala Dosa. ";
		price_veg[3] = 25;
		items_veg[4] = "Egg Dosa. ";
		price_veg[4] = 25;
		int choice,n,check;
		boolean b = true;
		while(b)
		{
			for(int i=0;i<5;i++)
			{
				System.out.print((i+1) + " : " );
				System.out.println(items_veg[i]);
			}
			System.out.print("Enter your Choice : ");
			choice = s.nextInt();
			for(int k =0;k<c;k++)
			{if(item[k] == items_veg[choice-1])
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
				item[c] = items_veg[choice-1];
				price[c] = price_veg[choice-1];
				count[c++] = n;
			}
			
			System.out.print("1.Add another item or 2.Checkout :");
			check = s.nextInt();
			if(check==2)
			{
				display_veg_list();
				break;
			}
		}
	}
	public void display_veg_list()
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
