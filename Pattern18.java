import java.util.Scanner;
class Pattern18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		for(int i=65;i<65+n;i++)
		{
			for(int j=65+n;j>i;j--)
				System.out.printf("%c",i);
			System.out.println("");
		}
	}
}