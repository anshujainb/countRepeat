import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RepeatCount {
	public static Map<Character,Integer> countRpt(String str){
		
		char[] charArr=str.replace(" ", "").toCharArray();
		Set<Character> countArr=new HashSet<Character>();
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		int ptr2=charArr.length-1,count=1;
		for(int i=0;i<charArr.length;i++){
		if(!(countArr.contains(charArr[i]))|| countArr.isEmpty()){
			while(ptr2>i){
				
				if(charArr[i]==charArr[ptr2]){
					count++;
				}
				ptr2--;
			}
			ptr2=charArr.length-1;
			countArr.add(charArr[i]);
			countChar.put(charArr[i], count);
			
		}
		count=1;
		}
		return countChar;
		
	}
	
	public static void main(String[] args) {
		Map<Character,Integer> result=countRpt("aanshu jain");
		Iterator iterator = result.keySet().iterator();
		while (iterator.hasNext()) {
		   Character key = (Character)iterator.next();
		   int value = result.get(key);
		   System.out.println(key + " " + value);
		}
	}

}
