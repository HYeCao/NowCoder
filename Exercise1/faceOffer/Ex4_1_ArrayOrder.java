/**
 * 
 */
package faceOffer;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 一个整数数组，调整顺序使得前半部分为奇数，后半部分为偶数，并且奇数与奇数的顺序不变，偶数与偶数的顺序不变
 * @author dell
 *
 */
public class Ex4_1_ArrayOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,7,4,3,6,5,10,9};
		OddSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] OddSort(int[] arr){
		int len=arr.length;
		int[] arr1=new int[len];
		int[] arr2=new int[len];
		int i=0,a=0,b=0;
		while(i<len){
			if(arr[i]%2!=0){
				arr1[a]=arr[i];
				a++;
			}
			if(arr[i]%2==0){
				arr2[b]=arr[i];
				b++;
			}
			i++;
		}
		a=0;b=0;
		while(arr1[a]!=0){
			arr[a]=arr1[a];
			a++;
		}
		while(arr2[b]!=0){
			arr[a]=arr2[b];
			b++;a++;
		}
		return arr;
	}
}
