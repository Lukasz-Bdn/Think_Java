import java.util.Scanner;

/* Program do konwersji podanej dlugosci w cm na cale i stopy
*/
 
public class Convert {
	public static void main(String[] args) {
		double cm;
		int inches,feet, remainder;
		final double cmPerInch = 2.54;
		final int inchPerFeet = 12;
		Scanner in = new Scanner(System.in);
		
		//Prosba o podanie dlugosci w cm
		System.out.println("Podaj dlugosc w cm:");
		cm = in.nextDouble();
		
		//Konwersja i wyswietlenie wyniku
		inches = (int) (cm/cmPerInch);
		feet = (int) (inches/inchPerFeet);
		remainder = inches%inchPerFeet;
		System.out.printf("%.0f cm = %d stop, %d cali.\n", cm, feet, remainder); 
		
			
	
	}
} 
