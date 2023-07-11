package sorting;


public class insertion {
    public static void printArray( int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
    int arr[] = {7,9,0,3,2,12,34,45,32,21,45,23,123,343213,3242342};
    // time complexity = O(n^2)
    //bubble sort
    for(int i=0; i<arr.length; i++){
        int cureent = arr[i];
        int j = i-1;
        while(j >=0 && cureent < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }

        //placement
        arr[j+1] = cureent;
    }
    printArray(arr);
}
}
