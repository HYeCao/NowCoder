/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

/**
 * @author dell
 *
 */
public class Ex1_1_Bottle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[] num =new int[10];
		int i=0;
		while(scanner.hasNextInt()){
			num[i]=scanner.nextInt();
			i++;
		}
		i=0;
		while(num[i]!=0){
//			System.out.println(num[i]);
			System.out.println(BottleNum(num[i]));
			i++;
		}
	}
	public static int BottleNum(int bot){
		int x=0,y=0;
		int num=0;
		while(bot>2){
		x=bot/3;	
		y=bot%3;
		num +=x;
		bot=x+y;
		}
		if(bot==2)num++;
		
		return num;
	}
}
