/**
 * 
 */
package huaWeiOffer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author dell
 *
 */
/*
 * 1.增强for循环
for(String str : list) {//其内部实质上还是调用了迭代器遍历方式，这种循环方式还有其他限制，不建议使用。
    System.out.println(str);
}
2.普通for循环
for( int i = 0 ; i < list.size() ; i++) {//内部不锁定，效率最高，但在多线程要考虑并发操作的问题。
    System.out.println(list.get(i));
}
3.迭代器遍历
Iterator<String> iter = list.iterator();
while(iter.hasNext()){  //执行过程中会执行数据锁定，性能稍差，若在循环过程中要去掉某个元素只能调用iter.remove()方法。
    System.out.println(iter.next());
}
 */

public class Ex4_1_1_input {           
	public static void main(String[] args) {                
		Scanner in = new Scanner(System.in);
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();//LinkedHashMap而不是hashmap！！！！！        
		String key;        
		String filename;        
		String path;        
		while(in.hasNext()){            
			path = in.next();            //将路径转换为文件名           
			int id = path.lastIndexOf('\\');            //如果找不到说明只有文件名没有路径  
			filename = id<0  ? path : path.substring(id+1);             
			int linenum = in.nextInt();            //统计频率            
			key = filename+" "+linenum;           
			if(map.containsKey(key)){                
				map.put(key, map.get(key)+1);            }
			else{                
				
				map.put(key, 1);           
				}        
			}                 
		in.close();                 //对记录进行排序       
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());        
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){            //降序            @Override            
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {               
				return(arg1.getValue()-arg0.getValue()) == 0? (arg0.getValue()-arg1.getValue()) : (arg1.getValue()-arg0.getValue());          
				}        });        //只输出前8条        
		int m=0;        
		for(Map.Entry<String, Integer> mapping : list){           
			m++;           
			if(m<=8){             
				String[] str = mapping.getKey().split(" ");          
				String k = str[0].length()>16 ? str[0].substring(str[0].length()-16) : str[0];        
				String n = str[1];             
				System.out.println(k+" "+n+" "+mapping.getValue());      
				}else{           
					break;          
					}               
			}           
		} 
	}
	