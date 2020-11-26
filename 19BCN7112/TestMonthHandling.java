 
import java.time.*; 

  
class TestMonthHandling{
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2020-01-31");
		LocalDate date2 = LocalDate.parse("2020-12-31");
		System.out.println("Adding one month to jan-31-2020 is "+date1.plusMonths(1));
		System.out.println("Adding two months to jan-31-2020 is "+date1.plusMonths(2));
		System.out.println("Adding three months to jan-31-2020 is "+date1.plusMonths(3));
        System.out.println("Adding one month to dec-31-2020 is "+date2.plusMonths(1));
		System.out.println("Adding two months to dec-31-2020 is "+date2.plusMonths(2));
		System.out.println("Adding three months to dec-31-2020 is "+date2.plusMonths(3));

	}
}