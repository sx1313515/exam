package ����;
/*
 * 
С����һ������ΪN������������A = {A[1], A[2], A[3]..., A[N]}��
ţ��ʿ��С�׳���һ������:
������A������������,ʹ����A�������е�A[i] * A[i + 1](1 �� i �� N - 1)
����4�ı�����
С��������Ҫ�ж�һ�������Ƿ��������֮������ţ��ʿ��Ҫ��
 */
import java.util.Arrays;
import java.util.Scanner;

public class ChongPaiShuLie {
	static boolean[] used;
	public static void fun(int[] a)
	{
		int countmod4 = 0;
		int countnomod = 0;
		int size = a.length;
		for(int i=0;i<size;i++)
		{
			if(a[i]%4==0)
				countmod4++;
			if(a[i]%2!=0)
				countnomod++;
		}
		if(countmod4>=countnomod)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int count = sc.nextInt();
			for(int i=0;i<count;i++)
			{
				int n = sc.nextInt();
				int[] a = new int[n];
				for(int j=0;j<n;j++)
					a[j] = sc.nextInt();
				fun(a);
			}
		}
	}

}
