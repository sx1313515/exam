package ����;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * С����һЩ��ɫ��ש�顣ÿ����ɫ��һ����д��ĸ��ʾ��
 * ������ɫש�鿴��������ȫһ����������һ���������ַ���s,
 * s��ÿ���ַ�����С�׵�ĳ��ש�����ɫ��С����������е�ש���ų�һ�С�
 * ���������һ�Բ�ͬ��ɫ������ש��,��ô����ש��ͺ�Ư���ġ�
 * �������С�׼����ж����ַ�ʽ��������ש���ų�Ư����һ�С�
 * (������ַ�ʽ����Ӧ��ש����ɫ��������ͬ��,��ô��Ϊ�����ַ�ʽ��һ���ġ�)
����: s = "ABAB",��ôС�����������еĽ��:
 */
public class ColorfulStocks {
	public static int fun(String s)
	{
		char[] ch = s.toCharArray();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<ch.length;i++)
			if(list.contains(String.valueOf(ch[i])))
				continue;
			else
				list.add(String.valueOf(ch[i]));
		int size = list.size();
		if(size==1)
			return 1;
		else if(size==2)
			return 2;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.next();
			System.out.println(fun(s));
		}
	}
}
