/**
 * 
 */
package faceOffer;


import java.util.*;
/**
 * @author dell
 *
 */
public class ExArray1_3_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="abcd";
		System.out.println(Permutation(s));
	}




    public static ArrayList<String> Permutation(String str) {

       ArrayList<String> ans=new ArrayList<>();//所有排列的可能都在这里
       String[] ss=new String[str.length()];
//       StringBuilder sb=new StringBuilder();
        if(str!=null||str.length()>0){
        	for(int i=0;i<str.length();i++){
        		 StringBuilder sb=new StringBuilder();
        		 sb.append(str.charAt(i));
        		 System.out.println(sb.toString());
        		ss[i]=sb.toString();
        	}
            help(0,ss,ans);

            Collections.sort(ans);

        }

        

        return ans;

    }

    public static void help(int i,String[] cha,ArrayList<String> ans){

        if(i==cha.length-1){

//            String val = String.valueOf(cha);
            
            String str=new String();
			 for(int p=0;i<cha.length;i++){
				 str +=cha[p];
			 }
            if(!ans.contains(str)){

                ans.add(str);

            }

        }else{

            for(int j=i;j<cha.length;j++){

                swap(i,j,cha);//依次选一个数固定住

                help(i+1,cha,ans);//让后面的进行全排列

                swap(i,j,cha);//恢复原来的模样，回溯关键

            }

        }

        

    }

    public static void swap(int i,int j,String[] cha){

        String temp=cha[i];

        cha[i]=cha[j];

        cha[j]=temp;

    }

    



}
