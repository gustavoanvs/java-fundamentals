package ex_POO;

public class Rectangle {

    double width;
    double height;

    public double area(){
        double area = width * height;
        return area;
    }

    public double perimetro(){
        double perimetro = 2 * (width + height);
        return perimetro;
    }

    public double diagonal(){
        double diagonal = Math.sqrt((width * width) + (height * height));
        return diagonal;
    }

}
