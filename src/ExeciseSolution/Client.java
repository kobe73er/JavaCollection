package ExeciseSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> arraylist = new ArrayList<Person>();
		arraylist.add(new Person(45));
		arraylist.add(new Person(9));
		arraylist.add(new Person(33));
//		Collections.sort(arraylist, new MyComparator());
		Collections.sort(arraylist);
		for (Person p : arraylist)
			System.out.println(p.getAge());
	}

}
