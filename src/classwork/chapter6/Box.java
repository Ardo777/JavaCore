package classwork.chapter6;

public class Box {
    double widht;
    double height;
    double depth;

    double volume() {
        return widht * height * depth;

    }
    void setDim(double w,double h,double d){
        widht=w;
        height=h;
        depth=d;
    }
}
