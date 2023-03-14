import  java.util.Scanner;
public class gcd {
    public static int gcd_recussive(int a, int b){
        if (b == 0)
            return a;
        else
            return gcd_recussive(b, a%b);
    }
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int y = scanner.nextInt();
        System.out.println("Enter the second number");
        int z = scanner.nextInt();
        System.out.println( gcd_recussive(y,z));
    }
}
