package huaWeiOffer;

import java.util.Scanner;

/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。
 * 然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。 
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
		 * 循环输入测试用例的实现
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
	        //根据角标进行比较，
	        for(int i = 0; i<input.length; i++){
	            //j是数组的最后一个角标
	            for (int j = input.length-1; j > i; j--) {
	                
	                if (input[j] < input[j - 1]) {
	                    //从后往前进行比较，小数往前，一轮之后最小数就在最前面了
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
