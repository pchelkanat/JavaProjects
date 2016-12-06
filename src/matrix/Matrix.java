package matrix;

/**
 * Created by Наталья on 30.10.2016.
 */

public class Matrix {
    public int[][] matrix;
    public int n;
    public int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
    }
//Рандомное заполнение
    public static Matrix random(int n, int m) {
        Matrix a = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a.matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return a;
    }

    public Matrix plus(Matrix b) {
        Matrix a = this;
        if (b.n != a.n || b.m != a.m) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }
        Matrix c = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return c;
    }

    public Matrix minus(Matrix b) {
        Matrix a = this;
        if (b.n != a.n || b.m != a.m) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }
        Matrix c = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];
            }
        }
        return c;
    }

    //умножение матриц
    public Matrix mult(Matrix b) {
        Matrix a = this;
        if (a.m != b.n) {
            throw new RuntimeException("Illegal matrix dimensions.");
        }
        Matrix c = new Matrix(a.n, b.m);
        for (int i = 0; i < c.n; i++) {
            for (int j = 0; j < c.m; j++) {
                for (int k = 0; k < a.m; k++) {
                    c.matrix[i][j] += (a.matrix[i][k] * b.matrix[k][j]);
                }
            }
        }
        return c;
    }

    //умножение матрицы на число
    public Matrix multSc(int s) {
        Matrix a = this;
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.m; j++) {
                a.matrix[i][j] *= s;
            }
        }
        return a;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //транспонирование
    public Matrix transpose() {
        Matrix b = this;
        Matrix a = new Matrix(b.m, b.n);
        for (int i = 0; i < b.m; i++) {
            for (int j = 0; j < b.n; j++) {
                a.matrix[i][j] = b.matrix[j][i];
            }
        }
        return a;
    }

    /*дополнить через swap*/

    public boolean equals(Matrix b) {
        Matrix a = this;
        if (a.n != b.n || a.m != b.m) {
            return false;
        }
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.m; j++)
                if (a.matrix[i][j] != b.matrix[i][j]) {
                    return false;
                }
        }
        return true;
    }
}


