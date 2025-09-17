public class FibonacciFormula {
    public static void main(String[] args) {
        for(int i = 0; i <= 12; i++) {
            System.out.println(fiboFormula(i)); // should print 21
        }
    }

    static int fiboFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;

        return (int) Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }
}
