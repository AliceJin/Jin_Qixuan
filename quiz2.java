import java.util.Scanner;
public class quiz2
{
	static double area;
	static int radius;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter radius: ");
		radius = kb.nextInt();
		calcArea();
		radPrint();
	}
	
	public static void calcArea()
	{
		area = 3.14 * (radius*radius);
	}
	
	public static void radPrint()
	{
		System.out.printf("The radius of your circle is %.3f.", area);
	}
}