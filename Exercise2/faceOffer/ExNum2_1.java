/**
 * 
 */
package faceOffer;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * @author dell
 *
 */
public class ExNum2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,5,0};
		System.out.println(InversePairs(arr));
	}
	/**
	 * 初步思想：使用冒泡排序方式进行判别，但时间复杂度过高
	 * 修改思想：降低时间复杂度，使用归并排序，进行查找
	 * @param array
	 * @return
	 */
	public static int InversePairs(int [] array) {
       int num=0;
       for(int i=0;i<array.length-1;i++){
    	   for(int j=i+1;j<array.length;j++){
    		   if(array[i]>array[j])num++;
    	   }
       }
		return num%1000000007; 
    }
}
/*
public class Solution {
    int cnt;
 
    public int InversePairs(int[] array) {
        cnt = 0;
        if (array != null)
            mergeSortUp2Down(array, 0, array.length - 1);
        return cnt;
    }
 */
    /*
     * 归并排序(从上往下)
     */
 /*   public void mergeSortUp2Down(int[] a, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) >> 1;
 
        mergeSortUp2Down(a, start, mid);
        mergeSortUp2Down(a, mid + 1, end);
 
        merge(a, start, mid, end);
    }
 */
    /*
     * 将一个数组中的两个相邻有序区间合并成一个
     */
/*    public void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end - start + 1];
 
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (a[i] <= a[j])
                tmp[k++] = a[i++];
            else {
                tmp[k++] = a[j++];
                cnt += mid - i + 1;  // core code, calculate InversePairs............
                cnt %=1000000007;
            }
        }
 
        while (i <= mid)
            tmp[k++] = a[i++];
        while (j <= end)
            tmp[k++] = a[j++];
        for (k = 0; k < tmp.length; k++) 
            a[start + k] = tmp[k];
    }
}
*/