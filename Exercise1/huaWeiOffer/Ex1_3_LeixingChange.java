/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.ExpandedIcon;

/**
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��
 * @author dell
 *
 */
/**
 * 
 * 1����ν��ִ� String ת�������� int? 
 * int i = Integer.valueOf(my_str).intValue();
 * int i=Integer.parseInt(str);
 * 2����ν��ִ� String ת����Integer ?
 * Integer integer=Integer.valueOf(str);
 * 3����ν����� int ת�����ִ� String ? 
 * 1.) String s = String.valueOf(i);
 * 2.) String s = Integer.toString(i); 
 * 3.) String s = "" + i; 
 * 4����ν����� int ת����Integer ? 
 * Integer integer=new Integer(i);
 * 5����ν�Integer ת�����ִ� String ? 
 * Integer integer��String
 * 6����ν�Integer ת���� int ? 
 * int num=Integer.intValue();
 * 7����ν�Stringת���� BigDecimal ? 
 * BigDecimal d_id = new BigDecimal(str);
 *        8����ν� String ת���� char ?
 *        char[] ca="123".toCharArray();
 *        9����ν�charת����String?
 *        String s=ca.toString();      //�κ����Ͷ����Բ���toString()ת����String����
//-----------------����-------------------------
Calendar calendar=Calendar.getInstance();
int year=calendar.get(Calendar.YEAR);
int month=calendar.get(Calendar.MONTH)+1;
int day=calendar.get(Calendar.DATE);
10����ȡ����������ַ���
String today=java.text.DateFormat.getDateInstance().format(new java.util.Date());
        11����ȡ���������
new java.sql.Date(System.currentTimeMillis())
12��Stringתdouble
String s;
double ss=Double.parseDouble(s); 
 */
public class Ex1_3_LeixingChange {

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
		String str=scanner.nextLine();
		double num=OxChange(str);
		int temp=(int)num;
		System.out.println(String.valueOf(temp));
		}
	}
	public static double OxChange(String str){
		int len=str.length();
		double temp=0;
		double sum=0;
		for(int i=2;i<len;i++){
			if(str.charAt(i)=='A'){
				sum +=10*Math.pow(16, len-i-1);
			}
			else if(str.charAt(i)=='B'){
				sum +=11*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='C'){
				sum +=12*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='D'){
				sum +=13*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='E'){
				sum +=14*Math.pow(16, len-i-1);
			}else if(str.charAt(i)=='F'){
				sum +=15*Math.pow(16, len-i-1);
			}else {
				temp=(double)str.charAt(i)-48;
//				System.out.println(temp);
				sum +=temp*Math.pow(16, len-i-1);
			}
			
		}
		return sum;
	}
}
