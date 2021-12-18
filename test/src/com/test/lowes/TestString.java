package com.test.lowes;

public class TestString {

	public static void main(String[] args) {
		
		String givenString="abcdefghi";
		String inStr="di";
		
		
		boolean status=false;
		int inpLength=inStr.length();
		
		if(givenString.length()>inpLength) {
			for(int i=0;i<givenString.length();i++) {
				
				char ch=givenString.charAt(i);
				
				if(ch==inStr.charAt(0)) {
					
					for(int j=0;j<inpLength && i+inpLength<givenString.length() ;j++) {
						if(givenString.charAt(i+j)==inStr.charAt(j)) {
							status=true;
						}
					}
				}
			}
		}
		System.out.println(status);
		
	}

}
