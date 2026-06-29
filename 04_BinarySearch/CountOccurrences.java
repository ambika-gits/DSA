public class CountOccurrences {

    static int firstOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1, answer = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    static int lastOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1, answer = -1;

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

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8};
        int target = 4;

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first == -1)
            System.out.println("Count = 0");
        else
            System.out.println("Count = " + (last - first + 1));
    }
}