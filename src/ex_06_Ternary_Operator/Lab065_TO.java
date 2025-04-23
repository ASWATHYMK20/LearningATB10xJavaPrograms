package ex_06_Ternary_Operator;

public class Lab065_TO {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        // X and Y -> Max X, y -> Ternary Op.

        int x=10;
        int y=20;
        int max=x>y ? x:y;
        String max1= x>y? "x is max" :"y is max";
        System.out.println(max);
        System.out.println(max1);

    }

}
