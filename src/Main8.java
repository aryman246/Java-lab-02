class Box {
    double length, width, height;


    Box(double l, double w, double h) {
        length = l; width = w; height = h;
    }


    double volume() {
        return length * width * height;
    }
}


class Demo {
    public static void main(String[] args) {
        Box b = new Box(5, 4, 3);
        System.out.println("Volume = " + b.volume());
    }
}