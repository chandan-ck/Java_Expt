package com.test.lowes;
import java.util.ArrayList;

//This is an implementation of the Unbounded knapsack problem 
//Runtime is O(KC) where K is the number of items and C the maximum weight of the bag
public class UnboundedKnapsack {
    public static ArrayList<Integer> unboundedKnapsack(int[] v, int[] w,
            int c) {
        int[] maxValues = new int[c + 1]; //stores the optimal values for the weights 0,..,c
        int[] lastSelected = new int[c + 1];
        lastSelected[0] = -1; //stores the index of the last collected item in the optimal soltuion of weights 0,...,c    
        for (int i = 1; i <= c; i++) {
            //compute the optimal solution for the weight i. For every iteration (new incrementation of weight), we can add any of the items
            int index = lastSelected[i - 1];
            int maxValue = maxValues[i - 1];
            for (int j = 0; j < w.length; j++) { //the optimal solution for the weight i is the maximum between not selecting any item and the item that maximizes the value achieved without exceeding the allowed weight C 
                if (w[j] <= i && v[j] + maxValues[i - w[j]] > maxValue) {
                    index = j;
                    maxValue = v[j] + maxValues[i - w[j]];
                }
            }
            maxValues[i] = maxValue;
            lastSelected[i] = index;
        }
        return collectObjects(w, lastSelected);
    }

    private static ArrayList<Integer> collectObjects(int[] w,
            int[] selectedObjects) {
        ArrayList<Integer> collectedObjects = new ArrayList<Integer>();
        int index = selectedObjects.length - 1;
        while (selectedObjects[index] != -1) {
            collectedObjects.add(selectedObjects[index]);
            index = index - w[selectedObjects[index]];
        }
        return collectedObjects;
    }

    public static void main(String[] args) {
        int[] v = new int[] { 30, 14, 16, 9 };
        int[] w = new int[] { 6, 3, 4, 2 };
        int c = 10;
        System.out.println("the ids of the selected objects are :"
                + UnboundedKnapsack.unboundedKnapsack(v, w, c));
    }

}