package ex_06_Ternary_Operator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {

        //  Finding the Largest Number , n1, n2, 3 => max(n1,n2,n3)
        // Step 1 : Find inputs /oupts
        // n1,n2,n3 -> data type -> int
        // o/p ->  int
        // 100,34,10 ->  100


        // Step 2 :  rough logic
//        n1 >= n2  -> Y1 :  N1
//        Y1 ->  n1 >= n3 : Y (n1) : N (n3)
//        N1 ->  n2 > n3  : Y (n2) : N (n3)

        int n1=4, n2=-1,n3=10;
        int largest=n1>n2?(n1>n3?n1:n3):(n2>n3? n2:n3);
        System.out.println("Largest Number: "+ largest);


    }

}
