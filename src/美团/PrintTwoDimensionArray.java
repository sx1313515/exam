package ����;
/*
��һ����ά����(n*n),д����ʵ�ִ����Ͻǵ����½������Խ��߷����ӡ��
����һ����λ����arr����Ŀ�еĲ���n���뷵�ؽ�����顣
����������
[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]],4
���أ�[4,3,8,2,7,12,1,6,11,16,5,10,15,9,14,13]
 */
public class PrintTwoDimensionArray {
	public static void main(String[] args) {
		 int[][] a = {{1,2,3,4},  
                 {5,6,7,8},  
                 {9,10,11,12},  
                 {13,14,15,16}}; 
	        int size = a.length;  
	        int len = 2*a.length-1;//һ�����ɼ��н��  
	        for(int k=0;k<len;k++){  
	            //�����ǵ� K�� �к�-�к�=size-1-k  
	            for(int i=0;i<size;i++){  
	                for(int j=0;j<size;j++){  
	                    if(j-i == size-1-k){  
	                        System.out.print(a[i][j]+" ");  
	                    }  
	                }  
	            }  
	        } 
	}
}
/*
 *     public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] res = new int[n*n];
        int index = 0;
        int startX = 0;
        int startY = n-1;
        while(startX<n){
            int x = startX;
            int y = startY;
            while(x<n&&y<n)
                res[index++]=arr[x++][y++];
            if(startY>0)
                startY--;
            else
                startX++;
        }
        return res;
    }
 */
