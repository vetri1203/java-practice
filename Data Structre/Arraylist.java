// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// package Data Structre;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {


            System.out.println("Enetr the arrayList Size => ");
            int len = sc.nextInt();

            ArrayList <Integer> arr = new ArrayList <Integer>();
            System.out.println("Enetr the ArrayList values => ");
            

            for(int index =0;index<len;index++){
                arr.add(sc.nextInt());
            }

            System.out.println("Values in the ArrayList is  => ");
            Collections.sort(arr);
            System.out.print(arr);
            
           
        }
    }
}
