import java.util.Scanner;

public class bob {
    public static void main(String[] args) {

        System.out.println("Hello, what dimensions do you want?");

        Scanner reader = new Scanner(System.in);
        System.out.println("Width: ");
        double width = reader.nextDouble();
        System.out.println("Length: ");
        double length = reader.nextDouble();

        System.out.println("So you want your rectangle to be " + width + " by " + length);
        System.out.println("Your area is " + width * length);

        System.out.println("Is this right?");
        String correct = reader.next();
            if (correct.equals("yes"))
                System.out.println("Thank you!");
            if (correct.equals("no"))
                System.out.println("Try Again!");


    }
}
