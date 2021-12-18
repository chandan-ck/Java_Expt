package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMutableKey
{
    public static void main(String[] args)
    
    {
    	
    	List<Account> accountList=new ArrayList<>();
    	Set<Account> accountSet=new HashSet<>();
        //Create a HashMap with mutable key
        HashMap<Account, String> map = new HashMap<Account, String>();
          
        //Create key 1
        Account a1 = new Account(1);
        a1.setHolderName("A_ONE");
        //Create key 2
        Account a2 = new Account(2);
        a2.setHolderName("A_TWO");
        
        Account a4 = new Account(2);
        a4.setHolderName("A_FOUR");
          
        //Put mutable key and value in map
        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());
        map.put(a4, a4.getHolderName());
        
        accountList.add(a1);
        accountList.add(a2);
        accountList.add(a4);
        
        accountSet.add(a1);
        accountSet.add(a2);
        accountSet.add(a4);
        System.out.println("map---"+map);
        System.out.println("accountList---"+accountList);
        System.out.println("accounset---"+accountSet);
          
        //Change the keys state so hash map should be calculated again
        a1.setHolderName("Defaulter");
        a2.setHolderName("Bankrupt");
          
        //Success !! We are able to get back the values
        System.out.println(map.get(a1)); //Prints A_ONE
        System.out.println(map.get(a2)); //Prints A_TWO
          
        //Try with newly created key with same account number
        Account a3 = new Account(1);
        a3.setHolderName("A_THREE");
          
        //Success !! We are still able to get back the value for account number 1
        System.out.println(map.get(a3)); //Prints A_ONE
    }
}