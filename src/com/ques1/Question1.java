package com.ques1;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Merchandise implements Comparable<Merchandise> {
		private String itemCode;
		private int qty;
		private double unitPrice;
	
	
	
		public String getItemCode() {
		return itemCode;
		}
	
	
	
		public void setItemId(String itemCode) {
		this.itemCode = itemCode;
		}
	
	
	
		public int getQty() {
		return qty;
		}
	
	
	
		public void setQty(int qty) {
		this.qty = qty;
		}
	
	
	
		public double getPrice() {
		return unitPrice;
		}
		
		
		
		public void setPrice(double price) {
		this.unitPrice = price;
		}
	
	
		
		public Merchandise(String itemCode, int qty, double price) {
		super();
		this.itemCode = itemCode;
		this.qty = qty;
		this.unitPrice = price;
		}
	
	
		
		@Override
		public int compareTo(Merchandise arg0) {
		// TODO Auto-generated method stub
		return this.itemCode.compareTo(arg0.itemCode);
		}
	
	
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "ItemCode: " + itemCode + "   Quantity: " + qty + "   Price per Unit: " + unitPrice;
		}
	}
	
	
	
	class priceComparator implements Comparator<Merchandise> {
		
		@Override
		public int compare(Merchandise arg0, Merchandise arg1) {
		// TODO Auto-generated method stub
		return (int) (arg0.getPrice() - arg1.getPrice());
		}

	}

		public class Question1 {
		public static void main(String[] args) {
		
		java.util.List<Merchandise> list = new ArrayList<>();

		File file = new File("foo.txt");
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(file));
			String s = null;
			while ((s = br.readLine()) != null) {
				String str[] = s.split(" ");
				Merchandise i = new Merchandise(str[0], Integer.parseInt(str[1]), Double.parseDouble(str[2]));
				list.add(i);
			}
		}
		catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		} 
		catch (IOException ex2) {
			ex2.printStackTrace();
		}


		
		
		Collections.sort(list);
		System.out.println("Sorted According to Names: ");
		for (Merchandise mer : list) {
		System.out.println(mer);
		}

		System.out.println("------------------------------------------------");
		

		Collections.sort(list, new priceComparator());
		System.out.println("List in Descending Order: ");
		for (Merchandise mer : list) {
		System.out.println(mer);
		}
		}
	
}
