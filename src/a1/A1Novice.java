//For 	int[] values = new int[count];this assignment, you shouldn't have to use any Scanner methods other than next(), nextInt(), and nextDouble().
//In particular, you should avoid using nextLine(). 
// do not worry about validating input or being able to deal w/ unexpected input
package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	// Your code follows here.
		
		int numOfCustomers = scan.nextInt();
		
		String[] customerFirst = new String[numOfCustomers];	
		String[] customerSecond = new String[numOfCustomers];
		int[] customerItemsNum = new int[numOfCustomers];
		double[] customerTotals = new double[numOfCustomers];
		
		
		
		
		for(int i=0; i < numOfCustomers; i++) {
			customerFirst[i] = scan.next();
			customerSecond[i] = scan.next();		
			customerItemsNum[i] = scan.nextInt();
				
			for(int j=0; j < customerItemsNum[i]; j++) {
				int amount = scan.nextInt();
				String item = scan.next();
				double cost = scan.nextDouble();
				customerTotals[i] += amount*cost;
			}
			System.out.println(customerFirst[i].charAt(0) + "." + " " + customerSecond[i] + ":" + customerTotals[i]);

		}
		scan.close();
		}
			
	}
		




