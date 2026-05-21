public class ProductDigits {

    static int product(int n) {

        if (n == 0)
            return 1;

        return (n % 10) * product(n / 10);
    }

    public static void main(String[] args) {

        int num = 234;

        System.out.println("Product = " + product(num));
    }
}