public class Main {
    public static void main(String[] args) {
        int startCheck = 100;
        int topUpCheck = 1100;
        int total;
        if (topUpCheck > 1000) {
            total = topUpCheck/100+topUpCheck+startCheck;
        } else {
            total = topUpCheck+startCheck;
        }
        System.out.println(total);
    }
}