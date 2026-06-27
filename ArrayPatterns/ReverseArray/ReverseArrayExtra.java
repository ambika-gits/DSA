public class ReverseArrayExtra {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int[] rev = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-1-i];
        }

        for(int num:rev){
            System.out.print(num+" ");
        }
    }
}