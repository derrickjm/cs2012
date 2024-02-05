import java.util.Scanner;

public class UserInputAnything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a string!");
        String userString = input.nextLine();
        System.out.println("You entered: " + userString);

        System.out.println("Give me an integer!");
        while (!input.hasNextInt()) {
            System.out.println("Wrong! Please enter an integer!!");
            input.next();
        }
        int userInt = input.nextInt();
        System.out.println("You entered: " + userInt);

        System.out.println("Give me anything!");
        if(input.hasNextInt()) {
            System.out.println(input.nextInt() + " is an Integer.");
        }
        else if (input.hasNextFloat()) {
            System.out.println(input.nextFloat() + " is a Float");
        }
        else if (input.hasNext()) {
            System.out.println(input.next() + " is a string");
        }
        input.close();
    }
}
