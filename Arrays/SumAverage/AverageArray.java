public class AverageArray {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        double average = (double)sum / arr.length;

        System.out.println("Average = " + average);
    }
}