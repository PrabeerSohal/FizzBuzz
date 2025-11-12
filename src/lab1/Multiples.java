package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000,3,5));

    }

    public static int multiples(int n, int a, int b) {
        if(a == b){
            return (n-1)/a;
        }
        else {
            int count3 = (n-1)/a;
            int count5 = (n - 1) / b;
            int count15 = (n - 1) / (a * b);
            return count3 + count5 - count15;
        }

    }
    public static int multiples() {

        int count3 = (1000 - 1) / 3;
        int count5 = (1000 - 1) / 5;
        int count15 = (1000 - 1) / (3 * 5);
        return count3 + count5 - count15;
    }
}
