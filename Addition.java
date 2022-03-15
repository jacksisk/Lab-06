import java.util.*;

public class Addition{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int selection;
        int op1;
        int op2;
        int sum;
        System.out.println("Thank you for using this calculator. Select which operation you would like to make and enter your two operators.\n1. Addition\n2. Subtraction");
        selection = input.nextInt();
        System.out.println("Enter the first integer");
        op1 = input.nextInt();
        System.out.println("Enter the second integer");
        op2 = input.nextInt();
        if(selection == 1){
            sum = op1 + op2;
            System.out.print("The result is " + sum);
            }else{
            sum = op1 - op2;
            System.out.print("The result is " + sum);
            }
    }
}
