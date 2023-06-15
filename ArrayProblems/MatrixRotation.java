import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[][] mat = new int[len][len];

        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        //print the 2D matrix
        for(int i=0;i<len;i++)
        {
            for(int j=len-1;j>=0;j--)
            {
                System.out.print(mat[j][i] + "    ");
            }

            System.out.println();
        }

    }
}
