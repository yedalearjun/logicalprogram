import java.util.*;
class NewtonsSquareRoot
{
    public static double sqrt(double root)
    {
        double t=root;
        if(root<0)
            System.out.println("Please enter Non-Negitive Number: ");
        else
        {
            double epsilon = 1e-15;
            while(Math.abs(t-root/t)>epsilon*t)
                t=(root/t+t)/2.0;
        }
        return t;
    }
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        NewtonsSquareRoot ob=new NewtonsSquareRoot();
        System.out.println("Enter the Number: ");
        double root=rs.nextDouble();
        System.out.println(ob.sqrt(root));
    }
}