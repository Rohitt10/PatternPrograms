import java.util.Scanner;
class Pattern66
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd number:  ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0,k=1;j<n;j++)
			{
				if(j<=n/2+i && j>=n/2-i && (i+j)%2==0)
					System.out.print(k++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}