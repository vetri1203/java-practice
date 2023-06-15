import java.util.Arrays;

public class MajarityElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,2,2,3,4,};


        Arrays.sort(arr);

        int num = arr[(arr.length-1)/2];

        System.out.print(num);
    }
}