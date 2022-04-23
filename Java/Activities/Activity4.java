import java.util.Arrays;

public class Activity4 {
    public static void main(String args[]){

        int[] array={1,5,3,0,7,2,9};
        System.out.println(Arrays.toString(array));
        ascendingSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void ascendingSort(int array[]){
        int arrlength=array.length;
        for(int j=0;j<arrlength-1;j++) {
            for (int i = 0; i < arrlength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int exc = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = exc;
                }
            }
        }
    }
}
