import java.util.Scanner;

public class SpringSeason {
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}
