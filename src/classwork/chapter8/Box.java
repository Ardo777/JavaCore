package classwork.chapter8;

public class Box {
    double widht;
    double height;
    double depth;

    Box(Box ob) {
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;

    }

    Box(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    Box() {
        widht = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        widht = height = depth = len;

    }

    double volume() {
        return widht * height * depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d,double m) {
        widht = w;
        height = h;
        depth = d;
        weight=m;
    }

}

