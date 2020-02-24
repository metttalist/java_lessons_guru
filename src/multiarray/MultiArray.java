package multiarray;

public class MultiArray {
    public static void main(String[] args) {
        char[][] arr = new char[2][2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        for (int i =0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("Элемент с индексом " + i + ", " + j + " = " + arr[i][j]);
            }
        }
    }
}
