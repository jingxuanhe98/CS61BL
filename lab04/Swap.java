public class Swap {
    static int counter3 = 0; // static, is a class variable
    int counter = 0;
    int counter2 = 0;

    public static void main(String[] args) {
        Swap s = new Swap();
        int[] arr = {3, 2, 6, 1, 4};
        s.swap(arr, 0); // Should be 3
        s.swap(arr, 0); // Should be 1
    }

    public int swap(int[] arr, int start_index) {
        int counter = 0;
        while (start_index < arr.length - 1) {
            if (arr[start_index] > arr[start_index + 1]) {
                int temporary = arr[start_index];
                arr[start_index] = arr[start_index + 1];
                arr[start_index + 1] = temporary;
                counter++;
                counter2 += 2;
                counter3++;
            }
            start_index++;
        }
        System.out.println("Swapped " + counter + " times.");
        return counter;
    }
}

