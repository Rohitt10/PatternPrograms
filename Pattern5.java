import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=65;j<65+n;j++)
				System.out.printf("%c",j);
			System.out.println("");
		}
	}
}