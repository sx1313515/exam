package ��ת�㷨.DynamicProgramming;
/*
 * ����һ������n�����Խ���ָ�ɶ�����ֵĺͣ�

 * ��Ҫ����Щ���ֵĳ˻����
 * ��ָ�ķ���(���ٷֳ���������1����)���㷨�������
 * �����˻�
 */
import java.util.Scanner;

public class MaxProduct {
	static int[] memo;
	public static int TheMaxProduct0(int n)
	{
		memo = new int[n+1];
		return TheMaxProduct(n);
		//		return TheMaxProduct1(n);
	}
	//��̬�滮�㷨
	public static int TheMaxProduct1(int n) {
		// TODO Auto-generated method stub
		int[] memo1 = new int[n+1];
		memo1[1]=1;
		for(int i=2;i<=n;i++)
		{
			int max = 0;
			for(int j=1;j<=i-1;j++)
			{
				max=max3(max,j*(i-j),j*memo1[i-j]);
				//max=Math.max(max,j*memo1[i-j]);
			}
			//System.out.println(max);
			memo1[i] = max;
		}
		return memo1[n];
	}
	//�ݹ��㷨
	public static int TheMaxProduct(int n)
	{
		if(n==1)
			return 1;
		if(memo[n]!=-1)
			return memo[n];
		int max = -1;
		for(int i=1;i<=n-1;i++)
		{
			max = max3(max,i*(n-i),i*TheMaxProduct(n-i));
		}
		memo[n] = max;
		return max;
	}
	private static int max3(int max, int i, int j) {
		// TODO Auto-generated method stub
		return Math.max(max, Math.max(i, j));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int s = sc.nextInt();
			System.out.println(TheMaxProduct1(s));
		}
	}

}
