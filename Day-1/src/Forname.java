public class Forname {
	public static void main(String[] args) {
		try {
			Class abc = Class.forName("Demo");
			abc.newInstance();
			abc.getDeclaredConstructor(int.class, int.class).newInstance(10, 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Demo {
	int p;
	int q;
	public Demo() {
		System.out.println("in constructor");
	}
	public Demo(int p, int q) {
		System.out.println("in parameterised constructor");
	}
}