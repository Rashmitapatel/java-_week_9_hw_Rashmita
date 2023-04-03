package calculate;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            // scanner declaration for reading value from console
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();
            char symbol = ' ';
            String choice = "";
            do {
                System.out.print("Enter first Number:");
                int num1 = scanner.nextInt();
                System.out.print("Enter second Number:");
                int num2 = scanner.nextInt();
                System.out.print("Please enter one of symbol +,-,*, /:");
                symbol = scanner.next().charAt(0);
                calculator.calculateResult(num1,num2,symbol);
                System.out.print("Would you like to do more calculation Please enter “Y” or “N” :");
                choice = scanner.next();
            } while(choice.equalsIgnoreCase("Y"));
        }
    }








