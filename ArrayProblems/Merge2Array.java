import java.util.*;

public class Merge2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of first array");
        int m = sc.nextInt();
        System.out.println("size of second array");

        int n = sc.nextInt();

        System.out.println("Enter of first array");

        int[] m1 = new int[m + n];
        System.out.println("Enter of second array");

        int[] m2 = new int[n];

        for (int index = 0; index < m; index++) {
            m1[index] = sc.nextInt();
        }
        System.out.println("Enter the second array");
        for (int index = 0; index < n; index++) {
            m2[index] = sc.nextInt();
        }
        System.out.println("Merged  array is : ");
        int ind = 0;
        for (int i = m; i < m + n; i++) {

            
            m1[i]= m2[ind++];
            
        }
        for(int i=0;i<m+n;i++)
        {
            for(int j =i+1;j<m+n;j++)
            {
                if(m1[i]>m1[j]){
                    int temp = m1[i];
                    m1[i] = m1[j];
                    m1[j] = temp;
                }
            }

            System.out.print(m1[i] + " ");
        }
        
    }
}
