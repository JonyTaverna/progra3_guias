package Classes;

public class Square extends Object {
    private Double size;

    public Square() {
    }

    public Square(String color, Double size) {
        super(color);
        this.size = size;
    }
    @Override
    public Double getArea(){
        Double area = 0.0;
        area = size * size;
        return area;
    }
    @Override
    public Double getPerimeter(){
        Double P= 0.0;
        P= 4*size;
        return P;
    }
}
