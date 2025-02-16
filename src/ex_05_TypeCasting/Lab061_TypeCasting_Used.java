package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        // GST 18.45
        int course=100;
        float GST=18.45f;
        // int total_int = course+GST; // Narrowing - Implicit ---This is not possible
        int total_int = course+(int)GST; // Narrow - Explicit
        float total = course+GST; // Widenning - implicit
        float total2 = (float) course+GST; // Widenning - Explicit
        System.out.println(total_int);
        System.out.println(total);
        System.out.println(total2);

    }
}
