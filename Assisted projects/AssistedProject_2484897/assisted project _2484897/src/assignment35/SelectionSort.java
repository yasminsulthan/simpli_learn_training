package assignment35;

public class SelectionSort {
    public static void main(String[] args) {

    int[] arr = {9,6,3,1,2,4,5};
    sort(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.println(i);
         }
     }

    public static void sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int SmallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= SmallNumber;
        }

    }
} 
