class Candle{
	String color;
	double height;
    double price;
     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = this.height*2;
    }

    public double getPrice() {
        return price;
    }

}
class ScentedCandle extends Candle{
	public void setHeight(double height) {
        this.height = height;
        this.price = this.height*3;
    }
}