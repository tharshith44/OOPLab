
import java.lang.Math.*;

class Circle{
	double r;
	double diameter;
	double area;
	Circle(){
		this.r = 1;
		diameter = 2*this.r;
		area = Math.PI*this.r*this.r;
	}
	public void setRadius(double r){
		this.r = r;
		diameter = 2*this.r;
		area = Math.PI*this.r*this.r;
	}
	public double getRadius(){
		return this.r;
	}
}