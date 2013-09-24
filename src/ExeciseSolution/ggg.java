package ExeciseSolution;

import java.util.*;
import java.io.*;

public class ggg extends ArrayList{
	public static void main(String[] args) throws Exception {
		ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream("c:\\test.dat"));
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("New York");
		LinkedHashSet<String> set2 = (LinkedHashSet<String>) set1.clone();
		set1.add("Atlanta");
		output.writeObject(set1);
		output.writeObject(set2);
		output.close();
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(
				"c:\\test.dat"));
		set1 = (LinkedHashSet) input.readObject();
		set2 = (LinkedHashSet) input.readObject();
		System.out.println(set1);
		System.out.println(set2);
		output.close();
	}
}