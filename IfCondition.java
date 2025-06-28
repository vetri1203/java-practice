import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        input.close();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number 1 is the greatest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number 2 is the greatest.");
        } else {
            System.out.println("Number 3 is the greatest.");
        }
    }
}
