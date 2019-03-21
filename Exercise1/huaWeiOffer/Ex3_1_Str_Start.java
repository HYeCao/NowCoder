package huaWeiOffer;



import java.util.Scanner;

/**
 * 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。
 * 当然，老师有时候需要更新某位同学的成绩. 
 * @author dell
 *
 */
public class Ex3_1_Str_Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){//注意题目要求;循环输出
		int noStu=0,noDo=0;
		noStu=scanner.nextInt();//获取学生数
		noDo=scanner.nextInt();//获取操作数
		int[] score=new int[noStu];
		for(int j=0;j<noStu;j++){
			score[j]=scanner.nextInt();//获取每个学生成绩
		}
		String[] str=new String[noDo];
		int[] res=new int[noDo];
		scanner.nextLine();
		for(int i=0;i<noDo;i++){
			str[i]=scanner.nextLine();//获取每行操作
//			System.out.println(str[i]);
			res[i]=HighScore(score, str[i]);
		}
		for(int i=0;i<noDo;i++){
			if(res[i]!=0)
			System.out.println(res[i]);
		}
		}
	}
	public static int HighScore(int[] score,String Mdo){
		int std1=0,std2=0;
		if(Mdo.startsWith("Q")){
			 String[]  strs=Mdo.split(" ");
			 std1=Integer.valueOf(strs[1]);
			 std2=Integer.valueOf(strs[2]);
//			 System.out.println(std1+" "+std2);
            int x=std1;
			 if(std1>std2){
				 std1=std2;
				 std2=x;
			 }
			 int temp=0;
			 for(int i=std1-1;i<std2;i++){
				 if(temp<score[i])temp=score[i];
			 }
			 return temp;
		}
		else if(Mdo.startsWith("U")){
			String[]  strs=Mdo.split(" ");
			int std=0;
			int stdscore=0;
			 std=Integer.valueOf(strs[1]);
			 stdscore=Integer.valueOf(strs[2]);
			 score[std-1]=stdscore;
			 return 0;
		}
		return 0;
	}

}
