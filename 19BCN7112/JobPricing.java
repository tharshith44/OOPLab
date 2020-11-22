import java.util.Scanner;
class JobPricing{
        static Scanner in = new Scanner(System.in);
        public static void main(String[] args){
        System.out.println("Enter the name of Job: ");
        String job = in.nextLine();
        System.out.println("Enter the cost of materials: ");    
        double cost = in.nextDouble();
        System.out.println("Enter No. of hours worked: ");
        double hours = in.nextDouble();
        System.out.println("Enter Travel Time: ");
        double travel = in.nextDouble();
        double price = estimateadprice(cost,hours,travel);
        System.out.println("Total estimatead cost to finish "+job+" is $"+price);
        }
        static double estimateadprice(double c, double h, double t){
                 return (c+(h*35)+(t*12));
        }
}
