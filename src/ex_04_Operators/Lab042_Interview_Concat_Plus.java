package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b); //math

        String name1="Aswathy";
        String name2="MK";
        System.out.println(name1+name2); //Concatenation

        // + -> behave differently with the data type.
        // + -> operator overloading

        System.out.println(a+name2);
        System.out.println(name1+a);
        System.out.println(a+b+name1+name2);
        System.out.println(a+name1+name2+b);


    }


}
