import java.util.Scanner;

public class AddSeries {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();


            System.out.print("1 ");
            int temp = 1;
            for(int i=1;i<n;i++)
            {
                if(i%2==0)
                {
                    temp = temp*temp -1;
                }
                else{
                    temp = temp*temp +1;
                }

                System.out.print(temp + " ");
            }


        }
    }
}
