package MyVersionOfBookExample;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CountWords extends JFrame {

	// private JPanel jpanel = new JPanel();
	private static JFrame histogramFrame = new JFrame();
	private static JButton btnShow = new JButton("Show words frequence");
	private static Histogram histogram = new Histogram();
	private static ArrayList<String> wordArrayList = new ArrayList<String>();
	private static ArrayList<Integer> numArrayList = new ArrayList<Integer>();
	private static int numCount[];
	private static String wordCount[];
	private static Set<Map.Entry<String, Integer>> set;
	static Map<String, Integer> map;

	// Create a new frame to hold the histogram panel

	public CountWords() {
		add(btnShow, BorderLayout.SOUTH);
	}

	public static void main(String[] args) throws FileNotFoundException {
		InitialFrame();
		String finalString = InitialInput();
		CountWord(finalString);
		initialArrays();
		pickTop10Words();
		btnShow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("pushed");
				histogram.showHistogram(numCount, wordCount);
				histogramFrame.setVisible(true);
			}
		});

		histogramFrame.add(histogram);
		histogramFrame.pack();
		histogramFrame.setTitle("Histogram");

		for (int i = 0; i < numCount.length; i++) {
			System.out.print(numCount[i] + " ");
			System.out.print(wordCount[i]);
			System.out.println();
		}

	}

	public static void pickTop10Words() {
		System.out.println(Collections.frequency((Collection<Map>) map, "the"));

	}

	public static void InitialFrame() {
		CountWords frame = new CountWords();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MultipleWindowsDemo");
		frame.pack();
		frame.setVisible(true);
	}

	public static String InitialInput() throws FileNotFoundException {

		Scanner input = new Scanner(new File("testFile"));
		System.out.println("read the file... ...");
		StringBuilder sb = new StringBuilder();
		while (input.hasNext()) {
			String s = input.nextLine();
			sb.append(s);
		}
		return sb.toString();
	}

	public static void CountWord(String s) {
		map = new TreeMap<String, Integer>();
		String[] words = s.split("[ ,.!\n\t()-123456789\"\']");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
			int value = 0;
			if (map.get(words[i]) == null) {
				map.put(words[i], ++value);
			} else {
				value = map.get(words[i]);
				map.put(words[i], ++value);
			}

		}
		for (int j = 0; j < words.length; j++) {
			map.get(words[j]);

		}
		set = map.entrySet();
		for (Map.Entry<String, Integer> k : set) {
			System.out.print(k.getKey() + " ");
			System.out.print(" " + k.getValue());
			System.out.println();
		}

	}

	public static int binaryFind(long[] data, long target) {
		int start = 0;
		int end = data.length - 1;
		while (start <= end) {
			int middleIndex = (start + end) / 2;
			if (target == data[middleIndex]) {
				return middleIndex;
			}
			if (target >= data[middleIndex]) {
				start = middleIndex + 1;
			} else {
				end = middleIndex - 1;
			}
		}

		return -1;

	}

	public static void initialArrays() {
		Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> k = iterator.next();
			wordArrayList.add(k.getKey());
			numArrayList.add(k.getValue());
		}
		numCount = new int[numArrayList.size()];
		wordCount = new String[wordArrayList.size()];
		for (int i = 1; i < numArrayList.size(); i++) {

			numCount[i] = numArrayList.get(i);
		}
		for (int j = 1; j < wordArrayList.size(); j++) {

			wordCount[j] = wordArrayList.get(j);
		}

	}

	/** Override getPreferredSize */
	public Dimension getPreferredSize() {
		return new Dimension(600, 300);
	}

}
