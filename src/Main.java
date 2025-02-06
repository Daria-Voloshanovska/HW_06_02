/* В математике факториал обозначается символом '!'.
И означает произведение всех чисел от 1 и до заданного числа.
Например: 5! = 1*2*3*4*5
1! = 1
9! = 1*2*3*4*5*6*7*8*9
Напишите рекурсивный метод, который считает факториал.
 */


public class Main {
    public static void main(String[] args) {
        int number = 9;
        System.out.println("Factorial " + number + " = " + factorial(number));

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}