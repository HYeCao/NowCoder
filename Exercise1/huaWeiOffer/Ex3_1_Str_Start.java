package huaWeiOffer;



import java.util.Scanner;

/**
 * ��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ�
 * ��Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�. 
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
		while(scanner.hasNext()){//ע����ĿҪ��;ѭ�����
		int noStu=0,noDo=0;
		noStu=scanner.nextInt();//��ȡѧ����
		noDo=scanner.nextInt();//��ȡ������
		int[] score=new int[noStu];
		for(int j=0;j<noStu;j++){
			score[j]=scanner.nextInt();//��ȡÿ��ѧ���ɼ�
		}
		String[] str=new String[noDo];
		int[] res=new int[noDo];
		scanner.nextLine();
		for(int i=0;i<noDo;i++){
			str[i]=scanner.nextLine();//��ȡÿ�в���
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
