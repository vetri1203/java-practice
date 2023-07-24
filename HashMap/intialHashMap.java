package HashMap;

import java.util.*;
import java.util.Scanner;

public class intialHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        hash.put(1, 10);

        hash.put(2, 20);

        System.out.println(hash.get(1));

        sc.close();

    }

}
