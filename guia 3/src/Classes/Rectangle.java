package Classes;

public class Rectangle extends Object {
    private Double wide;
    private Double large;

    public Rectangle() {
    }

    public Rectangle(String color, Double wide, Double large) {
        super(color);
        this.wide = wide;
        this.large = large;
    }

    @Override
    public Double getArea() {
        Double area = 0.0;
        area = wide*large;
        return area;
    }
    @Override
    public Double getPerimeter(){
        Double P= 0.0;
        P= (2*wide) + (2*large);
        return P;
    }
}
