import java.util.*;

public class SumOfEven {
    public static void main(String  args[])
    {
        try(Scanner sc = new Scanner(System.in)){
            int n=sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {

                arr[i] = sc.nextInt();
            }int sum=0;
            System.out.println("----------------------------------------------");

            for(int i=0;i<n;i++)
            {
                if(arr[i] %2 ==0){
                    sum+=arr[i];
                }
            }
        System.out.println("Sum of Even Index is :");

        System.out.println(sum);
    }
    }
}
