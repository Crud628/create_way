package Day05_Search_Mid;

public class MinArray {
    public int minArray(int[] numbers) {
//        int end = numbers[numbers.length-1];
//        for (int i = numbers.length - 1;i >= 0;i--) {
//            if (numbers[i] > end) {
//                return numbers[i+1];
//            }
//            end = numbers[i];
//        }
//        return numbers[0];
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
