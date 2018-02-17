import java.util.Scanner;

public class sumofdigit {
    public static void main(String args[]){
    Scanner Sc;
     {
         int Number,sum=0 ,reminder=0;
         Sc=new Scanner(System.in);
         System.out.println("Enter a  number");
         Number=Sc.nextInt();
         while (Number>0){
             reminder=Number%10;
             sum=sum+reminder;
             Number=Number/10;

         }
         System.out.println("sum of digits is "+sum);
     }

    }
}
