package ex_13_Functions;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab129_task_edgecases_chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1");
        BigInteger a = sc.nextBigInteger();

        System.out.println("Enter the num2");
        BigInteger b = sc.nextBigInteger();

        BigInteger result_sum = sum(a, b);
        BigInteger result_sub = sub(a, b);
        BigInteger result_mul = mul(a, b);
        BigInteger result_modulus = modulus(a, b);
        BigInteger result_div = div(a, b);

        System.out.println("Sum: " + result_sum);
        System.out.println("Subtraction: " + result_sub);
        System.out.println("Multiplication: " + result_mul);
        System.out.println("Modulus: " + result_modulus);
        System.out.println("Division: " + result_div);
    }

    static BigInteger sum(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    static BigInteger sub(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    static BigInteger mul(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    static BigInteger modulus(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            System.out.println("Modulus by zero is not allowed!");
            return BigInteger.ZERO;
        }
        return a.mod(b);
    }

    static BigInteger div(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            System.out.println("Division by zero not allowed!");
            return BigInteger.ZERO;
        }
        return a.divide(b);
    }
}
