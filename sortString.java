import java.util.Scanner;
public class sortString {
    public static int sortstr(String a, String b, String c) {
        System.out.println("Here are 3 words: " + a + " " + b + " " + c);
        String str1 = a;
        String str2 = b;
        String str3 = c;
        if(str1.charAt(0) > str2.charAt(0) && str1.charAt(0) > str3.charAt(0) && str2.charAt(0) > str3.charAt(0)) {
            System.out.println("Order Alphabetically: " + str3 + " " + str2 + " " + str1);
            return 0;
        }
        if(str1.charAt(0) < str2.charAt(0) && str1.charAt(0) < str3.charAt(0) && str2.charAt(0) < str3.charAt(0)) {
            System.out.println("Order Alphabetically: " + str1 + " " + str2 + " " + str3);
            return 0;
        }
        if(str1.charAt(0) > str2.charAt(0) && str1.charAt(0) < str3.charAt(0) && str2.charAt(0) < str3.charAt(0)) {
            System.out.println("Order Alphabetically: " + str2 + " " + str1 + " "  + str3);
            return 0;
        }
        if(str1.charAt(0) < str2.charAt(0) && str1.charAt(0) > str3.charAt(0) && str2.charAt(0) > str3.charAt(0)) {
            System.out.println("Order Alphabetically: " + str3 + " " + str1 + " " + str2);
            return 0;
        }
        if(str1.charAt(0) < str2.charAt(0) && str1.charAt(0) < str3.charAt(0) && str2.charAt(0) > str3.charAt(0)) {
            System.out.println("Order Alphabetically: " + str1 + " " + str3 + " " + str2);
            return 0;
        }
        if(str1.charAt(0) > str2.charAt(0) && str1.charAt(0) > str3.charAt(0) && str2.charAt(0) < str3.charAt(0)) {
            System.out.println("Order Alphabetically: " + str2 + " " + str3 + " " + str1);
            return 0;
        }    
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        sortstr(a,b,c);
        in.close();
    }
}
