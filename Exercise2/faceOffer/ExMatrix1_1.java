/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ������
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 *       �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author dell
 *
 */
public class ExMatrix1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		System.out.println(matrix[1].length);
		printMatrix(matrix);
	}
	/**
	 * ����һ�����趨������������ʵ��
	 *        ��ʼ��������ʼ��������ֹ��������ֹ����
	 * ������������������а������
	 * @param matrix
	 * @return
	 */
	 public static ArrayList<Integer> printMatrix(int [][] array) {
			    ArrayList<Integer> result = new ArrayList<Integer> ();        
			    if(array.length==0) return result;        
			    int n = array.length,m = array[0].length;        
			    if(m==0) return result;        
			    int layers = (Math.min(n,m)-1)/2+1;//����ǲ���        ����������̱ߵĶԽ���Ϊ��׼�ģ����磨0��0��,(1,1)...��ֻȡһ�롣
			                                      //               ֮����-1��+1���Խ���Ԫ�ظ���Ϊ����ʱ�򣬻���ָ�0.5�㣬��Ҫ��Ϊ1
			    for(int i=0;i<layers;i++){            
			    	for(int k = i;k<m-i;k++) result.add(array[i][k]);//������           
			    	for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//����������            
			    	for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//������            
			    	for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//����������       
			    	}      
			    return result; 
			    }
	    }

