class Billing{
	public static double computeBill(double p){
        return p*(108/100);
	}
    public static double computeBill(double p,double p1){
        return p1*(p*(108/100));
    }
    public static double computeBill(double p,double p1,double p2){
        return (p1*(p*(108/100)))-p2;
 
    }
}
class BillingMain{
   public static void main(String[] ar){
      double a = Billing.computeBill(5);
      System.out.println("Cost of book is "+a);
      double b = Billing.computeBill(7,2);
      System.out.println("Cost of books is "+b);
      double c = Billing.computeBill(6,3,5);
      System.out.println("Cost of book after coupon is "+c);
   }
}