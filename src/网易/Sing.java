package ����;
/*
СQ��ţ��ʿ�ϳ�һ�׸���,���׸�����n���������,ÿ��������һ����������ʾ��
����ÿ������Ҫô��СQ�ݳ�Ҫô��ţ��ʿ�ݳ�,����һϵ�������ݳ����Ѷȵ����������������仯����֮��, ����һ������������8, 8, 13, 12, ��ô�����Ѷȵ���|8 - 8| + |13 - 8| + |12 - 13| = 6(����||��ʾ����ֵ)��
����Ҫ�԰���n�����������СQ��ţ��ʿ,�������ݳ����Ѷ�֮����С,����������С���ѶȺ��Ƕ��١�
��������ʾ: СQѡ���ݳ�{5, 6}�Ѷ�Ϊ1, ţ��ʿѡ���ݳ�{1, 2, 1}�Ѷ�Ϊ2,�Ѷ�֮��Ϊ3,��һ������С�ѶȺ͵ķ�����
 */
import java.util.Scanner;

public class Sing {
	public static long fun(int[] a)
	{
		int size = a.length;
		int[] cost = new int[size];
		for(int i=1;i<size;i++)
			cost[i] = Math.abs(a[i]-a[i-1]);
		long[][] dp = new long[size][size];
		for(int i=2;i<size;i++)
			dp[i][i-1] = dp[i-1][i-2] + cost[i-1];
		for (int i = 2; i < size; i++) 
		{
	        for (int j = 0; j < i - 1; j++) 
	        {
	            dp[i][j] = dp[i - 1][j] + cost[i];
	            dp[i][i-1] = Math.min(dp[i][i - 1],dp[i-1][j] + Math.abs(a[i] - a[j]));
	        }
		}
		long result = Long.MAX_VALUE;
		for(int i=0;i<size-1;i++)
			result = Math.min(result,dp[size-1][i]);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<a.length;i++)
				a[i] = sc.nextInt();
			System.out.println(fun(a));
		}
	}
}

