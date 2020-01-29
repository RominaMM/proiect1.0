package lab4;

import lab4.LogicalOP;

import javax.crypto.spec.PSource;

public class Main {



    public static void main (String[] args) {
        System.out.println("Exercitiul 3:");
        LogicalOP Logic = new LogicalOP();
        System.out.println("The greater number is: " + Logic.checkBiggerNumber(10, 6));

        System.out.println("Exercitiul 4:");
        LogicalOP op = new LogicalOP();
        System.out.println(op.textComparation("FastTrackJ"));


        System.out.println("Exercitiul 5:");
        String text = "FastTrackIT";
        System.out.println(Logic.exercitiul5(text, 4));
        System.out.println("Exercitiul 6:");
        System.out.println(Logic.exercitiul6(3));
        System.out.println("Exercitiul 7:");
        System.out.println(Logic.exercitiul7(3));
        System.out.println("Exercitiul 9: ");
        System.out.println("Is this number even : " + Logic.isNumberEven(4));
        System.out.println("Exercitiul 10: ");
        System.out.println("Is elegible for vote: " + Logic.isEligibleToVote(19));
        System.out.println("Exercitiul 11: ");
        System.out.println("The highest number is: " + Logic.exercitiul11(20, 9, 22));


///// Lab 4: CURS
        op.printEvenNumbers(0);

////Tema Lab4: FOR

        op.printToHundredEx1(70);

        op.printToHundredEx2(-1);

        op.printEx3(25, 32);

        op.printEx4(1, 14);

        op.printEx5(0);

        op.printEx6(0);

        System.out.println("Exercitiu 7: "+ op.exercitiu7(0) );

        System.out.println("Exercitiu 8: " + op.exercitiu8(0, 100) );

        op.exercitiu9();


        ///TEMA LAB 4: WHILE


        op.exWhile1( 90);


        op.exWhile2(-80);


        op.exWhile3(5,10);


        op.exWhile4(5, 10);


        op.exWhile5();


        op.exWhile6();


        op.exWhile7();


        System.out.println(op.exWhile8(1,30));


        op.exWhile9();


        op.exWhile10();




    }







    }








