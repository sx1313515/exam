package ����;

import java.util.Scanner;

/*
 * ����һ����0..n����������������ɵ����У�
 * ����Ҫ����һЩɸѡ��
 * ÿ������ȡ��ǰ���������д�С����ĵ�����λ��������
 * �����䶪�����ظ���һ����ֱ�����ʣ��һ������
 * ��������ʣ�µ����֡�
 */
public class DiscardOddNumber {
	public static int result(int n)
	{
		int j=0,t;
		int s=n+1;
		int[] a = new int[n+1];
		for(int i=0;i<n+1;i++)
			a[i]=i;
		while(j<n)
		{
			t=s; 
			s=0;
			for(int i=0;i<t;i++)
			{
				if((i+1)%2==0)
				{
					a[s++]=a[i];
				}
				else
				{
					j++;
				}
			}
		}
		return a[0];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n;
			n = sc.nextInt();
			System.out.println(result(n));
		}

	}
}
