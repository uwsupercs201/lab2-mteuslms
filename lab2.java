import java.util.Scanner;
public class lab2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of point 1:");
        double x1 = in.nextDouble();
        System.out.print("Enter the y-coordinate of point 1:");
        double y1 = in.nextDouble();
        System.out.print("Enter the z-coordinate of point 1:");
        double z1 = in.nextDouble();
        System.out.print("Enter the x-coordinate of point 2:");
        double x2 = in.nextDouble();
        System.out.print("Enter the y-coordinate of point 2:");
        double y2 = in.nextDouble();
        System.out.print("Enter the z-coordinate of point 2:");
        double z2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(2,x1 - x2) + Math.pow(2,y1 - y2) + Math.pow(2, z1 - z2));
        System.out.print("The distance between point 1 and point 2 is:" + distance);


    }
}
