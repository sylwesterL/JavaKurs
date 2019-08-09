/*
Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający
wartość zmiennej o 1. Jest nim --.
Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.
*/

public class Exercise1 {
    public static void main(String[] args) {


        for (int i = 20; i >= 10; i--) {
            System.out.print(i + "\t");
        }
    }
}