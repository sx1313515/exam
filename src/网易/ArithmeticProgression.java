package ����;

import java.util.Scanner;

/*
 * ���һ������S����������еĺϷ���i,����S[i + 1] = S[i] + d, 
 * �����dҲ�����Ǹ�������,���Ǿͳ�����SΪ�Ȳ����С�
С��������һ������Ϊn������x,С�����x��Ϊһ���Ȳ����С�
С����������������������������λ�õ���ֵ�Ĳ���,���ҽ���������������Ρ�
������Щ����ͨ���������ǲ��ܱ�ɵȲ�����,
С����Ҫ�б�һ�������Ƿ���ͨ������������ɵȲ����� 
 */
public class ArithmeticProgression {
	public static boolean IsArithmeticProgression(int[] a)
	{
		int cha = a[1]-a[0];
		for(int i=2;i<a.length;i++)
			if(a[i]-a[i-1]!=cha)
				return false;
		return true;
	}
	public static int fun1(int[] a,int low,int high)
	{
		int p = a[low];
		while(low<high)
		{
			while(low<high&&a[high]>=p)
				high--;
			a[low] = a[high];
			while(low<high&&a[low]<=p)
				low++;
			a[high] = a[low];
		}
		a[low] = p;
		return low;
	}
	public static void quick_sort(int[] a,int low,int high)
	{
		if(low<high)
		{
			int p = fun1(a, low, high);
			quick_sort(a, low, p-1);
			quick_sort(a, p+1, high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int  n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<a.length;i++)
				a[i] = sc.nextInt();
			quick_sort(a,0,a.length-1);
			if(IsArithmeticProgression(a))
				System.out.println("Possible");
			else
				System.out.println("Impossible");
		}
	}

}
