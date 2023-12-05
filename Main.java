import java.util.*;
 class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int s=0;
        System.out.println("enter the the number till you want the series");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(s+" ");
            s=a+b;
            b=a;
            a=s;
        }
    }
}