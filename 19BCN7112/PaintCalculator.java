import java.util.Scanner;
class PaintCalculator{
    static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
       System.out.println("Enter the length of the Rectangular room: ");
       double l = in.nextDouble();
       System.out.println("Enter the height of the Rectangular room: ");
       double h = in.nextDouble();
       System.out.println("Enter the breadth of the Rectangular room: ");
       double b = in.nextDouble();
       double a = area(l,h,b);
       System.out.println("Area of the room's wall space is "+a+" sq.ft");
       double p = paint(a);
       print(p);
       double c = cost(p);
       System.out.println("Total cost of painting to paint a room of dimensions "+l+"x"+h+"x"+b+" is "+c);
	}
	static double area(double l,double b, double h){
	    return 2*(l*b)+2*(b*h)+2*(h*l);
	}
	static double paint(double a){
         return a/350;	
     }
     static void print(double p){
      System.out.println("Total gallons of paint required is "+p);
  }
     static double cost(double p){
     	return p*32;
     }

}
