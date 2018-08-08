import java.util.Scanner;
public class Delivery {
	String street,area;
	int door;
	public void getAddr()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Door no :");
		door = s.nextInt();
		s.nextLine();
		System.out.print("Enter the Street Name :");
		street = s.nextLine();
		System.out.print("Enter the Area Name :");
		area = s.nextLine();
	}
	public void display()
	{
		System.out.println("Delivery Address :");
		System.out.println("Door no : " + door + " \n" + street  + " street " +"\n"+ area);
	}
	public void clearAll()
	{
		door = 0;
		street = "";
		area = "";
	}
}
