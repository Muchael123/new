import java.util.Scanner;
public class factorial {
    public static int fact_recussive(int a){
        if(a<= 1)
            return 1;
        return (a) * fact_recussive(a-1);
    }
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int fact = scanner.nextInt();
        System.out.println("The factorial of " + fact + " is " + fact_recussive(fact));
    }
}
