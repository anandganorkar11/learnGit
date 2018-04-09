
public class Operators {
public static void main(String[] args) {
	int a=10,b=20,c=30,d=40,e=50;

	a=+b;//+considered as sign //op 20
	System.out.println("a="+a);
	System.out.println("b="+b);
	c+=d;//c=c+d //op 70
	System.out.println("c="+c);
	System.out.println("d="+d);
	
	
    
    c = ++b;// add by 1 then asign to c //op 21
    d = a++;//assign to d then add by 1  //op 20
    c++; //op 22
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
  }



}
