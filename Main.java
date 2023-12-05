import java.util.*;
class temprture{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n 1 for celsius to fahrenheit and 2 for fahrenheit to celsius");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("enter your tempratue in celsius");
            int c=sc.nextInt();
            double f1=((c*1.8)+32);
            f1=(int)f1;
            System.out.println("you temprature in fahrenheit is :"+f1);}
        else if (n==2){
            System.out.println("enter your temp in fahrenheit is");
            int f= sc.nextInt();
            double c1=(f-32)*(0.55);
            c1=(int)c1;
            System.out.println("your tempratur in celsius is :"+c1);
        }
        }

    }
