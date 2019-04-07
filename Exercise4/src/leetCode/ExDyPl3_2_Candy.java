/**
 * 
 */
package leetCode;

import java.util.*;

/**
 * ��N������վ��һ�š� Ϊÿ�����ӷ���һ������ֵ��
 * ������Ϊ��Щ�����ṩ�ǹ�����������Ҫ��
 * ÿ�����ӱ���������һ���ǹ���
 * ���ֽϸߵĶ�ͯ��õ��ǹ������ھӡ�
 * �������������ǹ��Ƕ��٣�
 * @author dell
 *
 */
public class ExDyPl3_2_Candy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rat={1,2};
		candy(rat);
	}
	/**
	 * ˼·������һ�飬Ȼ��������ȼ������б������������ǹ��Ķ���
	 * ��̬�滮��˼·Ҫ���
	 * @param ratings
	 * @return
	 */
	public static int candy(int[] ratings) {
		if(ratings.length==1)return 1;
		int[] child=new int[ratings.length];
		child[0]=1;
	    for(int i=1;i<ratings.length;i++){//�����ҽ��б������趨ֵ
			if(ratings[i]>ratings[i-1]){//�����ȼ���������ٽ���Ԫ�����ȼ�
				child[i]=child[i-1]+1;
			}
			else if(ratings[i]<ratings[i-1]){
				if(child[i-1]==1){
				child[i-1]+=1;
				}
				child[i]=1;
			}
			else if(ratings[i]==ratings[i-1]){
				child[i]=1;
			}
		}
	    int min=child[ratings.length-1];
	    for(int i=ratings.length-2;i>=0;i--){//���ҵ�������ظ�����������ֵ���޸�
	    	if(ratings[i]>ratings[i+1]){//�����ȼ���������ٽ���Ԫ�����ȼ�
				if(child[i]==child[i+1]){
					child[i]+=1;
				}
				min+=child[i];
			}
			else {
				min+=child[i];
			}
	    }
	    if(ratings[ratings.length-1]>ratings[ratings.length-2]){
	    	child[ratings.length-1]=child[ratings.length-2]+1;
	    }
		return min;    
    }
	/*
	 * �˴�ȷ��ֵ�������⣺����һ��λ��ȷ���ǹ�ʱ��Ҫ��ǰһ�����е���
	 * �ؼ���ÿ����һ��ֵʱ���������ǹ��������ӻ����
	 */
	/*
	  public int candy(int[] ratings) {
	        if(ratings==null || ratings.length==0) {
	            return 0;
	        }
	         
	        int[] count = new int[ratings.length];
	        //ÿ�����ӳ�ʼ����һ���ǹ�
	        Arrays.fill(count,1);
	        int sum = 0;
	        for(int i=1;i<ratings.length;i++) {
	        ////��������ɨ�裬��֤һ�������Ϸ���������ǹ�����
	            if(ratings[i]>ratings[i-1]) {
	                count[i] = count[i-1]+1;
	            }
	        }
	         
	        for(int i=ratings.length-1;i>0;i--) {
	        //��������ɨ�裬��֤��һ�������Ϸ���������ǹ�����
	            sum+=count[i];
	            if(ratings[i]<ratings[i-1] && count[i]>=count[i-1]) {
	                count[i-1] = count[i]+1;
	            }
	        }
	        sum+=count[0];
	         
	        return sum;
	    }
	    */
}
