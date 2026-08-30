import java.util.Scanner;

class Main5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //insertion
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the value of index "+i+" ");
            arr[i]= sc.nextInt();
        }
        //display intial array
        Main5.display(arr);
        // Insertion Sort
        RecursiveInsertionSort obj=new RecursiveInsertionSort();
        obj.recursiveInsertionSort(arr, arr.length,0);
        // display afetr sorting
        Main5.display(arr);

    }
    static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class RecursiveInsertionSort {
    void recursiveInsertionSort(int arr[],int size,int i){
        if (size==0){
            return;
        }
        int j=i;
        while (j>0&&arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        recursiveInsertionSort(arr,size-1,++i);
    }
}
