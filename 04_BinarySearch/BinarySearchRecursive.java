public class BinarySearchRecursive {

    static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] > target)
            return binarySearch(arr, left, mid - 1, target);

        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25, 30};

        int index = binarySearch(arr, 0, arr.length - 1, 25);

        System.out.println("Element found at index " + index);
    }
}