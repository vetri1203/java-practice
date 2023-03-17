import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in))
        {
            int num=sc.nextInt();
            int temp = num;
            while(temp >1)
            {

                System.out.print(temp + " ");
                temp = temp/4;
                
            }
            
            // System.out.println(Math.sqrt(num));
        }
    }
}
