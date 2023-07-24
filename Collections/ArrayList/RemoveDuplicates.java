package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayList<Integer> alist =  new ArrayList<>();

        while(true)
        {
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("")){
                break;
            }

            int num = Integer.parseInt(str);
            alist.add(num);
        }


                    Collections.sort(alist);
                    int len = alist.size();
                    int i=0;

                    while(i<len-1)
                    {
                        if(alist.get(i) == alist.get(i+1)){
                            alist.remove(i+1);
                            len--;
                        }
                        else{
                            i++;
                        }
                    }
                    System.out.println(alist);

    }
}
