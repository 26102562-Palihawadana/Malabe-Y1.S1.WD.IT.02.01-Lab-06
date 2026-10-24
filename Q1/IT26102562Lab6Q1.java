import java.util.Scanner;

public class IT26102562Lab6Q1
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		double num = input.nextDouble();
		
		double square = num*num;
		double sqr_root = Math.sqrt(num);
		
		System.out.println("The square of " + num + " is : " + square);
		System.out.println("The square root of "+ num + " is : " + sqr_root);
	}
}