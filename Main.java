import java.util.*;
class ToBinaryCode
{
    public static int toBinary(int decimal)
    {
        int binary= Integer.parseInt(Integer.toBinaryString(decimal));
        return binary;
    }
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        ToBinaryCode ob=new ToBinaryCode();
        System.out.println("Enter the Number for Conversion: ");
        int decimal=rs.nextInt();
        System.out.println(ob.toBinary(decimal));
    }
}
