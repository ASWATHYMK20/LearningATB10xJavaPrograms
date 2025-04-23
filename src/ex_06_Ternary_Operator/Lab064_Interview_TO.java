package ex_06_Ternary_Operator;

public class Lab064_Interview_TO {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int number=15;
        String result=number>10? (number>20?"Greater than 20":"Between 10 and 15"):"Less than 10";
        // (number>20?"Greater than 20":"Between 10 and 15") -> Between 10 and 15
        System.out.println(result);
    }

}
