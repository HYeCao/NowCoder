/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

/**
 * @author dell
 *
 */
public class Ex3_3_toLowABC {

	/**
	 * @param args
	 */
		    public static int getCount(String str,char c){
		        int count = 0;
		        if(str != null && str.length() > 0){
		            for(int i = 0;i < str.length();i++){
		                if(c == str.charAt(i)){
		                    count++;
		                }
		            }
		        }else{
		            count = 0;
		        }
		        return count;
		    }
		     
		    public static void main(String[] args){
		        Scanner s = new Scanner(System.in);
		            String str = s.next();
		            str=str.toLowerCase();//全部转换为小写
		            char c = s.next().charAt(0);
		            int i = getCount(str,c);
		            System.out.println(i);
		    }
		}