package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone_no=9876543210l;
         //short s=phone_no; // Implicit not possible
         short s=(short) phone_no; //Explicit
    }
}
