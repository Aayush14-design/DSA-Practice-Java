import java.util.Scanner;

 class Main {
     public static void main(String[] args) {

          int arr[]=null;

         Scanner sc = new Scanner(System.in);
         boolean flag = true;

         while (flag) {
             System.out.println("\n1. Enter the elements in the array");
             System.out.println("2. Do Selection Sort");
             System.out.println("3. Display");
             System.out.println("4. Exit");
             System.out.println("Enter your choice");

             int choice = sc.nextInt();

             SelectionSort obj = new SelectionSort();

             switch (choice) {
                 case 1:
                     System.out.println("Enter size of an array");
                     int n = sc.nextInt();

                     arr = new int[n];

                     for (int i = 0; i < n; i++) {
                         System.out.println("Enter the value of index " + i + "=");
                         arr[i] = sc.nextInt();
                     }
                     break;

                 case 2:
                     if (arr==null){
                         System.out.println("Please enter Elements in an array");
                     }
                     else {
                         obj.sort(arr);
                     }
                     break;
                 case 3:
                     if (arr==null){
                         System.out.println("Please enter Elements in an array");
                     }
                     else {
                         obj.display(arr);
                     }
                     break;
                 case 4:
                     flag = false;
                     break;

                 default:
                     System.out.println("Please Enter between 1 to 4 only");
             }
         }

         sc.close();
     }
 }

     class SelectionSort {

        void display(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        void sort(int arr[]) {
            for (int i = 0; i < arr.length - 1; i++) {
                int mini = i;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[mini]) {
                        mini = j;
                    }
                }

                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
            System.out.println("Sorted successfully");
        }
    }
