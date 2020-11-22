import java.util.Scanner;
class Percentages2{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
        computepercent(); 
        computepercent();     
	}
	static void computepercent(){
		System.out.println("Enter the First Double Number");
		double x = in.nextDouble();
		System.out.println("Enter the Second Double Number");
		double y = in.nextDouble();
        System.out.println(x+" is "+(x/y)*100+" percent of "+y);
	}
}