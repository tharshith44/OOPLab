import java.util.Scanner;
class InchConversion{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
	   System.out.println("Enter a values in terms of Inches: ");
       double n = in.nextDouble();
       IntoFeet(n);
       IntoYards(n);
	}
	static void IntoFeet(double n){
	    System.out.println(n+" inches is equals to "+ n/12 + " foot");
	}
	static void IntoYards(double n){
         System.out.println(n+" inches is equals to "+ n/(12)*3 + " Yards");
	}
}