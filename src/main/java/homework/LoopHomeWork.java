package homework;

public class LoopHomeWork {
    public static void main(String[] args) {
        //1.udevums - while cikls
        int i=1;
        while (int i>100){
            System.out.println(i);
        } else {
            System.out.println("the number is less than 100");
        }
    // 2.udevums - pirmskaitli
         int num;

        if ( num % 2 == 0 )System.out.println("Entered number is even");
        System.out.println("Entered number is odd");
    }

    // 3.uzdevums - datu masivi
    int [] money={1,2,3,4,5};
    String [] cats={"Tom","Jerry","Roofy","Mila"};
    char [] characters={'a','b','c','d','e'};

    for(String i : cats) {
        System.out.println(i);
    }
    int index=0;
    while(index<money.length) {
        System.out.println(numbers.index);
    }

    //4.uzdevums - array 100 izmers
    int[] days = new int[100];

    if ( days % 2 == 0 )System.out.println(days);

}

}
