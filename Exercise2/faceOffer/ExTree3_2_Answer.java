package faceOffer;

import java.util.ArrayList;

public class ExTree3_2_Answer {
	public class Solution {
	    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
	        if(root==null)
	            return arr;
	        ArrayList<Integer> a1=new ArrayList<Integer>();
	        int sum=0;
	        pa(root,target,arr,a1,sum);
	        return arr;
	    }
	    public void pa(TreeNode root,int target,ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> a1,int sum){
	        if(root==null)
	            return ;
	        sum+=root.val;
	        
	        if(root.left==null&&root.right==null){
	            if(sum==target)
	                { a1.add(root.val);
	                arr.add(new ArrayList<Integer>(a1));
	                a1.remove(a1.size()-1);
	               
	            }
	          return ;
	             
	        }
	         
	         a1.add(root.val);
	         pa(root.left,target,arr,a1,sum);
	        pa(root.right,target,arr,a1,sum);
	        a1.remove(a1.size()-1);     
	         
	    } 
	}
}
