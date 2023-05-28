import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Choose an option : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Quit");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Input First number : ");
        double a = in.nextDouble();
        System.out.println("Input Second number : ");
        double b = in.nextDouble();
        switch (number) {
            case 1:
                System.out.println("Addition Selected");
                System.out.println(a + b);
                break;
            case 2:
                System.out.println("Subtraction Selected");
                System.out.println(a - b);
                break;
            case 3:
                System.out.println("Multiplication Selected");
                System.out.println(a * b);
                break;
            case 4:
                System.out.println("Division Selected");
                System.out.println(a / b);
                break;
            case 5:
                System.out.println("Quit Selected");
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
