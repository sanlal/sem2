import java.util.Scanner;

class Triangle {
    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isEquilateral() {
        return a == b && b == c;
    }
}

class Tetrahedron {
    Triangle side1, side2, side3, base;
    double[] centroid = new double[3];

    public Tetrahedron(Triangle side1, Triangle side2, Triangle side3, Triangle base) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        calculateCentroid();
    }

    private void calculateCentroid() {
        centroid[0] = (base.a / 3.0 + side1.a / 6.0 + side2.a / 6.0 + side3.a / 6.0);
        centroid[1] = (base.b / 3.0 + side1.b / 6.0 + side2.b / 6.0 + side3.b / 6.0);
        centroid[2] = (base.c / 3.0 + side1.c / 6.0 + side2.c / 6.0 + side3.c / 6.0);
    }

    public boolean isTetrahedron() {
        return base.isEquilateral() && side1.isEquilateral() && side2.isEquilateral() && side3.isEquilateral();
    }
}

// MODEL A TETRAHEDRON USING TRIANGLES
public class TetrahedronModel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the first triangle: ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        Triangle t1 = new Triangle(a1, b1, c1);

        System.out.println("Enter the three sides of the second triangle: ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        Triangle t2 = new Triangle(a2, b2, c2);

        System.out.println("Enter the three sides of the third triangle: ");
        double a3 = scanner.nextDouble();
        double b3 = scanner.nextDouble();
        double c3 = scanner.nextDouble();
        Triangle t3 = new Triangle(a3, b3, c3);

        System.out.println("Enter the three sides of the base triangle: ");
        double ab = scanner.nextDouble();
        double bb = scanner.nextDouble();
        double cb = scanner.nextDouble();
        Triangle base = new Triangle(ab, bb, cb);

        Tetrahedron tetrahedron = new Tetrahedron(t1, t2, t3, base);

        if (tetrahedron.isTetrahedron()) {
            System.out.println("The given triangles form a tetrahedron.");
        } else {
            System.out.println("The given triangles do not form a tetrahedron.");
        }

        scanner.close();
    }
}
