package com.test.lowes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCombinationsWithSumKFromNumberN {

    public void findCombinations(int N, int K){
        System.out.println("Given Number: " + N + ", required sum K: " + K);
        List<Integer> combinationList = new ArrayList<>();
        combinationUtil(N, K, 0, 0, combinationList);
        Map<String,String> f=new HashMap<>(3);
    }

    public void combinationUtil(int N , int sum, int currSum, int startNumber, List<Integer> combinationList){

        if(currSum==sum) {
            System.out.println(combinationList);
            return;
        }

        for (int i = startNumber; i <=N ; i=i+2) {
            if(currSum+i>sum)
                break;
            combinationList.add(i);
            combinationUtil(N, sum, currSum + i, i, combinationList);
            combinationList.remove(combinationList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int N = 8;
        int K =10;
        FindCombinationsWithSumKFromNumberN f = new FindCombinationsWithSumKFromNumberN();
        f.findCombinations(N, K);
    }
}