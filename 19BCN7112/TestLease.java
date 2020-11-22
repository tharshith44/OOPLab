import java.util.Scanner;

class TestLease{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] ar){
       Lease ob1 = new Lease();
       Lease ob2 = new Lease();
       Lease ob3 = new Lease();
       Lease ob4 = new Lease();
       getData(ob1);
       getData(ob2);
       getData(ob3);  
       showValues(ob1);
       ob1.addPetFee();
       ob1.explainPetPolicy();
        showValues(ob1);
        showValues(ob2);
        showValues(ob3);
        showValues(ob4);  

	}
	public static void getData(Lease ob){
	   System.out.print("Input the name of tenant: ");
	   String name = in.nextLine();
       System.out.print("Input the Apartment number: ");
       int apt = in.nextInt();
       System.out.print("Input the Monthly Rent: ");
       double rent = in.nextDouble();
       System.out.print("Input Total Term in Months: ");
       int term = in.nextInt();
       ob.setTennant(name);
       ob.setAptNo(apt);
       ob.setRent(rent);
       ob.setTerm(term);
       in.nextLine();
	}
	public static void showValues(Lease ob){
		System.out.println("The Name of Tennant is "+ob.tennant+" He lives in Apartment number "+ob.aptNo+". His Monthly rent is "+ ob.rent+" his lease term is "+ob.term);
	}
}