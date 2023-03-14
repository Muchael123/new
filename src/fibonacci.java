import  java.util.Scanner;
public class fibonacci {
    public static  int fib_recussive(int a){
       if(a>2) //or (a>=3)
            return fib_recussive(a-1) + fib_recussive(a-2);
        return a;
    }
    public static  void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int  fib = scanner.nextInt();
       System.out.println("The fibonacci of " + fib + " is: " + fib_recussive(fib));
    }
}
