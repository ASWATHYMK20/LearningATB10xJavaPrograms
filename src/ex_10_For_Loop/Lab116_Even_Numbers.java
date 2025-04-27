package ex_10_For_Loop;

public class Lab116_Even_Numbers {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            if(i%2==0){
            System.out.println("even -> " +i);
                continue;
                      }
            System.out.println(i);
        }

    }
}
//output
//even -> 0
//        1
//even -> 2
//        3
//even -> 4
//        5
//even -> 6
//        7
//even -> 8
//        9
//even -> 10
//        11
//even -> 12
//        13
//even -> 14
//        15
//even -> 16
//        17
//even -> 18
//        19
//even -> 20
//        21
//even -> 22
//        23
//even -> 24
//        25
//even -> 26
//        27
//even -> 28
//        29
//even -> 30
//        31
//even -> 32
//        33
//even -> 34
//        35
//even -> 36
//        37
//even -> 38
//        39
//even -> 40
//        41
//even -> 42
//        43
//even -> 44
//        45
//even -> 46
//        47
//even -> 48
//        49
//even -> 50