class TestCircle{
 public static void main(String[] args) {
 	String newline = System.getProperty("line.separator");
		Circle a = new Circle();
		Circle b = new Circle();
		Circle c = new Circle();
		a.setRadius(5);
		b.setRadius(157523);
		System.out.println("The circle values with small radius is:"+newline+"1. Radius is "+a.getRadius()+newline+"2. Diameter is "+a.diameter+newline+"3. Area is "+a.area);
		System.out.println("The circle values with Big radius is:"+newline+"1. Radius is "+b.getRadius()+newline+"2. Diameter is "+b.diameter+newline+"3. Area is "+b.area);
    	System.out.println("The circle values with Default constructor is:"+newline+"1. Radius is "+c.getRadius()+newline+"2. Diameter is "+c.diameter+newline+"3. Area is "+c.area);
	}
}