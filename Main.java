import java.util.*;
class reversenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count = count + 1;
            }
        }
        if (count >= 1) {
            System.out.println("it is not prime no");
        } else {
                System.out.println("it is prime");
            }

    }}