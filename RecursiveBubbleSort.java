import java.util.Scanner;

class Main4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        // add elements
        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the value of index "+i+" ");
            arr[i]=sc.nextInt();
        }
        // display intial array
        Main4.display(arr);
        // bubblesort
        RecursiveBubbleSort obj=new RecursiveBubbleSort();
        obj.recursiveBubbleSort(arr, arr.length);
        // display after sorting
        Main4.display(arr);
    }
    static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class RecursiveBubbleSort {
    void recursiveBubbleSort(int arr[],int size){
        if (size==1) {
            return;
        }
        for (int i = 0; i < size-1; i++) {
            if (arr[i]>arr[i+1]) {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }
        recursiveBubbleSort(arr,size-1);
    }
}
