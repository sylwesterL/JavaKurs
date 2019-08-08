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
        
        int dlugosc = entry.length() + hot.length() + wind.length();
        System.out.println("Suma znaków trzech poprzednich zdań wynosi: " + dlugosc);
    }
}