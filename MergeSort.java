import java.util.Scanner;
import java.util.Vector;

class Main3{
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
        Main3.display(arr);
        //Merge Sort
        MergeSort obj=new MergeSort();
        obj.mergeSort(arr,0, arr.length-1);
        // display afetr sorting
        Main3.display(arr);
    }
    static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class MergeSort {
    void mergeSort(int arr[],int low,int high){
        if (low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void merge(int arr[],int low,int mid,int high){
        Vector<Integer> temp=new Vector<>();
        int left=low;
        int right=mid+1;
        while (left<=mid&&right<=high){
            if (arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <=high; i++) {
            arr[i]= temp.get(i-low);
        }
    }
}
