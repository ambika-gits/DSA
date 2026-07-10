public class CheckSortedArray {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted)
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is Not Sorted");
    }
}