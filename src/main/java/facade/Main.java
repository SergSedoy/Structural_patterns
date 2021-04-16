package facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("101010", "01111110"));
        System.out.println(bins.mult("101010", "01111110"));
    }
}
