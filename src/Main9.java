class Rectangle {
    double length, breadth;


    void read(double l, double b) {
        length = l; breadth = b;
    }


    double area() {
        return length * breadth;
    }


    double perimeter() {
        return 2 * (length + breadth);
    }
}


class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read(10, 5);
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}