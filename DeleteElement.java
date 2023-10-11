import java.util.Scanner;
import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {0,1,2,3,4,5,6,7};
        System.out.println("Nhap vi tri can xoa :");
        int index = scanner.nextInt();
        arr = clearElement(arr, index);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] clearElement(int[] array,int index) {
        int n = array.length;
        if(index >= n){
            return array;
        }
        int[] temp = new int[n-1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(i == index) {
                continue;
            }
            temp[k] = array[i];
            k++;
        }
        return temp;
    }
}
