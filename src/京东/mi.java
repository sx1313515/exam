package ¾©¶«;

import java.util.Scanner;

public class mi {
public static int fun(int n)
{
	int sum = 0;
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
			for(int k = 1;k<=n;k++)
				for(int h=1;h<=n;h++)
					if(Math.pow(i, j)==Math.pow(k, h))
						sum++;
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			System.out.println(fun(n));
		}
	}

}
