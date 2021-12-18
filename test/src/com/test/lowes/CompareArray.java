package com.test.lowes;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		int []a1= {1,2,3};
		int []a2= {1,2,3,4};
		boolean stst=false;
		
		if(a1.length==a2.length) {
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			for(int i=0;i<a1.length;i++) {
				
				if(a1[i]==a2[i]) {
					stst=true;
				}else
					stst=false;
			}
			
		}else {
			stst=false;
		}

	}

}





