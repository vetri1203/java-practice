import java.util.Scanner;

// package java-practice.Recursive;

public class Print1to100 {
    public static void problem(int n)
    {
        if(n>0)
        {

            problem(n-1);
            System.out.print(n +" ");
            return;
        }

        
        // n--;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        problem(num);
    }
}
