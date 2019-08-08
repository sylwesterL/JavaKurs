import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a current temperature");

        int temp = input.nextInt();

        if (temp > 0) {
            System.out.println("The temperature is positive");
        }

        else if (temp < 0) {
            System.out.println("The temperature is negative");
        }

        else {
            System.out.println("The temperature is zero degrees celsius");
        }

    }
}
