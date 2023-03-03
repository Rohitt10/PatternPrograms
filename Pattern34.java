import java.util.Scanner;
class Pattern34
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd number");
		int n=sc.nextInt();
		for(int i=0,k=0;i<n;k++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=(n/2)+k && j>=(n/2)-k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			i=i+2;
		}
	}
}
					