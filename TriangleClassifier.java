import java.util.*;

public class TriangleClassifier {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a+b>c){
             if((a*a)*(b*b)==c*c){
                System.out.println("right angled triangle");
             }
             else if()
        }
        else {
            System.out.println("invalid");
        }


    }
}