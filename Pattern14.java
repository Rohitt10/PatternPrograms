import java.util.Scanner;
class Pattern14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		for(int i=65;i<65+n;i++)
		{
			for(int j=65;j<=i;j++)
				System.out.printf("%c",j);
			System.out.println("");
		}
	}
}