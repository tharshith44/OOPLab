import java.time.*; 
import java.util.Scanner;
class DaysTilNextMonth{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter The Date in the Format YYYY-MM-DD: ");
        String s = in.nextLine();
		LocalDate date = LocalDate.parse(s);
		int days_left = date.lengthOfMonth()-date.getDayOfMonth();
		LocalDate future_month = date.plusDays(days_left + 1);
        Month x = future_month.getMonth();

        System.out.println("Days Left until next Month is "+days_left+" The Next Month Is "+x);
	}
}