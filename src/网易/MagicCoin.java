package ����;
/*
 С��׼��ȥħ�������ɹ�ħ������,����ħ��������Ҫʹ��ħ����,
 ����С������һöħ���Ҷ�û��,
 ����С������̨ħ����������ͨ��Ͷ��x(x����Ϊ0)��ħ���Ҳ��������ħ���ҡ�
ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
С�ײɹ�ħ�������ܹ���Ҫn��ħ����,
����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,
С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ����
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicCoin {
	public static String s="";
	public static String fun(int n)
	{
		if(n==0)
			return s;
		if((n-1)%2==0)
		{
			s = s+"1";
			n = (n-1)/2;
			fun(n);
		}
		else
		{
			s = s+"2";
			n = (n-2)/2;
			fun(n);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
				int n = sc.nextInt();
				String ss = fun(n);
				char[] ch = ss.toCharArray();
				for(int i=ch.length-1;i>=0;i--)
					System.out.print(String.valueOf(ch[i]));
				
		}
	}

}
