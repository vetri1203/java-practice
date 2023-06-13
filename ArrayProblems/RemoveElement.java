import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int elem = sc.nextInt();
        int[] arr = new int[len];

        for(int i=0;i<len;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<len;i++)
        {
            if(arr[i] == elem)
            {
                arr[i--] = arr[len-- -1];
            }
        }

        System.out.print("after remove the element");

        
        System.out.println(len);

        System.out.print("after remove the element the array is : ");

         for(int i=0;i<len;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}


// class Solution {
//     public int removeElement(int[] A, int elem) {
//     int len = A.length;
//     for (int i=0; i<len; i++) {
//         if (A[i] == elem) {
//             A[i--] = A[len-- -1];
//         }
//     }
//     return len;
// }
// }






