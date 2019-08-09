/*Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.*/

public class Exercise3 {
    public static void main(String[] args) {

        for (int uneven = -9; uneven < 40; uneven += 2) {
            System.out.print(uneven + "\t");
        }
    }
}
