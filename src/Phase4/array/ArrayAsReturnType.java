package Phase4.array;

public class ArrayAsReturnType {
    public int[] display() {
        int[] num = {1, 2, 3, 4, 5};
        return num;
    }
    public void show(int [][] x ){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int [][] sum(int [][] x, int [][] y ){
        int [][] z = new int[x.length][x[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
    }
}
