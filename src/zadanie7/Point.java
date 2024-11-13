package zadanie7;
class Point {
    double x;
    double y;
    double z;

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Pyramid {
    Point A;
    Point B;
    Point C;
    Point D;
    Point O;

    Pyramid(double sideLength, double height) {
        A = new Point(-sideLength / 2, -sideLength / 2, 0);
        B = new Point(sideLength / 2, -sideLength / 2, 0);
        C = new Point(sideLength / 2, sideLength / 2, 0);
        D = new Point(-sideLength / 2, sideLength / 2, 0);
        O = new Point(0, 0, height);
    }

    void printVertices() {
        System.out.println("Вершины пирамиды:");
        System.out.println("A: (" + A.x + ", " + A.y + ", " + A.z + ")");
        System.out.println("B: (" + B.x + ", " + B.y + ", " + B.z + ")");
        System.out.println("C: (" + C.x + ", " + C.y + ", " + C.z + ")");
        System.out.println("D: (" + D.x + ", " + D.y + ", " + D.z + ")");
        System.out.println("O: (" + O.x + ", " + O.y + ", " + O.z + ")");
    }

    Point getMidHeight() {
        return new Point(0, 0, O.z / 2);
    }

    void sectionThroughSideAndMidHeight() {
        Point midHeight = getMidHeight();
        System.out.println("Средняя точка высоты: (" + midHeight.x + ", " + midHeight.y + ", " + midHeight.z + ")");
        System.out.println("Линия сечения между A и B через среднюю высоту: ");
        System.out.println("Отрезок A (" + A.x + ", " + A.y + ", " + A.z + ")  " +
                "Средняя высота (" + midHeight.x + ", " + midHeight.y + ", " + midHeight.z + ")");
        System.out.println("Отрезок B(" + B.x + ", " + B.y + ", " + B.z + ") " +
                "Средняя высота (" + midHeight.x + ", " + midHeight.y + ", " + midHeight.z + ")");
    }
}

class Main {
    public static void main(String[] args) {
        double sideLength = 4.0;
        double height = 6.0;

        Pyramid pyramid = new Pyramid(sideLength, height);
        pyramid.printVertices();
        pyramid.sectionThroughSideAndMidHeight();
    }
}
