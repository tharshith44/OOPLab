class Lease{
	String tennant;
	int aptNo;
	double rent;
	int term;
	Lease(){
		tennant = "XXX";
		aptNo = 0;
		rent = 1000;
		term = 12;
	}
	public String getTennant() {
		return tennant;
	}
	public void setTennant(String tennant) {
		this.tennant = tennant;
	}
	public int getAptNo() {
		return aptNo;
	}
	public void setAptNo(int aptNo) {
		this.aptNo = aptNo;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public void addPetFee(){
		this.rent = rent+10;
	}
	public static void explainPetPolicy(){
        System.out.println("You are Havihg pet So you need to pay a $10 premium");
	}
}
