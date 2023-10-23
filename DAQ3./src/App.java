import java.util.Scanner;

abstract class GeometricObject {
    String color;
    boolean filled;

    abstract void getArea(double side1, double side2, double side3);
    abstract void getperimeter(double side1, double side2, double side3);
}

class Triangle extends GeometricObject {
    double side1;
    double side2;
    double side3;

    Triangle (double s1, double s2, double s3, String col, boolean fill) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        color = col;
        filled = fill;
    }

    @Override void getArea (double side1, double side2, double side3) {
        double s = (side1+side2+side3)/2;
        double exp = s*(s-side1)*(s-side2)*(s-side3);
        System.out.println("Area is " + Math.sqrt(exp));
    }

    void getperimeter (double side1, double side2, double side3) {
        double sum = side1+side2+side3;
        System.out.println("Perimeter is " + sum);
    }
}

class Rectangle extends GeometricObject {
    double length;
    double width;

    Rectangle (double l, double w, String col, boolean fill) {
        length = l;
        width = w;
        color = col;
        filled = fill;
    }

    void getArea (double length, double width, double side3) {
        System.out.println("Area is " + length*width);
    }

    void getperimeter (double length, double width, double side3) {
        double sum = 2*(length+width);
        System.out.println("Perimeter is " + sum);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the color of triangle");
        String colT = sc.nextLine();
        System.out.println("Enter sides of triangle");
        double s1 = sc.nextInt();
        double s2 = sc.nextInt();
        double s3 = sc.nextInt();
        System.out.println("Enter is filled?");
        boolean fillT = sc.nextBoolean();

        System.out.println("Enter the color of triangle");
        String colR = sc.nextLine();
        System.out.println("Enter sides of Rectangle");
        double l = sc.nextInt();
        double w = sc.nextInt();
        System.out.println("Enter is filled?");
        boolean fillR = sc.nextBoolean();

        Triangle t = new Triangle(s1, s2, s3, colT, fillT);
        Rectangle r = new Rectangle(l, w, colR, fillR);

        System.out.println("\nTriangle details");
        t.getArea(s1, s2, s3);
        t.getperimeter(s1, s2, s3);

        System.out.println("\nRectangle details");
        r.getArea(l, w, 0);
        r.getperimeter(l, w, 0);
    }
}
