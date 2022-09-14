import java.util.Scanner;
public class sortint {
    public static int sortInt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1 > num2 && num1 > num3 && num2 > num3 ) {
            System.out.println("Order ascending: " + num3 + num2 + num1);
            return 0;
        }
        if(num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println("Order ascending: " + num1 + num2 + num3);
            return 0;
        }
        if(num1 > num2 && num1 < num3 && num2 < num3) {
            System.out.println("Order ascending: " + num2 + num1 + num3);
            return 0;
        }
        if(num1 < num2 && num1 > num3 && num2 > num3) {
            System.out.println("Order ascending: " + num3 + num1 + num2);
            return 0;
        }
        if(num1 < num2 && num1 < num3 && num2 > num3) {
            System.out.println("Order ascending: " + num1 + num3 + num2);
            return 0;
        }
        if(num1 > num2 && num1 > num3 && num2 < num3) {
            System.out.println("Order ascending: " + num2 + num3 + num1);
            return 0;
        }
        else {
            return 1;
        }
        
    }
    public static void main(String[] args) {
        sortInt();
      }
      
}

