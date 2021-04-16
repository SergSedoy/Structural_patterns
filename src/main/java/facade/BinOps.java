package facade;

public class BinOps {
    public String sum(String a, String b) {
        int aDecimal = Integer.parseInt(a, 2);
        // System.out.println("aDecimal = " + aDecimal);
        int bDecimal = Integer.parseInt(b, 2);
        // System.out.println("bDecimal = " + bDecimal);
        // System.out.println(aDecimal + bDecimal);
        return Integer.toBinaryString(aDecimal + bDecimal);
    }

    public String mult(String a, String b) {
        int aDecimal = Integer.parseInt(a, 2);
        // System.out.println("aDecimal = " + aDecimal);
        int bDecimal = Integer.parseInt(b, 2);
        // System.out.println("bDecimal = " + bDecimal);
        // System.out.println(aDecimal * bDecimal);
        return Integer.toBinaryString(aDecimal * bDecimal);
    }
}
