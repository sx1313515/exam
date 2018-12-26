package ��ת�㷨.RecurionAndBackstracking;
/*
 * ����һ����άƽ�����ĸ��һ�����ʣ����Ƿ����
 * �����άƽ���ҵ�������ʡ��ҵ�������ʵĹ�����
 * ��һ����ĸ���������Ժ�������������Ӷ�ά
 * ƽ���������ĸ��ͬһ��λ�õ���ĸֻ��ʹ��һ��
 */
public class WordSearch {
	static boolean[][] visited;
	static int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
	public static boolean isexist(char[][] board,char[] word)
	{
		int n = board.length;
		int m = board[0].length;
		visited = new boolean[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				visited[i][j] = false;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				if(searchWord(board,word,i,j,0))
					return true;
			}
		return false;
		
	}

	public static boolean searchWord(char[][] board, char[] word, int startX, int startY, int index) {
		// TODO Auto-generated method stub
		if(index==word.length-1)
			return board[startX][startY]==word[index];
		if(word[index]==board[startX][startY])
		{
			visited[startX][startY] = true;
			for(int i=0;i<4;i++)
			{
				int newX = startX + d[i][0];
				int newY = startY + d[i][1];
				//�ж��Ƿ����
				if(inArea(newX,newY)&&!visited[newX][newY]&&searchWord(board,word,newX,newY,index+1));
					return true;
			}
			visited[startX][startY] = false;
		}
		return false;
	}

	public static boolean inArea(int x, int y) {
		// TODO Auto-generated method stub
		int n = visited.length;
		int m = visited[0].length;
		return x>=0&&x<n&&y>=0&&y<m;
	}
	public static void main(String[] args) {
		char[][] b = {{'A','B','C','E'},
					  {'S','F','C','S'},
					  {'A','D','E','E'}};
		char[] c = {'A','B','C','C','E','D'};
		System.out.println(isexist(b,c));
	}
}
