package ����;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ��һ¥�ݹ�m�����տ�ʼʱ���ڵ�һ����
 * ��ÿ��ֻ�ܿ���һ�����߶�����Ҫ����m����
 * ���ж����߷���ע���涨��һ����һ����0���߷���
����һ��������int n���뷵��һ������������¥�ķ�ʽ����
��֤nС�ڵ���100��Ϊ�˷�ֹ������뷵�ؽ��Mod 1000000007��ֵ��
 */
public class UpStairs {
	static int[] memo;
	public static int fun(int n)
	{
		if(memo[n]!=-1)
			return memo[n];
		memo[n] = (fun(n-1)+fun(n-2))%1000000007;
		return (fun(n-1)+fun(n-2))%1000000007;
	}
	public static int fun1(int n)
	{
		int m = n-1;
		memo = new int[n];
		Arrays.fill(memo, -1);
		memo[1] = 1;
		memo[2] = 2;
		return fun(m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			System.out.println(fun1(n));
		}
	}

}
