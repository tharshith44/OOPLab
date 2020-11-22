class Percentages{
	public static void main(String[] args){
		double x=2.0;
		double y=5.0;
        computepercent(x,y);
        computepercent(x,y);
	}
	static void computepercent(double x,double y){
         System.out.println(x+" is "+(x/y)*100+" percent of "+y);
	}
}