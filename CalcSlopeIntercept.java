import java.util.Scanner;

public class Assignment3Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user for 2 sets of coordinates
        System.out.print("Enter the coordinates for two points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Calculate the slope and intercept using x1, y1, x2, and y2
        double m = ((y2 - y1) / (x2 - x1));
        final double b = ((y1)-(m*x1));

        //Selection statements to filter output
        
        //If m = 1, AND b = 0, print y = x
        if (m==1.0 && b==0.0){
            System.out.print("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + "is y = x");
        
        //If b is negative, remove "+"
        }else if (m==1.0 && b < 0.0){
            System.out.print("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + "is y = " + "x " + b);
        
        //If b is positive add "+"
        }else if (m==1.0 && b > 0.0){
            System.out.print("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + "is y = " + "x  + " + b);

        //If b = 0, do't print the intercept
        }else if (b==0.0){
            System.out.print("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + "is y = " + m + "x");
        
        }else
        System.out.print("The line equation for two points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") " + "is y = " + m + "x  + " + b);
    }
}
