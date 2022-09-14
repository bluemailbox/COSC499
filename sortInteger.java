import java.util.Scanner;
public class sortInteger {
    public static int sortint(int a, int b, int c) {
        System.out.println("Here are 3 numbers: " + a + " " + b + " " + c);
        int num1 = a;
        int num2 = b;
        int num3 = c;
        if(num1 > num2 && num1 > num3 && num2 > num3 ) {
            System.out.println("Order ascending: " + num3 + " " + num2 + " " + num1);
            return 0;
        }
        if(num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println("Order ascending: " + num1 + " " +num2 + " " + num3);
            return 0;
        }
        if(num1 > num2 && num1 < num3 && num2 < num3) {
            System.out.println("Order ascending: " + num2 + " " + num1 + " " +num3);
            return 0;
        }
        if(num1 < num2 && num1 > num3 && num2 > num3) {
            System.out.println("Order ascending: " + num3 + " " +num1 + " " + num2);
            return 0;
        }
        if(num1 < num2 && num1 < num3 && num2 > num3) {
            System.out.println("Order ascending: " + num1 + " " + num3 + " " + num2);
            return 0;
        }
        if(num1 > num2 && num1 > num3 && num2 < num3) {
            System.out.println("Order ascending: " + num2 + " " + num3 + " " + num1);
            return 0;
        }
        else {
            return 1;
        }
        
    }
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        sortint(a,b,c);
        in.close();
      }
}


