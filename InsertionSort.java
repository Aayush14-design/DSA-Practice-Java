import java.util.Scanner;

class Main2{
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
        Main2.display(arr);
        // Insertion Sort
        InsertionSort obj=new InsertionSort();
        obj.insertionSort(arr);
        // display afetr sorting
        Main2.display(arr);

    }
   static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class InsertionSort {
    void insertionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
