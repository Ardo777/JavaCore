package classwork.chapter6;

public class Box {
    double widht;
    double height;
    double depth;

    double volume() {
        return widht * height * depth;

    }
    Box() {
        System.out.println("Конструирование обьекта Box");
        widht=10;
        height=10;
        depth=10;

    }
    Box(double w,double h,double d){
        widht=w;
        height=h;
        depth=d;
    }


    void setDim(double w,double h, double d){
        widht=w;
        height=h;
        depth=d;
    }

}


