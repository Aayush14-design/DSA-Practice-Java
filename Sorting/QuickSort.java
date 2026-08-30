import java.util.Scanner;

class Main6{
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
        Main6.display(arr);
        // Insertion Sort
        QuickSort obj=new QuickSort();
        obj.quickSort(arr,0, arr.length-1);
        // display afetr sorting
        Main6.display(arr);

    }
    static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class QuickSort {
    void quickSort(int arr[],int low,int high){
        if (low<high){
            int partition=function(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }

    }
    int function(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){
            while (arr[i]<=pivot&&i<=high-1){
                i++;
            }
            while (arr[j]>pivot&&j>=low+1){
                j--;
            }
            if (i<j) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
}
