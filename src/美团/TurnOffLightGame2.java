package ����;

import java.util.Scanner;

/*
 * �� Alice ���յ����죬Bob �͸����� n �����ݡ����Ǿ�������Щ������һ����Ϸ�����ǰ���Щ���ݴ��������ų�һ�У��ڳ�ʼʱ����Щ�����ǵ����ģ���Щ������Ϩ��ġ��������������������в�����Alice ���Ȳ�������ÿһ�β����У��ֵ�����������Ҫѡ��һ�������ĵ��ݣ�Ȼ������Լ����ұߵ����е��ݵ�״̬����һ�θı䣬���ѵ����ĵ���Ϩ�𣬰�Ϩ��ĵ��ݵ����������ĳһ���˲�����֮�����еĵ��ݶ������Ϩ��״̬����ô�Ǹ��˾�Ӯ������Ϸ��Alice �� Bob ����Ӯ����Ϸ�������Ƕ��㹻����������£����˭��Ӯ�أ�
 */
public class TurnOffLightGame2 {
	public static void fun(int[] a)
	{
		int flag = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
				flag++;
		}
		if(flag%2==0)
			System.out.println("Alice");
		else
			System.out.println("Bob");
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
			fun(a);
		}
	}

}
