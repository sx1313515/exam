package ����;
/*
 * Ϊ�˵õ�һ������"�෴��",���ǽ������������˳��ߵ�,
 * Ȼ���ټ���ԭ�ȵ����õ�"�෴��"������,Ϊ�˵õ�1325��"�෴��",
 * �������ǽ�����������˳��ߵ�,���ǵõ�5231,֮���ټ���ԭ�ȵ���,
 * ���ǵõ�5231+1325=6556.����ߵ�֮���������ǰ׺��,ǰ׺�㽫�ᱻ���ԡ�
 * ����n = 100, �ߵ�֮����1.
 */
import java.util.Scanner;

public class oppositeNumber {
	public static int fun(int n)
	{
		int nn = n;
		if(n==0)
			return 0;
		while(nn%10==0)
		{
			nn = nn/10;
		}
		String s = String.valueOf(nn);
		char[] ch = s.toCharArray();
		for(int i=0;i<=(ch.length/2-1);i++)
		{
			char temp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = temp;
		}
		String ss = String.valueOf(ch);
		int nnn = Integer.valueOf(ss);
		return n+nnn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
				int n = sc.nextInt();
				System.out.println(fun(n));
		}
	}

}
