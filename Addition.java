import java.util.*;

public class Addition {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int op1;
        int op2;
        int sum;
        System.out.println("Thank you for using this addition calculator. Enter the two integers you would like to add.\nEnter the first integer");
        op1 = input.nextInt();
        System.out.println("Enter the second integer");
        op2 = input.nextInt();
        sum = op1 + op2;
        System.out.print("The sum is " + sum);
    }
}
