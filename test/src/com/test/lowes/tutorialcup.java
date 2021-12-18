package com.test.lowes;
import java.util.*; 
import java.io.*;
class tutorialcup
{
    // function to find all combinations of 
    // elements of an array that add upto a given sum
    static void findCombination(ArrayList<Integer> arr, int sum, 
            ArrayList<ArrayList<Integer>> result, 
            ArrayList<Integer> vec, int i) 
    { 
      // sum of elements in vec becomes greater than original sum
      if (sum < 0) 
        return; 
    
      // sum of elements in vec is exactly equal to original sum
      if (sum == 0) 
      { 
          // add that particular combination to result
        result.add(new ArrayList<Integer>(vec)); 
        return; 
      } 
    
      // recur for all remaining elements that 
      // have value smaller than original sum. 
      while (i < arr.size() && sum-arr.get(i) >= 0) 
      { 
    
        // add every element of the array to the vec starting from i
        // that adds/contributes to 'sum'
        vec.add(arr.get(i)); 
    
        // recur to adding arr[i] to vec
        // if it contributes to 'sum'
        findCombination(arr, sum - arr.get(i), result, vec, i); 
        
        // move to next element in case 
        // sum of elements becomes greater than 
        // or equal to the required sum
        i++; 
    
        // remove the last number from the combination list
        // to add next element(basically backtracking)
        vec.remove(vec.size()-1); 
      } 
    } 
    
    // Returns all combinations of arr[] that have given sum. 
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum) 
    { 
      // sort input array 
      Collections.sort(arr); 
    
      // remove duplicates 
      // create an array to add all the unique elements to it
      ArrayList <Integer> uniq = new ArrayList<Integer>();
      // create a set to check whether an element 
      // has been added to unique array or not
      HashSet <Integer> hs = new HashSet <Integer>();
        for(int i=0;i<arr.size();i++)
        {
            if(hs.contains(arr.get(i)) == false)
            {
                hs.add(arr.get(i));
                uniq.add(arr.get(i));
            }
        }
        
        // copy the unique array back to original array
        arr = uniq;
        
        // to store a unique combination
      ArrayList <Integer> vec = new ArrayList <Integer>(); 
      // stores all the unique combinations
      ArrayList <ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      findCombination(arr, sum, result, vec, 0); 
    
      return result; 
    } 
    // implementing above function
    public static void main(String args[])
    {
        ArrayList <Integer> arr = new ArrayList <Integer> (Arrays.asList(0,2,4,6,8));
      int n = arr.size(); 
    
      int sum = 8; 
      ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
      result = combinationSum(arr, sum); 
    
      // If result vector is empty
      // no combinations of array elements with given sum exist
      if (result.isEmpty()) 
      { 
          System.out.println("No such combination found"); 
        return; 
      } 
    
      
        for(int i=0;i<result.size();i++)
            System.out.println(result.get(i));
               
    }
    
}