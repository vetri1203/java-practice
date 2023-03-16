import java.util.Scanner;

public class EigthSeries {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            int num = sc.nextInt();

            int temp = 8;
            // System.out.print(temp + " ");

            for(int i=1;i<=num;i++)
            {
                System.out.print(temp + " ");   
                temp  = (temp *2)-i;
                
                
            }
            
        }
    }
}
