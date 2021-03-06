import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle
{
	static DecimalFormat df = new DecimalFormat(".#####");
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		Circle method = new Circle();
		
		System.out.println("Enter the radius of your circle:");
		double r = kb.nextDouble();
		
		double area = method.calcArea(r);
		method.print(r, area);
		
	}
	
	public double calcArea(double x)
	{
		double y = 3.14 * (Math.pow(x, 2));
		return y;
		
	}
	
	public void print(double x, double y)
	{
		System.out.println("The surface area of a circle with a radius of " + x + " is " + df.format(y));
		
		
	}
	
}