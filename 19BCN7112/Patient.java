class Patient{
  int ID;
  int age;
  BloodData b;
  Patient(){
  	this.ID = 0;
  	this.age = 0;
  	this.b = new BloodData();
  }
  Patient(int id, int age, String type, String rh){
  	this.ID = id;
  	this.age = age;
  	b = new BloodData();
  	this.b.type = type;
  	this.b.rh = rh;
  }
   public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public BloodData getB() {
	return b;
}
public void setB(String type, String rh) {
		this.b.type = type;
  	    this.b.rh = rh;
}
}