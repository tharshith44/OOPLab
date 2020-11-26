import java.lang.Math;

class MathTest{
	public static void main(String[] args) {
		System.out.println("1. The Square root of 37 is "+Math.sqrt(37));
		System.out.println("2. The Sine and Cosine of 300 is "+Math.sin(Math.toRadians(300))+" and "+Math.cos(Math.toRadians(300))+" Respectively");
        System.out.println("3. The value of 22.8 for floor is "+Math.floor(22.8)+" for ceilig is "+Math.ceil(22.8)+" and for round is "+Math.round(22.8));
        System.out.println("4. The Larger of 'D' and 71 is "+Math.max((int)'D',71)+" The smaller is "+Math.min((int)'D',71));
	    System.out.println("5. A Random  number Between 0 and 20 is "+Math.random()*20);
	}
}