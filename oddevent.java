import java.util.Scanner;

public class oddevent {
    public static void main(String[] args) {
        boolean exit = false;
        while(exit != true){
            int input;
            String choice;
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukan angka : ");
            input = sc.nextInt();
            
            try {
                if (input % 2 == 0){
                    System.out.println("The number is even number");
                }
                else if(input % 2 == 1){
                    System.out.println("The number is odd number");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("The input is invalid");
            }
        System.out.println("Do you want to exit? y/n");
        sc = new Scanner(System.in);
        choice = sc.nextLine();
        if (choice == "y")
            exit = true;
            sc.close();
        }
    }
}
