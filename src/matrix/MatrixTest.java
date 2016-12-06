package matrix;

/**
 * Created by Наталья on 30.10.2016.
 */
public class MatrixTest {
    public static void main(String[] args) {

        Matrix a = Matrix.random(3, 3);
        a.print();
        System.out.println(a.equals(a.transpose().transpose()));


        Matrix e1 = a.transpose();
        e1.print();
    }


}
