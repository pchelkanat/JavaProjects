package matrix;

/**
 * Created by Наталья on 30.10.2016.
 */
public class MatrixTest {
    public static void main(String[] args) {

        Matrix a = Matrix.random(3, 6);
        a.print();
        System.out.println(a.equals(a.transpose().transpose()));

        System.out.println();
        Matrix b = Matrix.random(6, 5);
        Matrix c = a.mult(b);
        c.print();
        System.out.println();
        Matrix d = Matrix.random(3, 6);
        c = a.minus(d);
        c.print();
        System.out.println();
        a.multSc(2);
        a.print();
        System.out.println();
        Matrix e1 = a.transpose();
        e1.print();
    }


}
