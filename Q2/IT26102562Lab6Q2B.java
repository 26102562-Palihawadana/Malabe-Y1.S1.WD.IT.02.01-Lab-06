import java.util.Scanner;

public class IT26102562Lab6Q2B
{
	public static void main(String [] args)
	{
		int count=0;
		int i=0;
		int[] numbers = new int[10];
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter 10 numbers: ");
		
		while(count<10)
		{
			System.out.println("Enter number " + count + ": ");
			numbers[count]=input.nextInt();
			count++;
		}
		
		System.out.print("The numbers you entered are: ");
		
		while (i<10)
		{
			System.out.print(numbers[i] + " ");
			i++;
		}
			
	}
}