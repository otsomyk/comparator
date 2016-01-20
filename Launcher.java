package comparator;

import java.util.*;

public class Launcher {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("J");
		strList.add("C");
		strList.add("E");
		strList.add("D");
		strList.add("Y");
		strList.add("A");
		strList.add("B");
		strList.add("Z");
		strList.add("F");
		strList.add("X");

		Collections.sort(strList, new Comparator());
		System.out.println(strList);

	}

}
