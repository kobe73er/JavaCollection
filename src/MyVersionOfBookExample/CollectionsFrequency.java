package MyVersionOfBookExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsFrequency {
	static Map<String, Integer> m;

	// @SuppressWarnings("unchecked")
	// public static void main(String[] args) {
	//
	// String text =
	// "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
	//
	// List<String> list = new ArrayList<String>();
	// list.addAll(Arrays.asList(text.split(" ")));
	//
	// Set<String> uniqueWords = new HashSet<String>(list);
	// for (String word : uniqueWords) {
	// System.out.println(word + ": " + Collections.frequency(list, word));
	// // System.out.println(word);
	// }
	// }
	public static void main(String[] args) {
		String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
		List<String> list = Arrays.asList(text.split(" "));

		// for (String s : list)
		// System.out.print("s=>" + s + " ");
		// Set<String> stringHashSet = new HashSet<String>(list);
		// for (String word : stringHashSet)
		// System.out.println(word + "=>" + Collections.frequency(list, word));

		m = new HashMap<String, Integer>();
		m.put("d", 45);
		m.put("t", 35);
		m.put("e", 15);
		m.put("q", 5);
		m.put("h", 456);
		m.put("m", 65);

		Map m1=sortByValue(m);
		System.out.println(m1);

	}

	public static Map sortByValue(Map map) {

		// 将键值赌赢的entryset放到链表中
		List list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {

			// 将链表按照值得从大到小进行排序
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		
		System.out.println(list);

		Map result = new LinkedHashMap();

		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}
