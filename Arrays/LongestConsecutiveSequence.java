import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        // data entry loop
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter the value of index "+i);
            arr[i]= sc.nextInt();
        }
        // display elements
        display(arr);
        //Finding longest consecutive sequence
        LongestConsecutiveSequence obj=new LongestConsecutiveSequence();
        int length =obj.longestConsecutiveSequence(arr);
        System.out.println("LongestConsecutiveSequence is "+ length);
    }
    static   void display(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class LongestConsecutiveSequence {
    int longestConsecutiveSequence(int arr[]){
        if (arr.length==0) {
            return 0;
        }
        Arrays.sort(arr);
        int lastSmaller=Integer.MIN_VALUE;
        int cut=0;
        int longest=1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1==lastSmaller){
                cut++;
                lastSmaller=arr[i];
            } else if (arr[i]!=lastSmaller) {
                cut=1;
                lastSmaller=arr[i];
            }
            longest=Math.max(longest,cut);
        }
        return longest;
    }
}
