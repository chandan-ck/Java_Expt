package com.test.lowes;
// Java code for
// the above approach
import java.util.*;
class GFG1{
	private static String largestString(String input, int k)

	{
		char[] charArray=input.toCharArray();
		List<Character>resultArray=new LinkedList<Character>();
		Map<Character,Integer> referenceMap=new HashMap<Character,Integer>();
		
		
		//1. Put all the elements and their occurence in a map
		for(int i=0;i<input.length();i++)
		{
			referenceMap.put(charArray[i], referenceMap.getOrDefault(charArray[i], 0)+1);
			
		}
		
		//To get the distinct elements , add the key set to an array
		Character[] tempArray= new Character[referenceMap.keySet().size()];
		referenceMap.keySet().toArray(tempArray);
		//Sort the array
		Arrays.sort(tempArray);
		int temp=0;int addedCount=0;
		
		//Loop over the array of distinct elements(Form last to zero index)
		for(int i=tempArray.length-1;i>0;i--)
		{
			//keep track of occurence of character in result array using addedCount
			addedCount=0;
			//Check if the remaining occurance of the character is greater than zero
			//else can't add the character to the result string
			if(referenceMap.get(tempArray[i])!=0)
			{
			

			while(referenceMap.get(tempArray[i])!=0)
			{

				//If added count is multiples of k, check if any next element is there,
				//if it is there add the next element and continue, 
				
				if(addedCount%k==0&&addedCount!=0)
				{
					int nextElement=1;
					while(i-nextElement>=0)
					{
						if(referenceMap.get(tempArray[i-nextElement])>0)
						{
							resultArray.add(tempArray[i-nextElement]);
							referenceMap.put(tempArray[i-nextElement], referenceMap.get(tempArray[i-nextElement])-1);
							break;
						}
						else
						{
							nextElement++;
						}
					}
					//If there are no next elements delete all remaining occurences and break the inner loop
					if(i-nextElement<0)
					{
					referenceMap.put(tempArray[i], 0);
					break;
					}
					
				}

				resultArray.add(tempArray[i]);
				addedCount++;
				referenceMap.put(tempArray[i], referenceMap.get(tempArray[i])-1);

			}
		}
		}
		
		
		String ss="";
		for(Character s: resultArray)
			ss.concat(s+"");
		System.out.println(ss);
		return(ss);
	}
	
	public static void main(String[] args) {
		largestString("yuzzvuyzpv", 1); //output : ccbca
		
		
	}
}

// This code is contributed by shikhasingrajput
