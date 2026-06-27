public class CountDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,4,4,4,5};

        int count = 0;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i] == arr[i+1]){
                count++;
            }
        }

        System.out.println("Duplicate Count = " + count);
    }
}