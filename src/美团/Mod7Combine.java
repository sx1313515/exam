package ����;
/*
 * С�ȷǳ�ϲ���ܱ� 7 ���������֣����� 7,21,121996���ȵȡ���һ�����õ��� n ������������������Щ�������������ܹ��� 7 �������������������� n ������ѡ����������Ȼ��һ����д����һ������ǰ�棬�Դ˵õ�һ���µ����������ַ�����һ�����Եõ�����������֪������Щ���У��ж��ٸ����ܱ� 7 �����ġ�
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Mod7Combine {
	public static long fun(int[] a)
	{
		HashSet<String> set = new HashSet<>();
		int size = a.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				String s1 = String.valueOf(a[i]);
				String s2 = String.valueOf(a[j]);
				String ss1 = s1+s2;
				if(Long.parseLong(ss1)%7==0)
					set.add(ss1);
				String ss2 = s2+s1;
				if(Long.parseLong(ss2)%7==0)
					set.add(ss2);
			}
		}
		return set.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
