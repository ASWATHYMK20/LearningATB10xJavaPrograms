package ex_10_For_Loop;

public class Lab115 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==5){
                continue;  // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}

//output
//        0
//        1
//        2
//        3
//        4
//        6
//        7
//        8
//        9