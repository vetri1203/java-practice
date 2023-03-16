// package java-practice.series;
import java.util.*;
public class square {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();

            for(int i=1;i<n;i++)
            {
                System.out.print(i*i + " ");
            }
        }
    }
}
