package com.test;

import java.util.ArrayList;
import java.util.List;

public class Slotmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> history =new ArrayList<>();
		history.add("712");
		history.add("246");
		history.add("365");
		history.add("312");
		System.out.println(slotWheels(history,3));
	}
	public static int slotWheels(List<String> history, int length2) {/*
        int sum =0;
        for(int k=0;k<3;k++){
            int highest =0;
            System.out.println(highest);
            for(int i=0;i<history.size();i++){
                char ch = history.get(i).charAt(0);
                String str ="";
                for(int j=1;j<history.get(i).length();j++){
                    if(ch>history.get(i).charAt(j)){
                        str = str + history.get(i).charAt(j);
                    }else{
                        str = str+ch;
                        ch= history.get(i).charAt(j);
                    }                    
                }
                history.set(i, str);
                if(highest<(int)ch){
                    highest = ch;
                }
                str = "";
            }
            sum = sum+highest;
        }
    return sum;
    */
		int length=length2;
	for(int j=0;j<3;j++) {
		
	
		for(String s:history) {
			
			
			char highestch1 = 0;
			int higest1=0;
			char highdig1=getHighestdigit(s);
			//higest1=highdig1;
			//if(higest1 >  )
			System.out.println(highdig1);
			
			replace (history,highdig1,length);
			slotWheels(history,length);
			}
	}
		length--;
		System.out.println("-length--"+length);
	
		System.out.println("---"+history);
	
	return 02656;
	}
	private static void replace(List<String> history, char highdig1, int length) {
		// TODO Auto-generated method stub
		
		List<String> replacedhistory =new ArrayList<>();
		for(int i=0;i<history.size();i++) {
			String s=history.get(i);
			System.out.println("-length size--"+s.length());
			if(length==s.length()) {
			s=s.replace(highdig1+"", "");
			
			history.set(i, s);
			//replacedhistory.add(s);
			}
		}
		System.out.println(history);
		//return 
	}
	private static char getHighestdigit(String s) {
		// TODO Auto-generated method stub
		int higest=0;
		char highestch = 0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int ascii=ch;
			if(ascii >higest) {
				highestch=ch;
				higest=ascii;
			}
		}
		
		return highestch;
	}
}
