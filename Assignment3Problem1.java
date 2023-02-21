import java.util.Scanner;

public class Assignment3Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Prompt user for three integers
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Calculate discriminant and roots
        double discr = ((b*b)-(4.0*(a*c)));
        double root_1 = ((-1*(b)+ (Math.pow(discr, 0.5))) / 2*a);
        double root_2 = ((-1*(b)- (Math.pow(discr, 0.5))) / 2*a);

        //Selection for displaying two roots, one root, or no roots
          if (discr >= 1) {
           System.out.print("The equation has two roots " + root_1 + " and " + root_2);
        } else if (discr == 0) {
           System.out.print("The equation has one root " + root_1);
        } else {
           System.out.print("The equation has no real roots");
        }
    }
}
