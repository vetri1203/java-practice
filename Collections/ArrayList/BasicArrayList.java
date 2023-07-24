package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
             String num = sc.nextLine().trim();
            if(num.isEmpty()){
                break;
            }
            // int number = Integer.parseInt(num);
            list.add(num);
            

        }
        System.out.println(list);
    }
}
