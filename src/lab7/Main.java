package lab7;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(45);
        list.add(345);

        //        int index = scanner.nextInt();
//        System.out.println(list.get(index));
        //Read index from console while the number is greater than the list's size
        // and it's not an Integer.
//        boolean repeat = true;
//        while(repeat) {
//            try {
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Please enter a number: ");
//                int index = scanner.nextInt();
//                System.out.println(list.get(index));
//                repeat = false;
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("The entered index was out of bounds");
//            } catch (InputMismatchException exception) {
//                System.out.println("Must enter a value!");
//            }
//        }
        //Adaugare valori in lista prin input de la console
//        List<Integer> newList = new ArrayList<>();
//
//        for(int i =0; i< 5; i++){
//            try{
//                Scanner scanner = new Scanner(System.in);
//                int value = scanner.nextInt();
//                newList.add(value);
//            } catch (InputMismatchException exception) {
//                System.out.println("Must enter a value!");
//            }
//        }
        Read read = new Read();
        System.out.println("Int: ");
        System.out.println(read.readInt());

        System.out.println("Byte: ");
        System.out.println(read.readByte());

        System.out.println("Short: ");
        System.out.println(read.readShort());

        System.out.println("Long: ");
        System.out.println(read.readLong());

        System.out.println("Float: ");
        System.out.println(read.readFloat());

        System.out.println("Double: ");
        System.out.println(read.readDouble());

        System.out.println("Char: ");
        System.out.println(read.readChar());

    }
}


