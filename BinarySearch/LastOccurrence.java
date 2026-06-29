public class LastOccurrence {

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8};
        int target = 4;

        int left = 0, right = arr.length - 1;
        int answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Last Occurrence = " + answer);
    }
}