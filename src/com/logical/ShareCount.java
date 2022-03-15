package com.logical;

public class ShareCount {
	public static void main(String[] args) {
		/* Sahre Count */
		double[] old = { 110.80, 355.54, 74.75, 352.85, 19.50, 28.05,93,186.50,158.75,26.45};
		double[] New = { 116.17, 357.35, 75.10, 358.90, 22.95, 28.80,91.20, 188.45,161.85,28.05};
		double[] Quantitiy = new double[old.length];
		int shareCount = 0;
		int sharePrice = 0;
		float totalProfit = 0;
		for (int i = 0; i < old.length; i++) {

			for (int j = 1; j < 1500; j++) {
				if (old[i] * j < 1200) {
					shareCount += 1;
				}
				// 10.42 * 95 = 989.9 11.42 * 95 = 1084.9 1084.9-989.9 = 95 Rs profit

			}
			Quantitiy[i] = shareCount;
			double OldTotalPrice = old[i] * shareCount;
			double NewTotalPrice = New[i] * shareCount;
			float profit = (float) (NewTotalPrice - OldTotalPrice);
			System.out.println(" Old: " + old[i] + "  * " + Quantitiy[i] + " = " + old[i] * Quantitiy[i] + " \n New: "
					+ New[i] + " * " + Quantitiy[i] + " = " + New[i] * Quantitiy[i] + " Profit: " + profit);
			
			shareCount = 0;
			totalProfit+=profit;
		}
		
		System.out.println("Total Profit Is: "+totalProfit+" Rs");
		System.out.println("Percentage: "+(float)(totalProfit*100/10000)+"%");

	}
}
