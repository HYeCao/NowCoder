package huaWeiOffer;

import java.util.Scanner;

/**
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000����
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�
 * Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣
 * ����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���(ͬһ��������������ܻ��ж������ݣ�ϣ���������ȷ����)�� 
 * @author dell
 *
 */
public class Ex1_2_NumClearSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		/*
		 * ѭ���������������ʵ��
		 */
		while(scanner.hasNext()){
		int n=scanner.nextInt();
		int[] inputArray=new int[n];
		for(int i=0;i<n;i++){
			inputArray[i]=scanner.nextInt();
		}
		int[] OutputArray=ClearAndSort(n, inputArray); 
		for(int i=0;i<n;i++){
			if(OutputArray[i]!=0)
			System.out.println(OutputArray[i]);
		}
		}
	}
	public static int[] ClearAndSort(int num,int[] input){
//		Arrays.sort(input);
		 int temp=0;
	        //���ݽǱ���бȽϣ�
	        for(int i = 0; i<input.length; i++){
	            //j����������һ���Ǳ�
	            for (int j = input.length-1; j > i; j--) {
	                
	                if (input[j] < input[j - 1]) {
	                    //�Ӻ���ǰ���бȽϣ�С����ǰ��һ��֮����С��������ǰ����
	                    temp = input[j - 1];
	                    input[j - 1] = input[j];
	                    input[j] = temp;
	                }
	            }
	        }
		int[] output=new int[num];
		temp=0;
		int j=0;
		output[j]=input[0];
		for(int i=0;i<num;i++){
			temp=input[i];
			if(output[j]!=temp){
				output[j+1]=temp;
				j++;
			}
		}
		return output;
	}
}
