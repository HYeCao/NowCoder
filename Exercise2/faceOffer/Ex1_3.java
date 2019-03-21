/**
 * 
 */
package faceOffer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author dell
 *
 */
public class Ex1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i={1,2,3,4,5,6,7};
		reOrderArray(i);
	}
    public static void reOrderArray(int [] array) {
    	int[] Odd=new int[array.length];
    	int[] Pdd=new int[array.length];
    	int j=0,k=0;
    	for(int i=0;i<array.length;i++){
    		if(array[i]%2!=0){
    			Odd[j]=array[i];
    			j++;
    		}
    		else {
    			Pdd[k]=array[i];
    			k++;
    		}
    	}
    	j=0;
    	for(int i=0;i<Odd.length;i++ ){
    		if(Odd[i]==0){
    			Odd[i]=Pdd[j];
    			j++;
    		}
    	}
    	array=Odd;
    	for(int i=0;i<Odd.length;i++){
    		System.out.println(array[i]);
    	}
    }
}
