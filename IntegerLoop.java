import java.util.Scanner;

public class IntegerLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an integer");
        System.out.println("Or enter 'quit' to stop the program");
        boolean validInput = false;

        while (!validInput) {
            if(input.hasNextInt()) {
                System.out.println(input.nextInt() + " is an Integer");
                validInput = true;
            }
            else {
                String userInput = input.next();
                if (userInput.equalsIgnoreCase("quit")) {
                    System.out.println("Exiting program...");
                    break;
                } else {
                    System.out.println("Invalid input: Please enter an integer or 'quit'");
                } 
            }
        }

        input.close();
    }
}
