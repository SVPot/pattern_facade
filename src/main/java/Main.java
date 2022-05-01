public class Main {
    public static void main(String[] args) {
        String a = "10101";
        String b = "1111";

        BinOps bins = new BinOps();

        System.out.println(bins.mult(a, b));
        System.out.println(bins.sum(a, b));
    }
}