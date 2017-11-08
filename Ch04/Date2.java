public class Date2 {
	public static void main(String[] args) {
		String day = "Piatek", month = "Pazdziernik";
		int date = 12, year = 2017;
		printAmerican(day, month, date, year);
		month = "Sierpnia";
		printEuropean(day, month, date, year);
	}
	
	public static void printAmerican(String day, String month, int date, int year) {
		System.out.println("Format amerykanski:");
		System.out.println(day + ", " + month + " " + date + ", " + year +".");
	}
	
	public static void printEuropean(String day, String month, int date, int year) {
		System.out.println("Format europejski:");
		System.out.println(day + ", " + date + " " + month + " " + year);
	}
}
