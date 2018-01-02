package ASD;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {3,6,1,7,2,8,10,4,9,5};
        int n = numbers.length;
        quicksort(numbers, 0, n-1);
        for (int h = 0; h < n; h++)
            System.out.print(numbers[h]+ " ");
    }

    public static void quicksort(int[] numbers, int low, int high) {
        if (low < high) {
            int dp = partition(numbers, low, high);
            quicksort(numbers, low, dp-1);
            quicksort(numbers, dp+1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[low];
        int i = low;
        for (int j = low + 1; j <= high; j++)
            if (numbers[j] < pivot) {
                ++i;
                swap(numbers, i, j);
            }
        swap(numbers, low, i);
        return i;
    }
    
    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
