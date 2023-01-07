import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = 0;
        int pw= 1; // 10^0=1

        while (n>0)
        {
            int unit_digit=n%2;
            ans =ans +(unit_digit*pw);
            n=n/2;
            pw=pw*10;
        }
        System.out.println(ans);
    }
}
