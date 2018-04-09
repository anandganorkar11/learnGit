import java.util.Scanner;

public class TestScanner {
		public static void main(String[] args) 
		{
			//sc
			Scanner sc=new Scanner(System.in);
			System.out.println("How many nos?");
			
			double[] data=new double[sc.nextInt()];
			System.out.println("def inited array contents");
			for(int i=0;i<data.length;i++)
				System.out.printf("%.1f ",data[i]);
			for(int i=0;i<data.length;i++) {
				System.out.println("\nEnter array data ");
				data[i]=sc.nextDouble();
			}
			System.out.println("inited array contents");
			for(int i=0;i<data.length;i++)
				System.out.printf("%.1f ",data[i]);
			//dyn init of array
			float[] floats=new float[]{10,20,40,1.345F};
			for(int i=0;i<floats.length;i++)
				System.out.printf("%.3f ",floats[i]);
			System.out.println();
			data=new double[3];
			System.out.println("array contents again");
			for(int i=0;i<data.length;i++)
				System.out.printf("%.1f ",data[i]);

		

			if(sc != null)
				sc.close();
		}
	}

