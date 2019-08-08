package pl.samouczekprogramisty.kursjava;

public class Main {
    public static void main(String[] args) {

        String message = "To jest moj pierwszy program, potocznie \"string\".";
        System.out.println(message);

        String entry = "Today is sunny day. ";
        String hot = "Currently is 25 Celsius degree. ";
        String wind = "The wind can bring clouds and rain.";

        System.out.println(entry);
        System.out.println(hot);
        System.out.println(wind);

        String komunikat1 = "Dziś jest ciepło i świeci słońce";
        String komunikat2 = "Niebo jest troche pochmurne ale deszcz nie pada";
        String komunikat3 = "Noc jest ciepła. Można spać przy otwartym oknie";

        System.out.println(komunikat1);
        System.out.println(komunikat2);
        System.out.println(komunikat3);

        int dlugosc = komunikat1.length() + komunikat2.length() + komunikat3.length();
        System.out.println("Suma znaków trzech poprzednich zdań wynosi: " + dlugosc);
    }
}