import java.util.*;
class reversenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        if(s==n){
            System.out.println("it is perfect no");
        }
        else{
            System.out.println("it is not perfect");
        }

    }
}