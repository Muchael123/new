import java.util.Scanner;
public class power {
    public static double pow_recussive(double number, int power){
        if (power == 1)
            return number;
        else if (power < 1)
            return 0;
        else
            return number * pow_recussive(number, power-1);
    }
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter it's power: ");
        int pow = scanner.nextInt();
        System.out.println("The pow of " + num + " is "+ pow_recussive(num, pow));
    }
}
