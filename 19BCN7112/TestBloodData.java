

class TestBloodData{
    public static void main(String[] ar){
    	BloodData ob1 = new BloodData();
        System.out.println("Default Blood type is "+ob1.gettype()+ob1.getrh());
        BloodData ob2 = new BloodData("A","-");
        System.out.println("Blood type using default constructor is "+ob2.gettype()+ob2.getrh());
        ob2.settype("AB");
        ob2.setrh("-");
        System.out.println("Blood type using getters and setters is "+ob2.gettype()+ob2.getrh());
    }
}