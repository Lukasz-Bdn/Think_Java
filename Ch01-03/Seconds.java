import java.util.Scanner;

public class Seconds {
	public static void main(String[] args) {
		int secondsInput, secs, mins, hours;
		final int secPerHour = 60*60;
		final int secPerMinute = 60;
		Scanner in = new Scanner(System.in);
		
		//Zapytanie o ilosc sekund i pobranie wartosci
		System.out.println("Podaj ilosc sekund:");
		secondsInput = in.nextInt();
		
		//Przeliczenie sekund na godziny, minuty i sekundy
		hours = (int) (secondsInput/secPerHour);
		mins = (int) ((secondsInput%secPerHour)/secPerMinute);
		secs = (int) (secondsInput%secPerMinute);
		
		//Wyswietlenie wyniku
		System.out.printf("%d sekund = %d godzin, %d minut, %d sekund.\n",
		secondsInput, hours, mins, secs);
	}
}
