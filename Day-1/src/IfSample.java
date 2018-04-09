
public class IfSample {
public static void main(String[] args) {
	int x,y;
	//jsvs will not allow uninitialised variables will give compilation errors.
	//System.out.println(x);
	x=10;
	y=20;
	
	if (x>y) {
		x=x/2;
		System.out.println("x="+x);
	}
	else if (y>=x) {
		y=y/2;
		System.out.println("y="+y);
	}else if(y>x)
		System.out.println("x=y"+x+y);
	
	int a = 1, b = 2, c = 5;
	a = b = c;
   System.out.print("a= " + a + "b= " + b + "c= " + c);

}
}
