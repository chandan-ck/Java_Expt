package com.test.lowes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Knapsack {
    public static void main(String[] args) {
        //List of stored items
        ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods(1, 10, 35));
        list.add(new Goods(2, 40, 30));
        list.add(new Goods(3, 30, 60));
        list.add(new Goods(4, 50, 50));
        list.add(new Goods(5, 35, 40));
        list.add(new Goods(6, 40, 10));
        list.add(new Goods(7, 30, 25));
        
                 //Backpack capacity
        int c = 150;
        
        double[] r = select(c, list);
                 System.out.print("The first number represents the maximum value, and the subsequent numbers represent the items loaded into the backpack,"
                         + "The last item is partially loaded, and the other items are fully loaded:");
        for(int i = 0; i < r.length; i++) {
            System.out.print(r[i] + "   ");
        }
        System.out.println();
    }
    
    /**
             * Calculate the optimal solution according to the greedy strategy
             * @param c The capacity of the backpack
             * @param list stores the list of items
             * @return r The final result array, the first digit is the maximum value, and the last digit is the partially loaded
             * Item serial number
    */
    public static double[] select(int c, ArrayList<Goods> list) {
                 //Sort the list according to the value of unit weight
        Collections.sort(list, new Comparator<Goods>() {
            @Override
            public int compare(Goods g1, Goods g2) {
                if(g2.v / g2.w - g1.v / g1.w > 0)
					return 1;
				else if(g2.v / g2.w - g1.v / g1.w < 0)
					return -1;
				else
					return 0;
            }
        });
        
        for(int j = 0; j < list.size(); j++)
            System.out.print(list.get(j).id + " ");
        System.out.println();
        
        double[] r = new double[list.size() + 1];
        
                 //Initialize the maximum value
        r[0] = 0;
        
                 //Item value equal to -1 means no item
        for(int j = 1; j < r.length; j++)
            r[j] = -1;
        
        int i;
        for(i = 0; i < list.size(); i++) {
            if(list.get(i).w > c)
                break;
            r[i + 1] = list.get(i).id;
            r[0] += list.get(i).v;
            c -= list.get(i).w;
        }
        
                 //Add the last item to the backpack (the last item cannot be added in all, because its weight is already greater than
                 //The remaining capacity of the backpack is too large)
        r[i + 1] = list.get(i).id;
        r[0] += c * (list.get(i).v / list.get(i).w);
        
        return r;
    }
}

class Goods {
         //Item id
    public int id;
         //Item value
    public double v;
         //Item weight
    public int w;
    
    public Goods(int id, int v, int w) {
        this.id = id;
        this.v = v;
        this.w = w;
    }
}