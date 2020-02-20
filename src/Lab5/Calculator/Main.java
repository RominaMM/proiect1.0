package Lab5.Calculator;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {

        int[] array = {8, -2, 6, 19};
        LogicalOP op = new LogicalOP();

        //Ex 1
        System.out.println("Ex 1: ");
        System.out.println(op.secondSmallestnumb(array));

        //Ex2
        System.out.println("Ex 2: ");
        op.insertElement(array, 2, 40);

        // Ex 3
        int[] array2 = new int[]{8, -2, 6, 19, 14};
        System.out.println("\nEx 3:" );
        op.findNumber(array2);



      // int last;
     //   for (last =( array.length)-1; last>=0; last-- );
       // System.out.println(array.length);

        //Ex 4
        int[] array3 = new int[] {14 , 17, 3, 6, 5};
        System.out.println("\nEx 4:" );
        op.reverseNumbers(array3);
   }





}








