package ����;

import java.util.Scanner;

public class MaxArea {
	public static Long CountMaxArea(int[] a)
	{
		Long max=(long) 0;
		int length = a.length;
		for(int i=0;i<length;i++)
		{
			int minHeight=a[i];
			for(int j=i+1;j<length;j++)
			{
				minHeight = Math.min(minHeight,a[j]);
				max = Math.max(max,(j-i+1)*minHeight);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������С");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("���������Ԫ�أ�");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("������Ϊ��"+CountMaxArea(a));
	}

}
