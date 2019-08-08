/*Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
 */

package pl.samouczekprogramisty.kursjava.arrays;

public class Exercise1 {
    public int sum(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        Exercise1 exercise = new Exercise1();
        int[] numbers = {65, 12};

        System.out.println("Elements of array are: " + numbers[0] + " and " + numbers[1]);
        System.out.println("Sum of these elements is: " + exercise.sum(numbers));
    }
}