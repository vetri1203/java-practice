import java.util.*;

public class ScannerPractice {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String name = input.nextLine();
        input.close();
        System.out.print("User entered name is : "+name);
    }
}

