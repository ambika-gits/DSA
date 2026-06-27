public class MoveNegative {

    public static void main(String[] args) {

        int[] arr = {2, -1, 5, -3, 8, -7};

        int[] result = new int[arr.length];
        int index = 0;

        // Store negative numbers first
        for(int num : arr){
            if(num < 0){
                result[index++] = num;
            }
        }

        // Store positive numbers
        for(int num : arr){
            if(num >= 0){
                result[index++] = num;
            }
        }

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}