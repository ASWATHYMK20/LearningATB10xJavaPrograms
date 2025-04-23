package ex_06_Ternary_Operator;

import java.sql.SQLOutput;

public class Grade_Calculator {
    public static void main(String[] args) {

        //Grade calculator using ternary operator
        int Grade=61;
        String result= Grade>89? "A":(Grade>79?"B":(Grade>69?"C":(Grade>59?"D":"F")));
        System.out.println(result);

    }


}
