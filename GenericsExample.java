import java.util.*;
public class GenericsExample {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	list.add("hello");
	String s;
	s = list.get(0);
	System.out.println(s);	
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("Bill", 40);
	map.put("Jack", 35);
	System.out.println(map.get("Jack"));
	
}
}
