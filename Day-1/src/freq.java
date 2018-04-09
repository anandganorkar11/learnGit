import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class freq {

	public static void main(String args[]) {
		int ci, i, j, k, l = 0;
		String str, str1;
		char c, ch;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String : ");
		str = scan.nextLine();
		Set<Integer> s = new HashSet<>();
		i = str.length();
		for (c = 'A'; c <= 'z'; c++) {
			k = 0;
			for (j = 0; j < i; j++) {
				ch = str.charAt(j);
				if (ch == c) {
					k++;
				}
			}
			if (k > 0)
				s.add(k);

		}
		for (Integer p : s)
			System.out.println("val" + p);
		if (s.size() > 1) {
			System.out.println("odd");
		} else
			System.out.println("even");
	}
}
