/**
 * 
 */
package faceOffer;

/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
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
	 * ����˼�룺ʹ��ð������ʽ�����б𣬵�ʱ�临�Ӷȹ���
	 * �޸�˼�룺����ʱ�临�Ӷȣ�ʹ�ù鲢���򣬽��в���
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
     * �鲢����(��������)
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
     * ��һ�������е�����������������ϲ���һ��
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