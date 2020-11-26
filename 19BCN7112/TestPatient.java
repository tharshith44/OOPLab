class TestPatient{
	public static void main(String[] args){
		String newline = System.getProperty("line.separator");
		Patient a = new Patient();
		System.out.println("The values of Default constructor of Patient class are"+ newline+" 1. Patient age is  "+a.getAge()+newline+" 2. Patient ID is "+a.getID()+newline+" 3. Patient Blood Group is "+a.getB().gettype()+a.getB().getrh());
	    Patient b  = new Patient(1792,18,"A","-");
	    System.out.println("The values of OverLoadead constructor of Patient class are"+ newline+" 1. Patient age is  "+b.getAge()+newline+" 2. Patient ID is "+b.getID()+newline+" 3. Patient Blood Group is "+b.getB().gettype()+b.getB().getrh());
	    Patient c  = new Patient();
	    c.setID(278);
	    c.setAge(42);
	    c.setB("B","+");
	    System.out.println("The values Using Setters and Getters of Patient class are"+ newline+" 1. Patient age is  "+c.getAge()+newline+" 2. Patient ID is "+c.getID()+newline+" 3. Patient Blood Group is "+c.getB().gettype()+c.getB().getrh());
	}
}