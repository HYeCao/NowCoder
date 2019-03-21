package huaWeiOffer;


public class DashuChengAddPLus {

 

	/**

	 * @param args

	 */

	public static void main(String[] args) {

		// System.out.println("Hello world");

 

		//String str1 = "1234";

		//String str2 = "1234";

		//String str1 = "1076060999";

		//String str2 = "90188905567";

		String str1 = "23456789009877666555544444";

		String str2 = "346587436598437594375943875943875";

 

		int len1 = str1.length();

		int len2 = str2.length();

 

		char[] s1 = str1.toCharArray();

		char[] s2 = str2.toCharArray();

 

		// 高低位对调

		covertdata(s1, len1);

		covertdata(s2, len2);

 

		System.out.println("乘数："+str1);

		System.out.println("乘数："+str2);

		multiply(s1, len1, s2, len2);

 

	}

 

	public static void covertdata(char data[], int len) {

		//高低位对调

		for (int i = 0; i < len / 2; i++) {

			data[i] += data[len - 1 - i];

			data[len - 1 - i] = (char) (data[i] - data[len - 1 - i]);

			data[i] = (char) (data[i] - data[len - 1 - i]);

		}

	}

 

	public static void multiply(char a[], int alen, char b[], int blen) {

		// 两数乘积位数不会超过乘数位数和+ 3位

		int csize = alen + blen + 3;

		// 开辟乘积数组

		int[] c = new int[csize];

		// 乘积数组填充0

		for (int ii = 0; ii < csize; ii++) {

			c[ii] = 0;

		}

		// 对齐逐位相乘

		for (int j = 0; j < blen; j++) {

			for (int i = 0; i < alen; i++) {

				c[i + j] +=  Integer.parseInt(String.valueOf(a[i]))* Integer.parseInt(String.valueOf(b[j]));

			}

		}

		int m = 0;

		// 进位处理

		for (m = 0; m < csize; m++) {

			int carry = c[m] / 10;

			c[m] = c[m] % 10;

			if (carry > 0)

				c[m + 1] += carry;

		}

		// 找到最高位

		for (m = csize - 1; m >= 0;) {

			if (c[m] > 0)

				break;

			m--;

		}

		// 由最高位开始打印乘积

		System.out.print("乘积：");

		for (int n = 0; n <= m; n++) {

			System.out.print(c[m - n]);

		}

		System.out.println("");

	}
/**
 * 大数加法
 * @param f
 * @param s
 * @return
 */
public String bigNumberAdd(String f, String s) {//大数加法

        //翻转两个字符串，并转换成数组

        char[] a = new StringBuffer(f).reverse().toString().toCharArray();

        char[] b = new StringBuffer(s).reverse().toString().toCharArray();

        int lenA = a.length;

        int lenB = b.length;

        //计算两个长字符串中的较长字符串的长度

        int len = lenA > lenB ? lenA : lenB;

        int[] result = new int[len + 1];

        for (int i = 0; i < len + 1; i++) {

            //如果当前的i超过了其中的一个，就用0代替，和另一个字符数组中的数字相加

            int aint = i < lenA ? (a[i] - '0') : 0;

            int bint = i < lenB ? (b[i] - '0') : 0;

            result[i] = aint + bint;

        }

        //处理结果集合，如果大于10的就向前一位进位，本身进行除10取余

        for (int i = 0; i < result.length; i++) {

            if (result[i] > 10) {

                result[i + 1] += result[i] / 10;

                result[i] %= 10;

            }

        }

        StringBuffer sb = new StringBuffer();

        //该字段用于标识是否有前置0，如果有就不要存储

        boolean flag = true;

        for (int i = len; i >= 0; i--) {

            if (result[i] == 0 && flag) {

                continue;

            } else {

                flag = false;

            }

            sb.append(result[i]);

        }

        return sb.toString();

    }
/**
 * 大数减法
 * @param f
 * @param s
 * @return
 */
public static String bigNumberSub(String f, String s) {

        System.out.print("减法:" + f + "-" + s + "=");

        // 将字符串翻转并转换成字符数组

        char[] a = new StringBuffer(f).reverse().toString().toCharArray();

        char[] b = new StringBuffer(s).reverse().toString().toCharArray();

        int lenA = a.length;

        int lenB = b.length;

        // 找到最大长度

        int len = lenA > lenB ? lenA : lenB;

        int[] result = new int[len];

        // 表示结果的正负

        char sign = '+';

        // 判断最终结果的正负

        if (lenA < lenB) {

            sign = '-';

        } else if (lenA == lenB) {

            int i = lenA - 1;

            while (i > 0 && a[i] == b[i]) {

                i--;

            }

            if (a[i] < b[i]) {

                sign = '-';

            }

        }

        // 计算结果集，如果最终结果为正，那么就a-b否则的话就b-a

        for (int i = 0; i < len; i++) {

            int aint = i < lenA ? (a[i] - '0') : 0;

            int bint = i < lenB ? (b[i] - '0') : 0;

            if (sign == '+') {

                result[i] = aint - bint;

            } else {

                result[i] = bint - aint;

            }

        }

        // 如果结果集合中的某一位小于零，那么就向前一位借一，然后将本位加上10。其实就相当于借位做减法

        for (int i = 0; i < result.length - 1; i++) {

            if (result[i] < 0) {

                result[i + 1] -= 1;

                result[i] += 10;

            }

        }

 

        StringBuffer sb = new StringBuffer();

        // 如果最终结果为负值，就将负号放在最前面，正号则不需要

        if (sign == '-') {

            sb.append('-');

        }

        // 判断是否有前置0

        boolean flag = true;

        for (int i = len - 1; i >= 0; i--) {

            if (result[i] == 0 && flag) {

                continue;

            } else {

                flag = false;

            }

            sb.append(result[i]);

        }

        // 如果最终结果集合中没有值，就说明是两值相等，最终返回0

        if (sb.toString().equals("")) {

            sb.append("0");

        }

        // 返回值

        System.out.println(sb.toString());

        return sb.toString();

    }

}
