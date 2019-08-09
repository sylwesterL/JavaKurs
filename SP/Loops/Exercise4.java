/*Napisz pętlę while, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.*/

public class Exercise4 {
    public static void main(String[] args) {

        int uneven = -10;

        while (uneven < 40) {
            uneven++;
            if (uneven % 2 == 0) {
                continue;
            }
            System.out.print(uneven + "\t");
        }
    }
}
