import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {

            System.out.println("First Number?");
            int num1 = input.nextInt();
            input.nextLine();

            System.out.println("Second Number?");
            int num2 = input.nextInt();
            input.nextLine();

            if (num1 % 10 == num2 % 10) {
                System.out.println("Last Digits Are The Same!");
            } else {
                System.out.println("Last Digits Are NOT The Same!");
            }

            System.out.println("Do you wish to exit? (Y/N)");
            String exitInput = input.nextLine();
            if (exitInput.equalsIgnoreCase("y")) {
                return;
            }

        }
    }
}