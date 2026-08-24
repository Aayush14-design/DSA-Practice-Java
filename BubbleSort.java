import java.util.Scanner;

class  Main1{
    public static void main() {
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
        Main1.display(arr);
        // bubblesort
        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(arr);
        // display after sorting
        Main1.display(arr);
    }
    static void display(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class BubbleSort {
    void bubbleSort(int arr[]){
        for (int i= arr.length-1;i>=1;i--){
            int didswap=0;
            for (int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didswap=1;
                }
            }
            if (didswap==0){
                break;
            }
        }
    }
}
