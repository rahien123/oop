import java.util.Scanner;

public class IntegerToBinaryString {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        System.out.println(s);
    }
}
