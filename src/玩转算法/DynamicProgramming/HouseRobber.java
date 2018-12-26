package ��ת�㷨.DynamicProgramming;
/*
 * һ���ֵ����з��ӡ�ÿ�������ﶼ�в�ͬ��ֵ�ı��
 * ���������ѡ��͵�����������ķ��Ӿͻᱨ����
 * �������������͵���ļ�ֵ���٣�
 */
public class HouseRobber {
	// memo[i] ��ʾ���� nums[i...n) ���ܻ�õ��������
	static int[] memo;
	//��������nums[index,nums.length)��Χ�ڵ����з���
	//�ݹ�Ӽ�������
	public static int fun2(int[] nums,int index) {
		if(index>=nums.length)
			return 0;
		if(memo[index]!=-1)
			return memo[index];
		int max = -1;
		for(int i = index;i<nums.length;i++)
		{
			max = Math.max(max,nums[i]+fun2(nums,i+2));
		}
		memo[index] = max;	
		return memo[index];
		// TODO Auto-generated method stub
	}	
	//��̬�滮
	public static int fun3(int[] nums) {
		if(nums.length==0)
			return 0;
		int[] memo1 = new int[nums.length];
		memo1[nums.length-1] = nums[nums.length-1];
		for(int i = nums.length-2;i>=0;i--)
		{
			for(int j=i;j<nums.length;j++)
			{
				memo1[i] = Math.max(memo1[i],nums[j]+((j+2)<nums.length?memo1[j+2]:0));
			}
		}	
		return memo1[0];
		
		// TODO Auto-generated method stub
	}
	public static int fun1(int[] nums) {
		// TODO Auto-generated method stub
		memo = new int[nums.length];
		for(int i=0;i<memo.length;i++) {
			memo[i] = -1;
		}
		return fun2(nums,0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,1,2};
		System.out.println(fun3(a));
	}

}
