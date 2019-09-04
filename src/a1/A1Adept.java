package a1;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.

		HashMap<String, Double> itm_map = new HashMap<>();
		
		double itm_amt = scan.nextDouble();
		
		for (int i=0; i<itm_amt; i++) {
			String name = scan.next();
			double price = scan.nextDouble();
			itm_map.put(name,(double) price);
		}
		int cust_amt = scan.nextInt();
		
	
		String[][] info = new String[cust_amt][2];
		
		String[] names = new String[cust_amt];
		double[] totalsum = new double [cust_amt];
		double total = 0.0;
		for(int j=0; j<cust_amt;j++) {
			String customername = scan.next();
			customername+=" ";
			customername+=scan.next();
			names[j] = customername;
			int types = scan.nextInt();
			double sum = 0.0;
		for(int n=0; n< types; n++) {
			int amt = scan.nextInt();
			double price = itm_map.get(scan.next());
			sum += amt*price;
		}
		totalsum[j]=sum;
		total+=totalsum[j];
		}
		int min = findValueMin(totalsum);
		int max = findValueMax(totalsum);
		double avg = total/cust_amt;
		System.out.println("Biggest: "+ names[max]+" ("+String.format("%.2f",totalsum[max]) +")");
		System.out.println("Smallest: "+ names[min]+" ("+String.format("%.2f",totalsum[min]) +")");
		System.out.println("Average: "+ String.format("%.2f", avg));	
}
	static int findValueMin(double[] vals) {
		double currentmin = vals[0];
		for (int i=1; i<vals.length; i++) {
			if(vals[i]<currentmin) {
				currentmin=vals[i];
			}
		}
		int index=0;
		for(int j=0; j<vals.length; j++) {
			if(vals[j]==currentmin) {
				index=j;
				break;
			}
		}
		return index;
		
	}
	static int findValueMax(double[] vals) {
		double currentmax = vals[0];
		for (int i=1; i<vals.length; i++) {
			if(vals[i]>currentmax) {
				currentmax=vals[i];
			}
		}
		int index=0;
		for(int j=0; j<vals.length; j++) {
			if(vals[j]==currentmax) {
				index=j;
				break;
			}
		}
		return index;
		
	}
}