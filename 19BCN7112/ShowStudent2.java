class Student{
    String ID;
    double c;
    double p;
    double gpa;
    Student(){
       this.ID = "9999";
       this.c=3;
       this.p=12;
    }
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
  class ShowStudent2{
    public static void main(String[] args){
      Student ob = new Student();
          ob.calculategpa();
          ob.displayID();
          ob.displaycred();
          ob.displayp();
          ob.displaygpa();
    }
  }