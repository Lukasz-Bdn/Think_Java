public class Time {
	public static void main(String[] args) {
		int hour=20, minute=3, second=19;
		int secondsToday = hour*60*60 + minute*60 + second;
		System.out.println(secondsToday);
		int secondsLeft = 24*60*60 - secondsToday;
		System.out.println(secondsLeft);
		double dayPercentage = (100.0 * secondsToday) / (24.0*60.0*60.0);
		System.out.println(dayPercentage);
		hour = 20; minute = 59; second = 22;
		int secondsExercise = hour*60*60 + minute*60 + second - secondsToday;
		System.out.println(secondsExercise);
		
	}

}
