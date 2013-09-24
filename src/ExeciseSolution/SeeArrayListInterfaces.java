package ExeciseSolution;

import java.util.ArrayList;

public class SeeArrayListInterfaces extends ArrayList {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class c = Class.forName("java.lang.Double");
		while (c!= null) {
			Class[] classInterfaces = c.getInterfaces();
			for (Class s : classInterfaces)
				System.out.println(s);
//			System.out.println(c);
			c=c.getSuperclass();

		}
	}

}
