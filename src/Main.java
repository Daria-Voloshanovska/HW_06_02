/* В математике факториал обозначается символом '!'.
И означает произведение всех чисел от 1 и до заданного числа.
Например: 5! = 1*2*3*4*5
1! = 1
9! = 1*2*3*4*5*6*7*8*9
Напишите рекурсивный метод, который считает факториал.
 */


public class Main {
    public static void main(String[] args) {
        int numberFactorial = 9;
        int numberFibonacci = 7;
        System.out.println("Factorial " + numberFactorial + " = " + factorial(numberFactorial));
        System.out.println("Fibonacci number " + numberFibonacci + " = " + fibonacci(numberFibonacci) );

        System.out.println("fibonacci(0) -> " + fibonacci(0));
        System.out.println("fibonacci(5) -> " + fibonacci(5));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n){
        if (n>=0 && n<=2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
