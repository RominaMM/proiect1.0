package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public int readInt() {
        boolean repeat = true;
        int number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }


    public byte readByte() {
        boolean repeat = true;
        byte number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextByte();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public short readShort() {
        boolean repeat = true;
        short number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextShort();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public long readLong() {
        boolean repeat = true;
        long number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public float readFloat() {
        boolean repeat = true;
        float number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public double readDouble() {
        boolean repeat = true;
        double number = 0;
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public char readChar() {
        boolean repeat = true;
        char number = 'K';
        while (repeat) {
            try {
                System.out.print("Please enter a number: ");
                Scanner scanner = new Scanner(System.in);
                number = scanner.next().charAt(0) ;
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid value, please enter a number: ");
            } finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }
}






