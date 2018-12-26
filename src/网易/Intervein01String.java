package ����;

import java.util.Arrays;
import java.util.Scanner;

/*
  ���һ��01��������������λ�õ��ַ����ǲ�һ����,
 ���Ǿͽ����01��Ϊ����01��������: "1","10101","0101010"���ǽ���01����
С��������һ��01��s,С�����ҳ�һ����������Ӵ�,
��������Ӵ���һ������01����С����Ҫ����æ�������������Ӵ��ĳ����Ƕ��١�
 */
public class Intervein01String {
	public static int fun(String s)
	{
		char[] ch = s.toCharArray();
		int size = ch.length;
		int[] memo = new int[size];
		Arrays.fill(memo, 1);
		for(int i = 1;i<size;i++)
			if(ch[i]!=ch[i-1])
				memo[i] = memo[i-1]+1;
		int max = -1;
		for(int i=0;i<size;i++)
			max = Math.max(max, memo[i]);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.next();
			System.out.println(fun(s));
		}
	}

}
