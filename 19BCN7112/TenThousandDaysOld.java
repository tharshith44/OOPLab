import java.time.*; 
import java.util.Scanner;
class TenThousandDaysOld{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Date in the Format YYYY-MM-DD: ");
		String s = in.nextLine();
		LocalDate birthday = LocalDate.parse(s);
		System.out.println("The Date on which you will be 10,000 days old is "+birthday.plusDays(10000));
	}
}