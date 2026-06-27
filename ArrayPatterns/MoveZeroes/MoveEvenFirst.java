public class MoveEvenFirst {

    public static void main(String[] args) {

        int[] arr = {5,2,7,8,1,4};

        int[] result = new int[arr.length];
        int index = 0;

        for(int num : arr){
            if(num % 2 == 0){
                result[index++] = num;
            }
        }

        for(int num : arr){
            if(num % 2 != 0){
                result[index++] = num;
            }
        }

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}