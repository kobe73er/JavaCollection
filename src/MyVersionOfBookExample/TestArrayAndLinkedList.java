package MyVersionOfBookExample;

import java.util.*;

public class TestArrayAndLinkedList {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1); // 1 is autoboxed to new Integer(1)
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);

		// System.out.println("A list of integers in the array list:");
		// System.out.println(arrayList);
		//
		// LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		// linkedList.add(1, "red");
		// linkedList.removeLast();
		// linkedList.addFirst("green");
		//
		// System.out.println("Display the linked list forward:");
		// ListIterator<Object> listIterator = linkedList.listIterator();
		// while (listIterator.hasNext()) {
		// System.out.print(listIterator.next() + " ");
		// }
		// System.out.println();
		//
		// List<String> list1 = Arrays.asList("yellow", "red", "green", "blue");
		// List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
		// Collections.shuffle(list1, new Random(20));
		// Collections.shuffle(list2, new Random(30));
		// System.out.println(list1);
		// System.out.println(list2);

		List<String> list3 = Arrays.asList("yellow", "red", "green", "blue");
		List<String> list4 = Arrays.asList("white", "black");
		Collections.copy(list3, list4);
		System.out.println(list3);

		// System.out.println("Display the linked list backward:");
		// listIterator = linkedList.listIterator(linkedList.size());
		// while (listIterator.hasPrevious()) {
		// System.out.print(listIterator.previous() + " ");
		// }

		List<GregorianCalendar> list1 = Collections.nCopies(5,
				new GregorianCalendar(2005, 0, 1));
		for (GregorianCalendar g : list1)
			System.out.println(g);

		List<String> list = Arrays.asList("red", "green", "blue");
		Collections.fill(list, "black");
		System.out.println(list);

		Collection<String> collection = Arrays.asList("red", "green", "blue");
		System.out.println(Collections.max(collection));
		System.out.println(Collections.min(collection));

		Collection<String> collection1 = Arrays.asList("red", "cyan");
		Collection<String> collection2 = Arrays.asList("red", "blue");
		Collection<String> collection3 = Arrays.asList("pink", "tan");
		System.out.println(Collections.disjoint(collection1, collection2));
		System.out.println(Collections.disjoint(collection1, collection3));

		Collection<String> c = Arrays.asList("red", "cyan", "red");
		System.out.println(Collections.frequency(c, "red"));
	}
}