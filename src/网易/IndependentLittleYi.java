package ����;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
С��Ϊ�������ĸ�ĸ�������Ѿ����������,���������ȥ�Լ���סһ��ʱ�䡣
һ����������������໨��: С��ÿ������һ��ˮ��������Ҫÿ��֧��xԪ�ķ������
��ǰС�������Ѿ���f��ˮ����dԪǮ,С��Ҳ��ȥ�̵깺��һЩˮ��,
�̵�ÿ��ˮ������pԪ��С��Ϊ�˱������������������,
ϣ���ܶ��������ʱ��Խ��Խ��,С��ϣ��������������һ��������ܶ�����������졣 
 */
public class IndependentLittleYi {
	public static int fun(int x,int f,int d,int p)
	{
		if(d/f<x)
			return d/x;
		else
		{
			return f+(d-f*x)/(p+x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int x = sc.nextInt();
			int f = sc.nextInt();
			int d = sc.nextInt();
			int p = sc.nextInt();
			System.out.println(fun(x, f, d, p));
		}
	}

}
