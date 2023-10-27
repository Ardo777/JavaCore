package classwork.chapter8;

 abstract  class Figure {
    double dim1;
    double dim2;
Figure(double a,double b){
    dim1=a;
    dim2=b;
}
abstract double area();
}
class Rectangle extends Figure{

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("В областьи четырехугольника.");
return dim1*dim2;
    }

}
class Triangle extends Figure{

    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("В областьи трехугольника.");
        return dim1*dim2/2;
    }
}
