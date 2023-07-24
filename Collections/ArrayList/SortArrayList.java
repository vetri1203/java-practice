package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayList <Integer> list  =new ArrayList<>();

        while(true){
            String str = sc.nextLine();
            if(str.isEmpty()){
                break;
            }
            int num = Integer.parseInt(str);
            list.add(num);
        }
        int len = list.size();

        // for(int i=0;i<len;i++)
        // {
        //     for(int j=0;j<len;j++)
        //     {
        //         if(list.get(i) <list.get(j))
        //         {
        //             int temp = list.get(i);
        //             list.set(i, list.get(j));
        //             list.set(j,temp);
        //         }
        //     }
        // }
            Collections.sort(list);
        System.out.println(list);
    }
}
