package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Lista 1 (Stringuri)
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("Everybody");
        myList.add("Hey");
        myList.get(0); // get print index
       // myList.remove("Hello"); // remove obiect
       // myList.remove(1);

       //Lista 2 (inturi)
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(2);

    // Ex 1
        LogicalOP logicalOP = new LogicalOP();
        logicalOP.addValue(list2, 10);
        logicalOP.addValue(list2, 20);
        System.out.println("Ex 1: ");
        System.out.println(list2);

        //Ex 2
        System.out.println("Ex 2: " );
        logicalOP.printList(myList);

        //Ex 3
        System.out.println("Ex 3: ");
        logicalOP.printEx3(myList, 2);

        //Ex 5
        System.out.println(" Ex 5: " );
        logicalOP.printEx5(myList, 0,"Ciao");
    }








}
