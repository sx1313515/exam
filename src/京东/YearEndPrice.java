package ����;
/*
 * С�����ڹ�˾Ҫ�����ս�����С��ǡ�û������߸�����
 * ��Ҫ�ڹ�˾����ϲ���һ���齱��Ϸ����Ϸ��һ��6*6�������Ͻ��У�
 * �������36����ֵ���ȵ����ÿ��С���������������һ�����
 * ����Ҫ�����Ͻǿ�ʼ��Ϸ��ÿ��ֻ�����»��������ƶ�һ�����������½�ֹͣ
 * ��һ·�ϵĸ����������С�������õ���
 * �����һ���㷨ʹС���õ���ֵ��ߵ����
����һ��6*6�ľ���board������ÿ��Ԫ��Ϊ��Ӧ���ӵ������ֵ,
���Ͻ�Ϊ[0,0],�뷵���ܻ�õ�����ֵ����֤ÿ�������ֵ����100С��1000
 */
public class YearEndPrice {
	//��̬�滮�㷨
    public static int getMost(int[][] board) {
    	int size = board.length;
    	//int[][] memo = new int[size][size];
    	for(int i=1;i<size;i++)
    	{
    		board[0][i] = board[0][i-1]+board[0][i];
    		board[i][0] = board[i-1][0]+board[i][0];
    	}
    	for(int i=1;i<size;i++)
    		for(int j=1;j<size;j++)
    			board[i][j] = Math.max(board[i-1][j], board[i][j-1])+board[i][j];
		return board[size-1][size-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
