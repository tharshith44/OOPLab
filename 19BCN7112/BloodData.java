

class BloodData{
	String type;
	String rh;
	BloodData(){
		this.type = "O";
		this.rh = "+";
	}
	BloodData(String type, String rh){
		this.type = type;
		this.rh = rh;
	}
	void settype(String type){
		this.type = type;
	}
	void setrh(String rh){
		this.rh = rh;
	}
	String gettype(){
		return type;
	}
	String getrh(){
		return rh;
	}
}