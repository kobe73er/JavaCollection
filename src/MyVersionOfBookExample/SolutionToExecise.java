package MyVersionOfBookExample;

import java.util.HashSet;
import java.util.Set;

public class SolutionToExecise {
	public static void main(String args[]){
		Set set1=new HashSet();
		set1.add("red");
		set1.add("yellow");
		set1.add("green");
		
		Set set2=new HashSet();
		set2.add("red");
		set2.add("yellow");
		set2.add("blue");
		
//		set1.addAll(set2);
		
//		set1.addAll(set2);
//				set1.add(set2);
//			    set1.removeAll(set2);
//				set1.remove(set2);
				set1.retainAll(set2);
		System.out.println(set1);
//		System.out.println(set1);
	}

}
