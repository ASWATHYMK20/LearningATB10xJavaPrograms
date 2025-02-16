package ex_03_Literals;

public class Lab034_Literals_Char {
    public static void main(String[] args) {
        //Chars-store
        char c1='A';
        //char c2="A"; //String-bunch of char(multiple chars)
        char c2='B';
        char c3='@';
        char c4='_';
        char c5='$';
        char c6='7';
        char c7='(';
        char c8=' '; //blank space


        //Escape char
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';
        System.out.println("Pramod"+"Dutta");
        System.out.println("Pramod"+new_line+"Dutta");
        System.out.println("Pramod"+tab_line+"Dutta");
        System.out.println("Pramod"+back_space+"Dutta");
        System.out.println("Pramod"+carriage_return+"Dutta");

        char c10='A';
        //ASCII (limited numbers)-A->65
        //UNICODE (india,japa,china)-Rupees-₹
        char rupees='₹';
        System.out.println("pramod has"+rupees+ 10);

        char my_laugh_smiley='\u1f60';
        System.out.println(my_laugh_smiley);
        char c11='\u1F60';


    }
}
