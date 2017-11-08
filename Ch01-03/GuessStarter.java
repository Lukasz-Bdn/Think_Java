import java.util.Random;
import java.util.Scanner;

/**
 * Początkowy kod dla przykładu "Odgadnij moją liczbę".
 */
public class GuessStarter {

    public static void main(String[] args) {
        // wybierz losową liczbę
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        //System.out.println(number);
        
        //Pobranie zgadywanej liczby od gracza
        int guessedNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("Zgadnij liczbe (1-100): ");
        guessedNumber = in.nextInt();
        System.out.println("Twoja propozycja to: " + guessedNumber);
        
        //Obliczenie i wyswietlenie roznicy
        int difference = number - guessedNumber;
        System.out.println("Liczba o ktorej myslalem to: " + number);
        System.out.println("Roznica miedzy naszymi liczbami to: " + difference);
    }
} 
