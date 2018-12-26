package �����㷨;
//�鲢����
public class Merge_sort {
	//��a�����е�m...n�͵�n+1...k�ϲ�����������
	public static void merge(int[] a,int m,int n,int k)
	{
		int[] memo = new int[k-m+1];
		int i=m; int j=n+1; int s=0;
		while(i<=n&&j<=k)
		{
			if(a[i]<=a[j])
				memo[s++] = a[i++];
			else
				memo[s++] = a[j++];
		}
		if(i>n)
			while(j<=k)
				memo[s++] = a[j++];
		if(j>k)
			while(i<=n)
				memo[s++] = a[i++];
		for(int p=0;p<=k-m;p++)
		{
			a[m+p] = memo[p];
		}
	}
	//�ǵݹ�鲢����
	public static void Merge_sort(int[] a)
	{
		int size = a.length;
		int i; //��ʼ�ϲ�ʱ��һ�����е���ʼλ��
		int s;  //�ϲ�ǰ��С
		int t = 1;  //�ϲ���Ĵ�С
		while(t<=size)
		{
			s = t; t = 2*s; i=0;
			while((i+t)<size)
			{
				merge(a, i, i+s-1,i+t-1);
				i = i+t;
			}
			if((i+s)<size)
				merge(a, i, i+s-1, size-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,4,2,65,1,23,3,5,5,3,3};
		Merge_sort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}
