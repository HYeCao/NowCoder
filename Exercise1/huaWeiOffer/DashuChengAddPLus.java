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

 

		// �ߵ�λ�Ե�

		covertdata(s1, len1);

		covertdata(s2, len2);

 

		System.out.println("������"+str1);

		System.out.println("������"+str2);

		multiply(s1, len1, s2, len2);

 

	}

 

	public static void covertdata(char data[], int len) {

		//�ߵ�λ�Ե�

		for (int i = 0; i < len / 2; i++) {

			data[i] += data[len - 1 - i];

			data[len - 1 - i] = (char) (data[i] - data[len - 1 - i]);

			data[i] = (char) (data[i] - data[len - 1 - i]);

		}

	}

 

	public static void multiply(char a[], int alen, char b[], int blen) {

		// �����˻�λ�����ᳬ������λ����+ 3λ

		int csize = alen + blen + 3;

		// ���ٳ˻�����

		int[] c = new int[csize];

		// �˻��������0

		for (int ii = 0; ii < csize; ii++) {

			c[ii] = 0;

		}

		// ������λ���

		for (int j = 0; j < blen; j++) {

			for (int i = 0; i < alen; i++) {

				c[i + j] +=  Integer.parseInt(String.valueOf(a[i]))* Integer.parseInt(String.valueOf(b[j]));

			}

		}

		int m = 0;

		// ��λ����

		for (m = 0; m < csize; m++) {

			int carry = c[m] / 10;

			c[m] = c[m] % 10;

			if (carry > 0)

				c[m + 1] += carry;

		}

		// �ҵ����λ

		for (m = csize - 1; m >= 0;) {

			if (c[m] > 0)

				break;

			m--;

		}

		// �����λ��ʼ��ӡ�˻�

		System.out.print("�˻���");

		for (int n = 0; n <= m; n++) {

			System.out.print(c[m - n]);

		}

		System.out.println("");

	}
/**
 * �����ӷ�
 * @param f
 * @param s
 * @return
 */
public String bigNumberAdd(String f, String s) {//�����ӷ�

        //��ת�����ַ�������ת��������

        char[] a = new StringBuffer(f).reverse().toString().toCharArray();

        char[] b = new StringBuffer(s).reverse().toString().toCharArray();

        int lenA = a.length;

        int lenB = b.length;

        //�����������ַ����еĽϳ��ַ����ĳ���

        int len = lenA > lenB ? lenA : lenB;

        int[] result = new int[len + 1];

        for (int i = 0; i < len + 1; i++) {

            //�����ǰ��i���������е�һ��������0���棬����һ���ַ������е��������

            int aint = i < lenA ? (a[i] - '0') : 0;

            int bint = i < lenB ? (b[i] - '0') : 0;

            result[i] = aint + bint;

        }

        //���������ϣ��������10�ľ���ǰһλ��λ��������г�10ȡ��

        for (int i = 0; i < result.length; i++) {

            if (result[i] > 10) {

                result[i + 1] += result[i] / 10;

                result[i] %= 10;

            }

        }

        StringBuffer sb = new StringBuffer();

        //���ֶ����ڱ�ʶ�Ƿ���ǰ��0������оͲ�Ҫ�洢

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
 * ��������
 * @param f
 * @param s
 * @return
 */
public static String bigNumberSub(String f, String s) {

        System.out.print("����:" + f + "-" + s + "=");

        // ���ַ�����ת��ת�����ַ�����

        char[] a = new StringBuffer(f).reverse().toString().toCharArray();

        char[] b = new StringBuffer(s).reverse().toString().toCharArray();

        int lenA = a.length;

        int lenB = b.length;

        // �ҵ���󳤶�

        int len = lenA > lenB ? lenA : lenB;

        int[] result = new int[len];

        // ��ʾ���������

        char sign = '+';

        // �ж����ս��������

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

        // ����������������ս��Ϊ������ô��a-b����Ļ���b-a

        for (int i = 0; i < len; i++) {

            int aint = i < lenA ? (a[i] - '0') : 0;

            int bint = i < lenB ? (b[i] - '0') : 0;

            if (sign == '+') {

                result[i] = aint - bint;

            } else {

                result[i] = bint - aint;

            }

        }

        // �����������е�ĳһλС���㣬��ô����ǰһλ��һ��Ȼ�󽫱�λ����10����ʵ���൱�ڽ�λ������

        for (int i = 0; i < result.length - 1; i++) {

            if (result[i] < 0) {

                result[i + 1] -= 1;

                result[i] += 10;

            }

        }

 

        StringBuffer sb = new StringBuffer();

        // ������ս��Ϊ��ֵ���ͽ����ŷ�����ǰ�棬��������Ҫ

        if (sign == '-') {

            sb.append('-');

        }

        // �ж��Ƿ���ǰ��0

        boolean flag = true;

        for (int i = len - 1; i >= 0; i--) {

            if (result[i] == 0 && flag) {

                continue;

            } else {

                flag = false;

            }

            sb.append(result[i]);

        }

        // ������ս��������û��ֵ����˵������ֵ��ȣ����շ���0

        if (sb.toString().equals("")) {

            sb.append("0");

        }

        // ����ֵ

        System.out.println(sb.toString());

        return sb.toString();

    }

}
