import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner in = new Scanner(System.in);
		
		//Zapytanie o temp w C i pobranie wartosci
		System.out.println("Podaj temp w stopniach C: ");
		celsius = in.nextDouble();
				
		//Przeliczenie temp w C na temp w F
		fahrenheit = celsius * (9.0 / 5.0) + 32.0;
		
		//Wyswietlenie wyniku
		System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
	}	
}
