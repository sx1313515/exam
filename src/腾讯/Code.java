package ��Ѷ;
/*
 * �ٶ�һ�ֱ���ı��뷶Χ��a ~ y��25����ĸ��
 * ��1λ��4λ�ı��룬������ǰѸñ��밴�ֵ�������
 * �γ�һ���������£� a, aa, aaa, aaaa, aaab, aaac, �� ��, 
 * b, ba, baa, baaa, baab, baac �� ��, yyyw, yyyx, yyyy 
 * ����a��IndexΪ0��aa��IndexΪ1��aaa��IndexΪ2���Դ����ơ�
 *  ��дһ������������������һ�����룬�����������Ӧ��Index. 
 */
import java.util.Scanner;

public class Code {
	public static int fun(String s)
	{
		char[] ch = s.toCharArray();
		int size = ch.length;
		int sum = 0;  //��¼�ܵı��
		int memo = 0; //�������м�¼�ļ�����
		for(int i=0;i<4;i++)
		{
			memo = memo*25;
			if(i<size)
			{
				memo = memo+ch[i]-'a';
			}
			sum = sum + memo;
			if(i<size-1)
			{
				sum = sum+1;
			}
		}
		return sum;
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
