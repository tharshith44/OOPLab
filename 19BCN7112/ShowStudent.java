class Student{
  String ID;
  double c;
  double p;
  double gpa;
  void setID(String ID){
    this.ID = ID;
   }
  void setc(double c){
      this.c = c;
   }
  void setp(double p){
      this.p = p;
   }
  void calculategpa(){
       this.gpa = p/c;
   }   
  void displayID(){
    System.out.println("Your ID is "+ID);
   }
  void displaycred(){
    System.out.println("Your total credits is "+c);   
   }  
   void displayp(){
    System.out.println("No of points earned is "+p);
   }
   void displaygpa(){
    System.out.println("Your GPA is "+gpa);
   }
}
class ShowStudent{
  public static void main(String[] args){
    Student ob = new Student1();
        ob.setID("19BCN7112");
        ob.setc(20);
        ob.setp(76);
        ob.calculategpa();
        ob.displayID();
        ob.displaycred();
        ob.displayp();
        ob.displaygpa();
  }
}