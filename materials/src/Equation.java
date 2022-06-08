import static java.lang.Math.sqrt;

/**
 * Программа, находящая корни квадратного уравнения
 */
public class Equation {

    public static void main(String[] args) {

        double a, b, c;

        a = 1;
        b = -8;
        c = 15;

        double D = (b * b) - (4 * a * c);

        double x1 = (-1 * b + sqrt(D)) / (2 * a);

        if (D > 0) {
            double x2 = (-1 * b - sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else if (D == 0) {
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("There is no roots");
        }

    }

}
