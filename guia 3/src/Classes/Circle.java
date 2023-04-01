package Classes;

public class Circle extends Object {

    private Double radio;

    public Circle() {
    }

    public Circle(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public Double getArea() {
        return Math.PI * radio * radio;
    }
    @Override
    public Double getPerimeter(){
        Double P= 0.0;
        P= 2* Math.PI * radio;
        return P;
    }
}
