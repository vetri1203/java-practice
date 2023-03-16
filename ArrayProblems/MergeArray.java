import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in)){
            int[] a1 = {1,9,3,4};
            int[] a2 = {5,6,7,8};
            // int temp;
            int a = a1.length;
            int b=a2.length;
            int  c= a+b;
            int arr[] = new int[c];

            for(int i=0;i<a;i++)
            {
                arr[i]=a1[i];
            }
            for(int i=0;i<b;i++)
            {
                arr[a+i]  = a2[i];
            }
            System.out.println("Merged and sorted array is : ");
            // int temp;
            for(int i=0;i<c;i++)
            {

                // System.out.print(arr[i] + " ");
                for(int j=i+1;j<c;j++)
                {
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    
                }
                    System.out.print(arr[i] + " ");
                
            }
            System.out.println("");


            System.out.println("Max value in a merged array is : "+arr[c-1]);
            // System.out.print(temp);

        }
    }
}
