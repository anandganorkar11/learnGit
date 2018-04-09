import java.util.Scanner;

public class InputScanner {
public static void main(String[] args) {
	//Accept 2 numbers as command line arguments from user. If user supplies less than 2 arguments supply error message & terminate. . If all correct, compute avarage & display the same.
	//2. Redo above assignement by replacing command line arguments by user inputs via scanner. If arguments are not numbers , supply error message & terminate.
	
	int a;
	int b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	a=(int) sc.nextFloat();
	b=sc.nextInt();
	float c=a+b;
	System.out.println("c="+c);
	sc.close();
}
}
