package ����;

import java.util.ArrayList;
import java.util.List;

/*
 * �ڹ��еĽ������У��������ɽ�����������(��������Ĵ�����С�ڵ���2)�������Ǳ���һ�ʳɽ��������һ��(����-��-��-����˳�����)������һ���еĹ�Ʊ�仯���У���дһ���������һ����Ի�õ�������档�����ʵ�����Ӷȵ͵ķ���ʵ�֡�
	�����۸�����prices�����ĳ���n���뷵��������档��֤����С�ڵ���500��
	����������
 */
/*
 * ˼·��
�Լ�����һ�����ϵ������˵Ľⷨ�����ֹ�Ȼ���ޡ�
���˵�˼·�������ġ����������飬һ������preProfit[i],
ָ���ǵ�i+1�죨�����±��0��ʼ��֮ǰ����ȻҲ������i+1���������棬
��Ҫ�����һ�������ǵ�i+1��֮ǰ����С�۸�
�����i+1��ļ۸��ȥ��С�۸���������Ҫ�Ȳ������������������
��ô�͹���������������һ��Ͳ�������
��ô����֮ǰ������������������������һ���ġ�
������ʹ������������ݣ��������ͳ�Ķ�̬�滮��˼�롣
����һ������postProfit[i]ָ���ǵ�i������Ļ���
֮�����ܻ�õ����������Ҫ����һ��������¼��i+1��֮������۸�
������۸��ȥ��һ������������֮���������������Ҫ��Ļ���
�����������򣬾͵�������֮����������������������������ͣ�
������ܵ��������
 */
public class StockExchangeDay {
		public static int maxProfit(int[] prices, int n) {
			//��i��֮ǰ���������
			int[] preProfit = new int[n];
			//��i��֮������
			int[] postProfit = new int[n];
			//�ܵ��������
			int max = Integer.MIN_VALUE;
			//�������ļ۸������С�۸�Ƚ�ֹ��������������󣬾��ý���ļ۸��ȥ��С�۸񣬷����ý�ֹ��������������
			int minBuy = prices[0];
			for(int i=1;i<n;i++)
			{
				minBuy = Math.min(minBuy, prices[i]);
				preProfit[i] = Math.max(preProfit[i-1],prices[i]-minBuy);
			}
			//������۸��������۸�������Ժ�������������󣬾������۸��������۸񣬷����������Ժ�������������
			int maxShell = prices[n-1];
			for(int i=n-2;i>=0;i--)
			{
				maxShell = Math.max(maxShell, prices[i]);
				postProfit[i] = Math.max(postProfit[i+1],maxShell-prices[i]);
			}
			//������ν��׵ĺͣ����ܵ����������бȽ�
			for(int i=0;i<n;i++)
			{
				max = Math.max(max, preProfit[i]+postProfit[i]);
			}
			return max;
				
					
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,22,5,75,65,80};
		System.out.println(maxProfit(a,a.length));
	}

}
