import java.util.Scanner;
class Pattern39
{
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter odd Number:  ");
		int n=sc.nextInt();
		for(int i=0,k=0;i<=n/2;i++,k+=2)
		{
			 for(int j=0;j<n;j++)
			 {
				 if(j>=n/2-i && j<=n/2+i)
					 System.out.print(j-n/2+i+1);
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		}
	}
	
}