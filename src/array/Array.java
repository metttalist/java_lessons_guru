package array;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 12;
        System.out.println("Элемент с индексом 1 = " + arr[1]);
        double[] d_arr = new double[20];
        for (int i = 0; i < d_arr.length; i++){
            d_arr[i] = Math.random() ;
        }
        for (int i = 0; i < d_arr.length; i++){
            System.out.println(d_arr[i]);
        }
        String[] s_arr = {"Dan", "Ban", "Jack"};
        for (int i = 0; i < s_arr.length; i++){
            System.out.println(s_arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("максимальное значение в массиве arr " + max);
        for (int a : arr){
            System.out.println(a);
        }
    }
}
