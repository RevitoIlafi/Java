import java.util.Scanner;

public class oddevent {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while(exit != true){
            int input;
            String choice;            
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
        choice = sc.next();
        if (choice.equals("y")){
            exit = true;
            System.out.println("thank you and bye");}

        }
    }
}
