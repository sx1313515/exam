package ��ת�㷨.DynamicProgramming;

import java.util.Arrays;

/*
 * ��һ����������������ΪC��������n�ֲ�ͬ����Ʒ�����Ϊ0,1..n-1
 * ����ÿ����Ʒ������Ϊw[i],ÿ����Ʒ�ļ�ֵΪv[i]���ʿ��������������
 * �˷���Щ��Ʒ��ʹ�ò��������������Ļ����ϣ���Ʒ���ܼ�ֵ���
 */
public class backpack01 {
	//��̬�滮�㷨
	public static int fun1(int[] w,int[] v,int c)
	{
		if(w.length==0||v.length==0)
			return 0;
		int n = w.length;
		int[][] memo = new int[n][c+1];
		for(int j=0;j<=c;j++)
		{
			if(j<w[0])
				memo[0][j] = 0;
			else
				memo[0][j] = v[0];
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<=c;j++)
			{
				//�ռ临�Ӷ��Ż�
				memo[i%2][j] = memo[(i-1)%2][j];
//				memo[i][j] = memo[i-1][j];
				if(w[i]<=j)
					memo[i%2][j] = Math.max(memo[(i-1)%2][j],v[i]+memo[(i-1)%2][j-w[i]]);
//					memo[i][j] = Math.max(memo[i-1][j],v[i]+memo[i-1][j-w[i]]);
			}
		}
//		return memo[n-1][c];
		return memo[(n-1)%2][c];
	}
	static int[][] memo1;
	public static int fun2(int[] w, int[] v, int index, int c) {
		// TODO Auto-generated method stub
		if(index<0||c<=0)
			return 0;
		if(memo1[index][c]!=-1)
			return memo1[index][c];
		int result = fun2(w,v,index-1,c);
		if(c>=w[index])
			result = Math.max(result,v[index]+fun2(w,v,index-1,c-w[index]));
		memo1[index][c] = result;
		return result;
	}
	public static int fun3(int[] w,int[] v,int c)
	{
		int size = w.length;
		memo1 = new int[2][c+1];
		for(int i=0;i<2;i++)
			for(int j=0;j<=c;j++)
				memo1[i][j]=-1;
		return fun2(w,v,size-1,c);
	}

	public static void main(String[] args) {
		int[] w = {1,2,3};
		int[] v = {6,10,12};
		int c = 5;
		System.out.println(fun1(w,v,c));;
	}
}
