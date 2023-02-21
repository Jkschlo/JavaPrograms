import java.util.Scanner;

public class Assignment3Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user for numerator and denominator
        System.out.print("Enter a numerator: ");
        int num = input.nextInt();
        System.out.print("Enter a denominator: ");
        int denom = input.nextInt();

        //Selection statement to display proper fraction
        if (num < denom) {
        System.out.print(num + " / " + denom + " is a proper fraction");
           
        //Selection statement to display improper fraction and reduced
        } else if (num % denom  == 0) {
        System.out.print(num + " / " + denom + " is an improper fraction");
        System.out.println("and it can be reduced to " + num / denom);

        //Selection statement to display improper fraction andd its mixed fraction
        } else {
        System.out.print(num + " / " + denom + " is an improper fraction ");
        System.out.println("and its mixed fraction is " + num / denom + " + " + num % denom + " / " + denom); 
        }
    }
}
