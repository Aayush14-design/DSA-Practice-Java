import java.util.Scanner;
//Given rows and column we have to find the element at that place in pascal triangle
class Main22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row number");
        int r=sc.nextInt();
        System.out.println("Enter Column number");
        int c=sc.nextInt();
        PascalTriangle1 obj=new PascalTriangle1();
        System.out.println("Element at the given place is "+obj.pascalTriangle1(r-1,c-1));
    }
}
public class PascalTriangle1 {
    int pascalTriangle1(int row, int col){
        int res=1;
        for (int i = 0; i < col; i++) {
            res=res*(row-i);
            res=res/(i+1);
        }
        return res;
    }
}
