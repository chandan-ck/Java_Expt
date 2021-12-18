package com.test.lowes;

import java.util.Arrays;

public class MaxProfit {

	public static void main(String[] args) {
		
		int []stocks={100, 180, 260, 310, 40, 535, 695};
		
		//Arrays.sort(stocks);
		
		int max=0;
		int min=0;
		
		
		int maxProfit=0;
		for(int i=0;i<stocks.length;i++) {
			
		/*	if(stocks[i]<max) {
				max=
			}
				*/
			
			for(int j=i+1;j<stocks.length;j++) {
				
				int profit=(stocks[j]-stocks[i]);
				
				if(profit>maxProfit)
					maxProfit=profit;
			}
		}
		
		
		System.out.println(maxProfit);
	}

}
