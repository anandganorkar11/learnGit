import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class frequency {
	public static void main(String[] args) {
		
	
	HashMap<Character, Integer> map = new HashMap<>();
	
	String str="aabbcabc";
	
	for(int i = 0;i<str.length();i++)
	{
		char c=str.charAt(i);
		Integer val = map.get(c);
		if(val!= null) {
			map.put(c, new Integer(val+1));
			System.out.println(c+ "--"+(val+1));
		}
		else
			map.put(c, 1);
	}
	Set<Integer> s=new HashSet<Integer>(map.values());
	for (Integer p : s)
		System.out.println("val" + p);
	if (s.size() > 1) {
		System.out.println("odd");
	} else
		System.out.println("even");
	
	}

	@Override
	public String toString() {
		return "frequency []";
	}
}
