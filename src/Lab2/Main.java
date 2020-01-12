package Lab2;

public class Main {


    public static void main(String[] args) {

        int x = sum(15, 89);
        System.out.println(x);

        int y=dif(100, 20);
        System.out.println(y);

        float z=divide(3.5f, 4);
        System.out.println(z);
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
}
