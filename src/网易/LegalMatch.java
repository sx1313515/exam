package ����;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LegalMatch {
	//����HashMap����ȥ�ش洢
	private static Set<String> set;
	public static void getSequence(String str)
	{
		set = new HashSet<String>();
		int size = str.length();
		for(int i=0;i<size;i++)
		{
			StringBuffer sb = new StringBuffer(str);
			char c = str.charAt(i);
			sb = sb.deleteCharAt(i);
			for(int j=0;j<size;j++)
			{
				sb.insert(j, c);
				if(isLegal(sb.toString()))
					set.add(sb.toString());
				sb.deleteCharAt(j);
			}
		}
	}
	//�ж�һ���ַ����Ƿ��ǺϷ�������
	public static boolean isLegal(String str)
	{
		int size = str.length();
		int left = size/2;
		int right = size/2;
		for(int i=0;i<size;i++)
		{
			if(str.charAt(i)=='(')
				left--;
			else
				right--;
			if(right<left)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
				String s = sc.next();
				getSequence(s);
				System.out.println(set.size()-1);
		}
	}
}	
