package ex_14_Strings;

public class Lab138_Interview_Q2 {
    public static void main(String[] args) {

        String s1 = "Hello"; // SCP = 1
        String s4 = "Hello"; // 1

        String s2 = new String("Hello"); // OA
        String s3 = new String("Hello");
        String s5 = new String("hello"); //  OA = 3

        // == ?  Comparsion -> Strings -> This check the locations ref.
        System.out.println(s1==s3);  //false
        System.out.println(s1==s2);  //false
        System.out.println(s2==s3);  //false

        System.out.println(s1 == s4); //true
        System.out.println(s3 == s5); //false



     // equals ( content) -> value
     // How can I check the values? equals == value
        System.out.println(s1.equals(s2));  //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s3.equals(s5));  //false
        System.out.println(s3.equalsIgnoreCase(s5));  //true


        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD


    }
}
