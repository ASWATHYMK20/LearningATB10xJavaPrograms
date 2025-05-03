package ex_13_Functions;

import java.util.Scanner;

public class Lab127_User_Defined_One {
    public static void main(String[] args) {


        // User Defined Functions.

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type


        // 1.Without Argument / Parameters and Without Return Type.
        //greet();


        //  2. Without Parameters but With Return Type
//        String s= greet_with_hello();
//        System.out.println(s);
//        int age_to_vote_person=age_to_vote();
//        System.out.println("Age to vote is -> " + age_to_vote_person);
//        greet_with_hello();



        //  3. With Parameters and Without Return Type ( 90%)
//        greet_with_name("Aswathy");
//        greet_with_name("Elena");
//
//        greet_with_fullname("Pramod","Dutta");
//        greet_with_fullname("Laiba","khan");

//         greet_with_details("Aswathy",27,350000.0);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your name");
//        String name= sc.next();
//        System.out.println("Enter Your age");
//        int age= sc.nextInt();
//        System.out.println("Enter Your salary");
//        Double salary=sc.nextDouble();
//        greet_with_details(name,age,salary);

        //  4. With Parameters and With Return Type
        int sum1=sum_of_two_numbers(23,25);
        int sum2=sum_of_two_numbers(113,225);
        int sum3=sum_of_three_numbers(78,12,45);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        int result = Math.max(3,4); // 4th Type

    }


        // 1.Without Argument / Parameters and Without Return Type. (Declare) /Define
                static void greet() {
                    System.out.println("Hi, How are you?");

                }
         //  2. Without Parameters but With Return Type
         static String greet_with_hello(){
        return "Hi, How are you, example 2";
         }

         static int age_to_vote(){
             System.out.println("calculating age...");
             return 18;
         }



    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_name(String name){
        System.out.println("Hi, Your name is " + name);

    }

    static void greet_with_fullname(String first_name,String last_name){
        System.out.println("Your full name is " + first_name +last_name);
    }

    static void greet_with_details(String name, int age, Double salary){
        System.out.println("Your name is " + name +"\nYour age is  " + age +"\nYour salary is " + salary);
    }

    //  4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a,int b){
        return a+b;

    }

    static int sum_of_three_numbers(int a,int b,int c){
        return a+b+c;

    }


}
