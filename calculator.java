import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = reader.nextInt();
        System.out.println("Enter your second number");
        int num2 = reader.nextInt();
        System.out.println("Do you want to add, multiply, subtract or divide?");
        String operation = reader.next();

            switch (operation){

                case "add":
                    System.out.println(num1 + num2);
                    break;
                case "multiply":
                    System.out.println(num1 * num2);
                    break;
                case "subtract":
                    System.out.println(num1 - num2);
                    break;
                case "divide":
                    System.out.println(num1 / num2);
                    break;


        }

    }

}
