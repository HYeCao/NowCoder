/**
 * 
 */
package leetCode;

import java.util.*;

/**
 * 有N个孩子站成一排。 为每个孩子分配一个评级值。
 * 您正在为这些孩子提供糖果，符合以下要求：
 * 每个孩子必须至少有一个糖果。
 * 评分较高的儿童获得的糖果多于邻居。
 * 你必须给予的最低糖果是多少？
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
	 * 思路：遍历一遍，然后根据优先级进行判别，来决定给的糖果的多少
	 * 动态规划，思路要清楚
	 * @param ratings
	 * @return
	 */
	public static int candy(int[] ratings) {
		if(ratings.length==1)return 1;
		int[] child=new int[ratings.length];
		child[0]=1;
	    for(int i=1;i<ratings.length;i++){//从左到右进行遍历，设定值
			if(ratings[i]>ratings[i-1]){//当优先级大于左边临近得元素优先级
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
	    for(int i=ratings.length-2;i>=0;i--){//从右到左进行重复遍历，进行值得修改
	    	if(ratings[i]>ratings[i+1]){//当优先级大于左边临近得元素优先级
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
	 * 此处确定值存在问题：在下一个位置确定糖果时需要对前一个进行调整
	 * 关键：每增加一个值时对于整体糖果数的增加或调整
	 */
	/*
	  public int candy(int[] ratings) {
	        if(ratings==null || ratings.length==0) {
	            return 0;
	        }
	         
	        int[] count = new int[ratings.length];
	        //每个孩子初始都有一个糖果
	        Arrays.fill(count,1);
	        int sum = 0;
	        for(int i=1;i<ratings.length;i++) {
	        ////从左向右扫描，保证一个方向上分数更大的糖果更多
	            if(ratings[i]>ratings[i-1]) {
	                count[i] = count[i-1]+1;
	            }
	        }
	         
	        for(int i=ratings.length-1;i>0;i--) {
	        //从右向左扫描，保证另一个方向上分数更大的糖果更多
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
