import java.util.Arrays;
import java.util.HashMap;

public class ArrayProcessing {
    public static void main(String[] args) {
        int[] arr = {1,8,1,9,2,3,8,6,9,1};
        System.out.println(Arrays.toString(arr));
        ArrayProcessing obj = new ArrayProcessing();
        obj.printDuplicate(arr);
    }
    public void printDuplicate(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i]) && hashMap.get(arr[i])==1) {
                System.out.println(arr[i]);
                hashMap.put(arr[i], hashMap.get(arr[i])+1);

            } else {
                hashMap.put(arr[i], 1);
            }
        }
    }
}


