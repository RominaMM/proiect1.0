package Lab2;

public class Main {


    public static void main(String[] args) {

        int x = sum(15, 89);
        System.out.println(x);

        int y=dif(100, 20);
        System.out.println(y);

        float z=divide(3.5f, 4);
        System.out.println(z);

        int w=multipl(6, 5);
        System.out.println(w);

        printJava();

        System.out.println(calcul(2,3,4));


    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;

    }
    public static int dif(int first, int second){
        int dif = first - second;
        return dif;
    }
    public static float divide(float first, float second){
        float divide= first/second;
        return divide;
    }
    public static int multipl(int first, int second){
        int multipl = first * second;
        return multipl;
    }

    public static void printJava(){
        System.out.println("   J     a       v     v   a");
        System.out.println("   J    a  a      v   v   a  a");
        System.out.println("J  J   aaaaaa      v v   aaaaaa");
        System.out.println(" JJ   a      a      v   a      a");

    }

    public static int calcul(int a, int b, int c) {
        int  k= a + b + c;
        int  calcul = k / 3;
        return calcul;
    }




}

